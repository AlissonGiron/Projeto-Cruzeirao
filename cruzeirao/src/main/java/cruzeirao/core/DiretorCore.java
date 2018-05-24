package cruzeirao.core;

import cruzeirao.data.DiretorRepository;
import cruzeirao.models.Diretor;

public class DiretorCore extends CoreBase<Diretor, DiretorRepository> {

	public DiretorCore() {
		super(new DiretorRepository(), "Diretor");
	}
}