package cruzeirao.web;

import cruzeirao.core.JuizCore;
import cruzeirao.data.JuizRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.models.Juiz;

public class JuizMB extends ManagedBeanBase<Juiz, JuizRepository, JuizCore> {

	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	@Override
	public Juiz getNewInstanceOfT() {
		return new Juiz();
	}

	@Override
	public JuizCore getNewInstanceOfC() {
		return new JuizCore();
	}
}