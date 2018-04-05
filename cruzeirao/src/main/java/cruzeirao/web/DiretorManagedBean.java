package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.models.Diretor;

@ManagedBean
@SessionScoped
public class DiretorManagedBean {
	
	private Diretor diretor =  new Diretor();
	private DiretorService service = new DiretorService();
	
	public void salvar(Diretor diretor)
	{
		service.salvar(diretor);
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	public List<Diretor> getDiretores(){
		return service.getDiretores();
	}
}
