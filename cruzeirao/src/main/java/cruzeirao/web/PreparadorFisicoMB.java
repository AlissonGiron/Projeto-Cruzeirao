package cruzeirao.web;

import cruzeirao.core.PreparadorFisicoCore;
import cruzeirao.data.PreparadorFisicoRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.models.PreparadorFisico;

public class PreparadorFisicoMB extends ManagedBeanBase<PreparadorFisico, PreparadorFisicoRepository, PreparadorFisicoCore> {

	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	@Override
	public PreparadorFisico getNewInstanceOfT() {
		return new PreparadorFisico();
	}

	@Override
	public PreparadorFisicoCore getNewInstanceOfC() {
		return new PreparadorFisicoCore();
	}
}