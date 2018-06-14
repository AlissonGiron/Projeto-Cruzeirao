package cruzeirao.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.ValidationException;
import javax.faces.validator.ValidatorException;

import cruzeirao.core.EquipeCore;
import cruzeirao.data.EquipeRepository;
import cruzeirao.models.Equipe;

@ManagedBean
@SessionScoped
public class EquipeMB extends ManagedBeanBase<Equipe, EquipeRepository, EquipeCore> {

	public EquipeMB() {
		super();
	}

	@Override
	public Equipe getNewInstanceOfT() {
		return new Equipe();
	}

	@Override
	public EquipeCore getNewInstanceOfC() {
		return new EquipeCore();
	}

	@Override
	public Boolean validate(Equipe tipoGenerico) {
		return true;
	}

}
