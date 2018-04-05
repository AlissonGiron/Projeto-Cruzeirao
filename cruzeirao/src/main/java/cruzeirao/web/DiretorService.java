package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.Diretor;

public class DiretorService {
	
	private ArrayList<Diretor> diretores = new ArrayList<Diretor>();
	
	public void salvar(Diretor diretor) {
		diretores.add(diretor);
	}

	public ArrayList<Diretor> getDiretores() {
		return diretores;
	}
}
