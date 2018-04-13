package cruzeirao.models;

import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import cruzeirao.data.enums.Sexo;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="CATEGORIA")
public class Categoria {
	private int id;
	private String nome;
	private int nascidosAte;
	private int minJogadores; 
	private int maxJogadores;
	private ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>();
	private ArrayList<Fase> fases = new ArrayList<Fase>();
	private Sexo sexo;
	private Campeonato campeonato;
	private boolean inscricoesHabilitadas;
	
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
	
	@Column(name="NASCIDOS_ATE", nullable=false)
	public int getNascidosAte() {
		return nascidosAte;
	}
	public void setNascidosAte(int nascidosAte) {
		this.nascidosAte = nascidosAte;
	}
	
	@Column(name="MIN_JOGADORES", nullable=false)
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	
	@Column(name="MAX_JOGADORES", nullable=false)
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	
	@OneToMany
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	
	@OneToMany(mappedBy="categoria")
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="TIPO_SEXO", nullable=false)
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_CAMPEONATO")
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	@Column(name="INSCRICOES_HABILITADAS")
	public boolean isInscricoesHabilitadas() {
		return inscricoesHabilitadas;
	}
	public void setInscricoesHabilitadas(boolean inscricoesHabilitadas) {
		this.inscricoesHabilitadas = inscricoesHabilitadas;
	}	
}