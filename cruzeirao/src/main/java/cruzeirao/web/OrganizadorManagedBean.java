package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.models.Organizador;

@ManagedBean
@SessionScoped
public class OrganizadorManagedBean {
	
	private Organizador organizador = new Organizador();
	private OrganizadorService service = new OrganizadorService();
	
	public void salvar()
	{
		service.salvar(organizador);
		organizador = new Organizador();
	}

	public Organizador getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}
	
	public List<Organizador> getOrganizadores(){
		return service.getOrganizadores();
	}
}
