package cruzeirao.web;

import cruzeirao.core.MassagistaCore;
import cruzeirao.data.MassagistaRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.models.Massagista;

public class MassagistaMB extends ManagedBeanBase<Massagista, MassagistaRepository, MassagistaCore> {

	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	@Override
	public Massagista getNewInstanceOfT() {
		return new Massagista();
	}

	@Override
	public MassagistaCore getNewInstanceOfC() {
		return new MassagistaCore();
	}

	@Override
	public Boolean validate(Massagista tipoGenerico) {
		if(getTipoGenerico().getNome().isEmpty())//retorna falso se o nome do massagista for nulo
			return false;
		
		return true;
	}
	
}