package cruzeirao.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

/**
 * @author Gabriel Belchior
 * Abstrai a lógica de persistência de dados do resto do código da aplicação.
 * @param <T> Tipo da entidade a ser gerenciada por este repositório
 */
public abstract class RepositoryBase<T> implements AutoCloseable {

	private Class<T> _class;
	
	private EntityManagerFactory _entityManagerFactory;
	private EntityManager _entityManager;
	
	public RepositoryBase(Class<T> myClass) {
		_class = myClass;
		
		_entityManagerFactory = Persistence.createEntityManagerFactory("cruzeirao");
		_entityManager = _entityManagerFactory.createEntityManager();
	}
	
	/**
	 * Busca uma entidade no banco de dados.
	 * @param id Chave primária da entidade a ser pesquisada
	 * @return Entidade encontrada, ou null.
	 */
	public T get(Object id) {
		return get(id, false);
	}
	
	/**
	 * Busca entidades no banco com base em uma Query
	 * @param query Query para buscar os dados
	 * @return Lista contendo as entidades encontradas
	 */
	public List<T> find(String query) {
		return _entityManager.createQuery(query).getResultList();
	}
	
	/**
	 * Busca uma entidade no banco de dados, opcionalmente habilitando LazyLoad de propriedades internas.
	 * @param id Chave primária da entidade a ser pesquisada
	 * @param enableLazyLoad
	 * @return Entidade encontrada, ou null.
	 */
	public T get(Object id, Boolean enableLazyLoad) {
		T result = null;
		
		if (enableLazyLoad) {
			try {
				result = _entityManager.getReference(_class, id);
			}
			catch (EntityNotFoundException e) {
				result = null;
			}
		}
		else {
			result = _entityManager.find(_class, id);
		}
		
		return result;
	}
	
	/**
	 * Adiciona uma entidade no banco de dados.
	 * @param entity Entidade a ser adicionada.
	 */
	public void add(T entity) {
		_entityManager.persist(entity);
	}
	
	/**
	 * Remove uma entidade do banco de dados.
	 * @param entity Entidade a ser removida.
	 */
	public void remove(T entity) {
		_entityManager.remove(entity);
	}
	
	/**
	 * Salva todas as modificações realizadas até o momento.
	 * Caso não seja chamado, as modificações não serão persistidas.
	 */
	public void save() {
		_entityManager.getTransaction().begin();
		_entityManager.getTransaction().commit();
	}
	
	@Override
	public void close() throws Exception {
		_entityManagerFactory.close();
		_entityManager.close();
	}
}
