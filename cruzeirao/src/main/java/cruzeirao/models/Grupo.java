package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="GRUPO")
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;

	@Column(name="NOME", nullable=false)
	private String nome;
	
	@Column(name="FASE", nullable=false)
	private Fase fase;
	
	@Column(name="NUMERO_EQUIPES", nullable=false)
	private int numeroEquipes;
	
	@OneToMany
	@Column(name="RODADAS", nullable=true)
	private List<Rodada> rodadas = new ArrayList<Rodada>();
	
	@OneToMany
	@Column(name="EQUIPES", nullable=true)
	private List<Inscricao> equipes = new ArrayList<Inscricao>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public int getNumeroEquipes() {
		return numeroEquipes;
	}
	public void setNumeroEquipes(int numeroEquipes) {
		this.numeroEquipes = numeroEquipes;
	}
	public List<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(List<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	public List<Inscricao> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Inscricao> equipes) {
		this.equipes = equipes;
	}	
}