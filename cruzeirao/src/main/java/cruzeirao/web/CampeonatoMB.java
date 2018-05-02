package cruzeirao.web;

import java.util.List;

import cruzeirao.core.CampeonatoCore;
import cruzeirao.models.Campeonato;

public class CampeonatoMB {
	private CampeonatoCore _core;
	
	public CampeonatoMB() {
		_core = new CampeonatoCore();
	}
	
	public Campeonato get(int id) {
		return _core.get(id);
	}
	
	public List<Campeonato> getAll() {
		return _core.getAll();
	}
	
	public void add(Campeonato campeonato) {
		_core.add(campeonato);
	}
	
	public void edit(Campeonato campeonato) {
		_core.edit(campeonato);
	}
	
	public void delete(Campeonato campeonato) {
		_core.delete(campeonato);
	}
	
	public void save() {
		_core.save();
	}
	
	@Override
	protected void finalize() throws Throwable {
		_core.close();
		super.finalize();
	}
}
