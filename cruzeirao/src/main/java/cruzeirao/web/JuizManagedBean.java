package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.models.Juiz;

@ManagedBean
@SessionScoped
public class JuizManagedBean {
	
	private Juiz juiz = new Juiz();
	private JuizService service = new JuizService();
	
	public void salvar()
	{
		service.salvar(juiz);
		juiz = new Juiz();
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	
	public List<Juiz> getJuizes(){
		return service.getJuizes();
	}
}
