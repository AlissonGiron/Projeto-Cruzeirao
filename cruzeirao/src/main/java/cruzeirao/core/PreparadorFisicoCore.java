package cruzeirao.core;

import cruzeirao.data.PreparadorFisicoRepository;
import cruzeirao.models.PreparadorFisico;

public class PreparadorFisicoCore extends CoreBase<PreparadorFisico, PreparadorFisicoRepository> {

	public PreparadorFisicoCore() {
		super(new PreparadorFisicoRepository(), "PreparadorFisico");
	}
}