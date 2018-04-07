package cruzeirao.models;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="GOL")
public class Gol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Column(name="JOGADOR", nullable=false)
	private Jogador jogador;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TEMPO", nullable=true)
	private Calendar tempo;
	
	@Column(name="GOL_DE_PENALTI")  
	private boolean golDePenalti;
	
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public Calendar getTempo() {
		return tempo;
	}
	public void setTempo(Calendar tempo) {
		this.tempo = tempo;
	}
	public boolean isGolDePenalti() {
		return golDePenalti;
	}
	public void setGolDePenalti(boolean golDePenalti) {
		this.golDePenalti = golDePenalti;
	}	
}
