package cruzeirao.data;

import java.io.Closeable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
		T result = _em.getReference(_class, id);
		commitChanges();
		return result;
	}
	
	public List<T> query(String query) {
		TypedQuery<T> tquery = _em.createQuery(query, _class);
		commitChanges();
		return tquery.getResultList();
	}
	
	public void add(T entity) { 
		_em.persist(entity);
		
		commitChanges();
	}
	
	public void edit(T entity) {
		if (!_em.contains(entity)) {
			add(entity);
		}
		
		commitChanges();
	}
	
	public void delete(T entity) {
		_em.remove(entity);
		commitChanges();
	}
	
	private void commitChanges() {
		_em.getTransaction().begin();
		_em.getTransaction().commit();
	}

	@Override
	public void close() {
		_em.close();
		_emf.close();
	}
}
