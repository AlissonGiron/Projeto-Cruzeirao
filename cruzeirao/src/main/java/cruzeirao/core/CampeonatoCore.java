package cruzeirao.core;

import cruzeirao.data.CampeonatoRepository;
import cruzeirao.models.Campeonato;

public class CampeonatoCore extends CoreBase<Campeonato, CampeonatoRepository> {

	public CampeonatoCore() {
		super(new CampeonatoRepository(), "Campeonato");
	}
}
