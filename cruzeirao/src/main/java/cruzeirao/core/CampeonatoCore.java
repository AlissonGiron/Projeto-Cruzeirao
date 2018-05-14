package cruzeirao.core;

import cruzeirao.data.CampeonatoRepository;
import cruzeirao.models.Campeonato;

public class CampeonatoCore extends CoreBase<Campeonato, CampeonatoRepository> {

	public CampeonatoCore() {
		super(new CampeonatoRepository(), "Campeonato");
	}
}

//package cruzeirao.core;
//
//import java.io.Closeable;
//import java.util.List;
//import cruzeirao.data.CampeonatoRepository;
//import cruzeirao.models.Campeonato;
//
//public class CampeonatoCore implements Closeable {
//	private CampeonatoRepository _repository;
//	
//	public CampeonatoCore() {
//		_repository = new CampeonatoRepository();
//	}
//	
//	public Campeonato get(int id) {
//		return _repository.get(id);
//	}
//	
//	public List<Campeonato> getAll() {
//		return _repository.query("Select c from Campeonato c");
//	}
//	
//	public List<Campeonato> query(String query) {
//		return _repository.query(query);
//	}
//	
//	public void add(Campeonato campeonato) {
//		_repository.add(campeonato);
//	}
//	
//	public void edit(Campeonato campeonato) {
//		_repository.edit(campeonato);
//	}
//	
//	public void delete(Campeonato campeonato) {
//		_repository.delete(campeonato);
//	}
//	
//	@Override
//	public void close() {
//		_repository.close();
//	}
//}