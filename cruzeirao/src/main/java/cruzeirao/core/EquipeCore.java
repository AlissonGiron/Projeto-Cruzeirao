package cruzeirao.core;

import cruzeirao.data.EquipeRepository;
import cruzeirao.models.Equipe;

public class EquipeCore extends CoreBase<Equipe, EquipeRepository> {

	public EquipeCore() {
		super(new EquipeRepository(), "Equipe");
	}
}
