package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.core.CampeonatoCore;
import cruzeirao.models.Campeonato;

@ManagedBean
@SessionScoped
public class CampeonatoMB {
	private CampeonatoCore _core;
	
	private List<Campeonato> _campeonatos;
	private Campeonato _campeonato;
	
	public Campeonato getCampeonato() {
		return _campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		_campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		_campeonatos = getAll();
		return _campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this._campeonatos = campeonatos;
	}
	

	public CampeonatoMB() {
		_core = new CampeonatoCore();
		_campeonato = new Campeonato();
		_campeonatos = getAll();	
	}
	
	public Campeonato get(int id) {
		return _core.get(id);
	}
	
	public List<Campeonato> getAll() {
		return _core.getAll();
		/*
		List<Campeonato> Campeonatos = new ArrayList<Campeonato>(); 
		
		for(int i = 0; i < 2; i++)
		{
			Campeonato LCampeonato = new Campeonato();
			
			LCampeonato.setNome("Cruzeirão 201" + (4 + i));
			
			Calendar dataFim = Calendar.getInstance();
			dataFim.set((2013 + i), 04, 05, 18, 00);
			
			LCampeonato.setDataFimInscricao(dataFim);

			Calendar dataInicio = Calendar.getInstance();
			dataInicio.set((2013 + i), 03, 01, 8, 00);
			
			LCampeonato.setDataInicioInscricao(dataInicio);
			
		    dataFim = Calendar.getInstance();
			dataFim.set((2013 + i), 04, 05, 18, 00);
			
			LCampeonato.setDataFimCampeonato(dataFim);

			dataInicio = Calendar.getInstance();
			dataInicio.set((2013 + i), 03, 01, 8, 00);
			
			LCampeonato.setDataInicioCampeonato(dataInicio);
			
			Campeonatos.add(LCampeonato);
		}		
		
		return Campeonatos;*/
	}
	
	public String create() {
		_core.add(_campeonato);
		
		_campeonato = new Campeonato();
		
		return "index.xhtml";
	}
	
	public String edit() {
		_core.edit(_campeonato);
		_campeonato = new Campeonato();
		return "index.xhtml";
	}
	
	public String edit(Campeonato campeonato) {
		_campeonato =  campeonato;
		return "edit.xhtml";
	}
	
	public String delete(Campeonato campeonatoDelete) {
		if(campeonatoDelete == null) return "index.xhtml";
		
		_campeonatos.remove(campeonatoDelete);
		_core.delete(campeonatoDelete);
		
		return "index.xhtml";
	}
	
	@Override
	protected void finalize() throws Throwable {
		_core.close();
		super.finalize();
	}
}
