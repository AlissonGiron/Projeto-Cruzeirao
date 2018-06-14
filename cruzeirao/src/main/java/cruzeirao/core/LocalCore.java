package cruzeirao.core;

import cruzeirao.data.LocalRepository;
import cruzeirao.models.Local;

public class LocalCore extends CoreBase<Local, LocalRepository> {

	public LocalCore() {
		super(new LocalRepository(), "Local");
	}
}
