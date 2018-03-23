package cruzeirao.models;

import java.sql.Time;

public class Gol {
	private Jogador jogador;
	private Time tempo;
	private boolean golDePenalti;
	
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public Time getTempo() {
		return tempo;
	}
	public void setTempo(Time tempo) {
		this.tempo = tempo;
	}
	public boolean isGolDePenalti() {
		return golDePenalti;
	}
	public void setGolDePenalti(boolean golDePenalti) {
		this.golDePenalti = golDePenalti;
	}	
}
