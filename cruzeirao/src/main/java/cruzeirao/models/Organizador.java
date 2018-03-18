package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

public class Organizador extends Usuario {
	private List<Campeonato> campeonatos = new ArrayList<Campeonato>();

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
}