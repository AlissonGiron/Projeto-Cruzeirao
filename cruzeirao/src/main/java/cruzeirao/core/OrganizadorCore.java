package cruzeirao.core;

import cruzeirao.data.OrganizadorRepository;
import cruzeirao.models.Organizador;

public class OrganizadorCore extends CoreBase<Organizador, OrganizadorRepository>{

	public OrganizadorCore() {
		super(new OrganizadorRepository(), "Organizador");
	}
}