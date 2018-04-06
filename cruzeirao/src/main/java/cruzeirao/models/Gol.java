package cruzeirao.models;

import java.sql.Time;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="GOL")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Gol {
	@OneToMany
	@Column(name="PARTIDA_FUTEBOL", nullable=true)
	private Jogador jogador;
	
	Temporal(TemporalType.DATE)
	@Column(name="TEMPO", nullable=true)
	private Time tempo;
	
	@Column(name="GOL_DE_PENALTI")  
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
