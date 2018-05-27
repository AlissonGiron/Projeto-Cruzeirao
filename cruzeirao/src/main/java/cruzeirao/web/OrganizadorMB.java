package cruzeirao.web;

import cruzeirao.core.OrganizadorCore;
import cruzeirao.data.OrganizadorRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.models.Organizador;

public class OrganizadorMB extends ManagedBeanBase<Organizador, OrganizadorRepository, OrganizadorCore> {

	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	@Override
	public Organizador getNewInstanceOfT() {
		return new Organizador();
	}

	@Override
	public OrganizadorCore getNewInstanceOfC() {
		return new OrganizadorCore();
	}

	@Override
	public Boolean validate(Organizador tipoGenerico) {
		if(getTipoGenerico().getNome().isEmpty())//retorna falso se o nome do organizador for nulo
			return false;
		
		return true;
	}
	
}