package cruzeirao.core;

import cruzeirao.data.MassagistaRepository;
import cruzeirao.models.Massagista;

public class MassagistaCore extends CoreBase<Massagista, MassagistaRepository> {

	public MassagistaCore() {
		super(new MassagistaRepository(), "Massagista");
	}
}