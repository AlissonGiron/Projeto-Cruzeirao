package cruzeirao.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="GRUPO")
public class Grupo {

	private int id;
	private String nome;
	private Fase fase;
	private int numeroEquipes;
	private List<Rodada> rodadas = new ArrayList<Rodada>();
	private List<Inscricao> equipes = new ArrayList<Inscricao>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="NOME", nullable=false)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_FASE")
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	
	@Column(name="NUMERO_EQUIPES", nullable=false)
	public int getNumeroEquipes() {
		return numeroEquipes;
	}
	public void setNumeroEquipes(int numeroEquipes) {
		this.numeroEquipes = numeroEquipes;
	}
	
	@OneToMany
	public List<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(List<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	
	@OneToMany
	public List<Inscricao> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Inscricao> equipes) {
		this.equipes = equipes;
	}	
}