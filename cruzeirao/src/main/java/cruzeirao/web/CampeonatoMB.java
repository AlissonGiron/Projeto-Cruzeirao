package cruzeirao.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import cruzeirao.core.CampeonatoCore;
import cruzeirao.models.Campeonato;

@ManagedBean
@SessionScoped
public class CampeonatoMB {
	private CampeonatoCore _core;
	
	private List<Campeonato> campeonatos;
	private Campeonato campeonato;
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	

	public CampeonatoMB() {
		_core = new CampeonatoCore();
		campeonato = new Campeonato();
		campeonatos = getAll();	
	}
	
	public Campeonato get(int id) {
		return _core.get(id);
	}
	
	public List<Campeonato> getAll() {
		//return _core.getAll();
		
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
		
		return Campeonatos;
	}
	
	public void create() {		
		_core.add(campeonato);
	}
	
	public void edit() {
		_core.edit(campeonato);		
	}
	
	public String edit(int id) {
		campeonato =  _core.get(id);
		return "edit.xhtml";
	}
	
	public void delete(Campeonato campeonatoDelete) {
		if(campeonatoDelete == null) return;
		
		System.err.println(campeonatoDelete.getNome());
		campeonatos.remove(campeonatoDelete);
		_core.delete(campeonatoDelete);
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
