package cruzeirao.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.ValidationException;
import javax.faces.validator.ValidatorException;

import cruzeirao.core.CampeonatoCore;
import cruzeirao.data.CampeonatoRepository;
import cruzeirao.models.Campeonato;

@ManagedBean
@SessionScoped
public class CampeonatoMB extends ManagedBeanBase<Campeonato, CampeonatoRepository, CampeonatoCore> {

	public CampeonatoMB() {
		super();
	}

	@Override
	public Campeonato getNewInstanceOfT() {
		return new Campeonato();
	}

	@Override
	public CampeonatoCore getNewInstanceOfC() {
		return new CampeonatoCore();
	}

	@Override
	public Boolean validate(Campeonato tipoGenerico) {
		if(getTipoGenerico().getDataInicioCampeonato().getTime() > getTipoGenerico().getDataFimInscricao().getTime()) //retorna falso se a data de inicio for maior que a data final do campeonato
			return false;
		
		if(getTipoGenerico().getNome().isEmpty())//retorna falso de nao houver nome do campeonato
			return false;
		
		return true;
	}
}

//package cruzeirao.web;
//
//import java.util.List;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//import cruzeirao.core.CampeonatoCore;
//import cruzeirao.models.Campeonato;
//
//@ManagedBean
//@SessionScoped
//public class CampeonatoMB {
//	
//	private CampeonatoCore _core;
//	private List<Campeonato> _campeonatos;
//	private Campeonato _campeonato;
//	
//	public CampeonatoMB() {
//		_core = new CampeonatoCore();
//		_campeonato = new Campeonato();
//		_campeonatos = getAll();
//	}
//	
//	public Campeonato getCampeonato() {
//		return _campeonato;
//	}
//
//	public void setCampeonato(Campeonato campeonato) {
//		_campeonato = campeonato;
//	}
//
//	public List<Campeonato> getCampeonatos() {
//		_campeonatos = getAll();
//		return _campeonatos;
//	}
//
//	public void setCampeonatos(List<Campeonato> campeonatos) {
//		this._campeonatos = campeonatos;
//	}
//	
//	public Campeonato get(int id) {
//		return _core.get(id);
//	}
//	
//	public List<Campeonato> getAll() {
//		return _core.getAll();
//	}
//	
//	public String create() {
//		_core.add(_campeonato);
//		_campeonato = new Campeonato();
//		return "index.xhtml";
//	}
//	
//	public String edit() {
//		_core.edit(_campeonato);
//		_campeonato = new Campeonato();
//		return "index.xhtml";
//	}
//	
//	public String edit(Campeonato campeonato) {
//		_campeonato =  campeonato;
//		return "edit.xhtml";
//	}
//	
//	public String delete(Campeonato campeonatoDelete) {
//		if(campeonatoDelete == null) return "index.xhtml";
//		
//		_campeonatos.remove(campeonatoDelete);
//		_core.delete(campeonatoDelete);
//		
//		return "index.xhtml";
//	}
//	
//	@Override
//	protected void finalize() throws Throwable {
//		_core.close();
//		super.finalize();
//	}
//}