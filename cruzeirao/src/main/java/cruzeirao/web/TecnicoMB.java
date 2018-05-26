package cruzeirao.web;

import cruzeirao.core.TecnicoCore;
import cruzeirao.data.TecnicoRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.models.Tecnico;

public class TecnicoMB extends ManagedBeanBase<Tecnico, TecnicoRepository, TecnicoCore>{

	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	@Override
	public Tecnico getNewInstanceOfT() {
		return new Tecnico();
	}

	@Override
	public TecnicoCore getNewInstanceOfC() {
		return new TecnicoCore();
	}

	@Override
	public Boolean validate(Tecnico tipoGenerico) {
		if(getTipoGenerico().getNome().isEmpty())//retorna falso se o nome do tecnico for nulo
			return false;
		
		return true;
	}
}