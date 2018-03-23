package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

public class Rodada {
	private int numero;
	private Grupo grupo;
	private List<Partida> partidas = new ArrayList<Partida>();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
}
