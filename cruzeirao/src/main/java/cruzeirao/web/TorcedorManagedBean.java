package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.models.Torcedor;

@ManagedBean
@SessionScoped
public class TorcedorManagedBean {
	
	private Torcedor torcedor = new Torcedor();
	private TorcedorService service = new TorcedorService();
	
	public void salvar() 
	{
		service.salvar(torcedor);
		torcedor = new Torcedor();
	}

	public Torcedor getTorcedor() {
		return torcedor;
	}

	public void setTorcedor(Torcedor torcedor) {
		this.torcedor = torcedor;
	}
	
	public List<Torcedor> getTorcedores(){
		return service.getTorcedores();
	}
}
