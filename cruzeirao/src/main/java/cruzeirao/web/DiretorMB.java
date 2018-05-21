package cruzeirao.web;

import cruzeirao.core.DiretorCore;
import cruzeirao.data.DiretorRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.models.Diretor;

public class DiretorMB extends ManagedBeanBase<Diretor, DiretorRepository, DiretorCore> {

	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	@Override
	public Diretor getNewInstanceOfT() {
		return new Diretor();
	}

	@Override
	public DiretorCore getNewInstanceOfC() {
		return new DiretorCore();
	}
}