package cruzeirao.core;

import java.io.Closeable;
import java.util.List;
import cruzeirao.data.RepositoryBase;

public class CoreBase <T, R extends RepositoryBase<T>> implements Closeable {
	private R _repository;
	
	public CoreBase(R myRepository) {
		_repository = myRepository;
	}
	
	public T get(int id) {
		return _repository.get(id);
	}
	
	public List<T> getAll() {
		return _repository.query("Select c from " + _repository.getClass().getName() + " c");
	}
	
	public List<T> query(String query) {
		return _repository.query(query);
	}
	
	public void add(T entity) {
		_repository.add(entity);
	}
	
	public void edit(T entity) {
		_repository.edit(entity);
	}
	
	public void delete(T entity) {
		_repository.delete(entity);
	}
	
	@Override
	public void close() {
		_repository.close();
	}
}