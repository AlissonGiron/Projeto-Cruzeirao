package cruzeirao.web;

import cruzeirao.core.AuxiliarCore;
import cruzeirao.data.AuxiliarRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.models.Auxiliar;

public class AuxiliarMB extends ManagedBeanBase<Auxiliar, AuxiliarRepository, AuxiliarCore> {

	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	@Override
	public Auxiliar getNewInstanceOfT() {
		return new Auxiliar();
	}

	@Override
	public AuxiliarCore getNewInstanceOfC() {
		return new AuxiliarCore();
	}
}