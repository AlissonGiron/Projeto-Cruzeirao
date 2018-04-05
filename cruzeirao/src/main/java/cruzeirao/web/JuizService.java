package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.Juiz;

public class JuizService {
	
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	
	public void salvar(Juiz juiz) {
		juizes.add(juiz);
	}

	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
}
