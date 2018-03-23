package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

public class Torcedor extends Usuario {
	private List<Equipe> equipes = new ArrayList<Equipe>();

	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
}