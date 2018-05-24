package cruzeirao.core;

import cruzeirao.data.TecnicoRepository;
import cruzeirao.models.Tecnico;

public class TecnicoCore extends CoreBase<Tecnico, TecnicoRepository> {

	public TecnicoCore() {
		super(new TecnicoRepository(), "Tecnico");
	}
}