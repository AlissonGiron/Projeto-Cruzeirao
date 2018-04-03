package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.Tecnico;

public class TecnicoService {
	
	private ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
	
	public void salvar(Tecnico tecnico) {
		tecnicos.add(tecnico);
	}

	public ArrayList<Tecnico> getTecnicos() {
		return tecnicos;
	}
	
}
