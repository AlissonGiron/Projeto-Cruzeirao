package cruzeirao.models;

import java.sql.Time;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import cruzeirao.data.enums.TipoCartao;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="CARTAO")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Cartao {
	
	@OneToMany
	@Column(name="CARTOES_JOGADORES", nullable=false) 
	private Jogador jogador;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_CARTAO", nullable=false)
	private Enum<TipoCartao> tipo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TEMPO_DE_JOGO", nullable=true)
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

