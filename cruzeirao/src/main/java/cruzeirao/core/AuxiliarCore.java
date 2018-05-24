package cruzeirao.core;

import cruzeirao.data.AuxiliarRepository;
import cruzeirao.models.Auxiliar;

public class AuxiliarCore extends CoreBase<Auxiliar, AuxiliarRepository> {

	public AuxiliarCore() {
		super(new AuxiliarRepository(), "Auxiliar");
	}
}