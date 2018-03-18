package cruzeirao.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

/**
 * 
 * @author Gabriel Belchior
 * Abstrai a l�gica de persist�ncia de dados do resto do c�digo da aplica��o.
 * @param <T> Tipo da entidade a ser gerenciada por este reposit�rio
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
	 * @param id Chave prim�ria da entidade a ser pesquisada
	 * @return Entidade encontrada, ou null.
	 */
	public T find(Object id) {
		return find(id, false);
	}
	
	/**
	 * Busca uma entidade no banco de dados, opcionalmente habilitando LazyLoad de propriedades internas.
	 * @param id Chave prim�ria da entidade a ser pesquisada
	 * @param enableLazyLoad
	 * @return Entidade encontrada, ou null.
	 */
	public T find(Object id, Boolean enableLazyLoad) {
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
	 * Salva todas as modifica��es realizadas at� o momento.
	 * Caso n�o seja chamado, as modifica��es n�o ser�o persistidas.
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
