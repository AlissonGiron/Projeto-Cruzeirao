package cruzeirao.models;

import java.sql.Time;

import cruzeirao.data.enums.TipoCartao;

public class Cartao {
	private Jogador jogador;
	private Enum<TipoCartao> tipo;
	private Time tempo;
	
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public Enum<TipoCartao> getTipo() {
		return tipo;
	}
	public void setTipo(Enum<TipoCartao> tipo) {
		this.tipo = tipo;
	}
	public Time getTempo() {
		return tempo;
	}
	public void setTempo(Time tempo) {
		this.tempo = tempo;
	}	
}
