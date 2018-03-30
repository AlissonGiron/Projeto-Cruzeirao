package cruzeirao.core;

import java.util.List;

import cruzeirao.data.RepositoryBase;

public abstract class CoreBase<T> implements AutoCloseable {
	
	private Class<T> _myClass;
	private RepositoryBase<T> _repository;
	
	public CoreBase(Class<T> myClass, RepositoryBase<T> myRepository) {
		_myClass = myClass;
		_repository = myRepository;
	}
	
	public T get(Object id) {
		return _repository.get(id);
	}
	
	private List<T> find(String query) {
		return _repository.find(query);
	}
	
	public void add(T entity) {
		_repository.add(entity);
	}
	
	public void remove(T entity) {
		_repository.remove(entity);
	}
	
	public void save() {
		_repository.save();
	}
}
