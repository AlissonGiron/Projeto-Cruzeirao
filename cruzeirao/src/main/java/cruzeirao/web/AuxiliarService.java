package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.Auxiliar;

public class AuxiliarService {
	
	private ArrayList<Auxiliar> auxiliares = new ArrayList<Auxiliar>();
	
	public void salvar(Auxiliar auxiliar) {
		auxiliares.add(auxiliar);
	}

	public ArrayList<Auxiliar> getAuxiliares() {
		return auxiliares;
	}

}
