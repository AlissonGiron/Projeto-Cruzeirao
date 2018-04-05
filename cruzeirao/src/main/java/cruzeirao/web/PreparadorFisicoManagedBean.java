package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.models.PreparadorFisico;

@ManagedBean
@SessionScoped
public class PreparadorFisicoManagedBean {
	
	private PreparadorFisico preparadorFisico = new PreparadorFisico();
	private PreparadorFisicoService service = new PreparadorFisicoService();
	
	public void salvar()
	{
		service.salvar(preparadorFisico);
		preparadorFisico = new PreparadorFisico();
	}

	public PreparadorFisico getPreparadorFisico() {
		return preparadorFisico;
	}

	public void setPreparadorFisico(PreparadorFisico preparadorFisico) {
		this.preparadorFisico = preparadorFisico;
	}
	
	public List<PreparadorFisico> getPreparadoresFisico(){
		return service.getPreparadoresFisico();
	}
	
}
