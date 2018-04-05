package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
import cruzeirao.models.Massagista;

public class MassagistaManagedBean {
	
	private Massagista massagista = new Massagista();
	private MassagistaService service = new MassagistaService();
	
	private void salvar() 
	{
		service.salvar(massagista);
		massagista = new Massagista();
	}

	public Massagista getMassagista() {
		return massagista;
	}

	public void setMassagista(Massagista massagista) {
		this.massagista = massagista;
	}
	
	public List<Massagista> getMassagistas(){
		return service.getMassagistas();
	}
	
}
