package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.Organizador;;

public class OrganizadorService {
	
	private ArrayList<Organizador> organizadores = new ArrayList<Organizador>();
	
	public void salvar(Organizador organizador) {
		organizadores.add(organizador);
	}

	public ArrayList<Organizador> getOrganizadores() {
		return organizadores;
	}
}
