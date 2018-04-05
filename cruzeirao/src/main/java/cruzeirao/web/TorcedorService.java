package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.Torcedor;

public class TorcedorService {

	private ArrayList<Torcedor> torcedores = new ArrayList<Torcedor>();
	
	public void salvar(Torcedor torcedor) {
		torcedores.add(torcedor);
	}

	public ArrayList<Torcedor> getTorcedores() {
		return torcedores;
	}
}
