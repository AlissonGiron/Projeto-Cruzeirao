package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.models.Tecnico;

@ManagedBean
@SessionScoped
public class TecnicoManagedBean {
	
	private Tecnico tecnico = new Tecnico();
	private TecnicoService service = new TecnicoService();
	
	public void salvar()
	{
		service.salvar(tecnico);
		tecnico = new Tecnico();
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	public List<Tecnico> getTecnicos() {
		return service.getTecnicos();
	}
}
