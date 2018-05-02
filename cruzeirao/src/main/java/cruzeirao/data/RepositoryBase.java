package cruzeirao.data;

import java.io.Closeable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositoryBase<T> implements Closeable {

	private EntityManagerFactory _emf;
	private EntityManager _em;
	
	private Class<T> _class;
	
	public RepositoryBase(Class<T> myClass) {
		_emf = Persistence.createEntityManagerFactory("cruzeirao");
		_em = _emf.createEntityManager();
		_class = myClass;
	}
	
	public T get(int id) {
		return _em.getReference(_class, id);
	}
	
	public List<T> query(String query) {
		return _em.createQuery(query).getResultList();
	}
	
	public void add(T entity) { 
		_em.persist(entity);
	}
	
	public void edit(T entity) {
		if (!_em.contains(entity)) {
			add(entity);
		}
	}
	
	public void delete(T entity) {
		_em.remove(entity);
	}
	
	public void save() {
		_em.getTransaction().begin();
		_em.getTransaction().commit();
	}

	@Override
	public void close() {
		_em.close();
		_emf.close();
	}
}
