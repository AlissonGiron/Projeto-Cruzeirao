package cruzeirao.core;

import cruzeirao.data.JuizRepository;
import cruzeirao.models.Juiz;

public class JuizCore extends CoreBase<Juiz, JuizRepository> {

	public JuizCore() {
		super(new JuizRepository(), "Juiz");
	}
}