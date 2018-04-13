package cruzeirao.models;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="GOL")
public class Gol {
	private int id;
	private Jogador jogador;
	private Calendar tempo;
	private boolean golDePenalti;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_JOGADOR")
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TEMPO", nullable=true)
	public Calendar getTempo() {
		return tempo;
	}
	public void setTempo(Calendar tempo) {
		this.tempo = tempo;
	}
	
	@Column(name="GOL_DE_PENALTI")  
	public boolean isGolDePenalti() {
		return golDePenalti;
	}
	public void setGolDePenalti(boolean golDePenalti) {
		this.golDePenalti = golDePenalti;
	}	
}
