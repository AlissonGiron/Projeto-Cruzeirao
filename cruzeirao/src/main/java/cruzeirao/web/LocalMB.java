package cruzeirao.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.ValidationException;
import javax.faces.validator.ValidatorException;

import cruzeirao.core.LocalCore;
import cruzeirao.data.LocalRepository;
import cruzeirao.models.Local;

@ManagedBean
@SessionScoped
public class LocalMB extends ManagedBeanBase<Local, LocalRepository, LocalCore> {

	public LocalMB() {
		super();
	}

	@Override
	public Local getNewInstanceOfT() {
		return new Local();
	}

	@Override
	public LocalCore getNewInstanceOfC() {
		return new LocalCore();
	}

	@Override
	public Boolean validate(Local tipoGenerico) {
		return true;
	}

}
