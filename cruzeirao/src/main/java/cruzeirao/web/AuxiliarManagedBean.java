package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.models.Auxiliar;

@ManagedBean
@SessionScoped
public class AuxiliarManagedBean {
	
	private Auxiliar auxiliar = new Auxiliar();
	private AuxiliarService service = new AuxiliarService();
	
	public void salvar()
	{
		service.salvar(auxiliar);
		auxiliar = new Auxiliar();
	}

	public Auxiliar getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(Auxiliar auxiliar) {
		this.auxiliar = auxiliar;
	}

	public List<Auxiliar> getAuxiliares() {
		return service.getAuxiliares();
	}	
}
