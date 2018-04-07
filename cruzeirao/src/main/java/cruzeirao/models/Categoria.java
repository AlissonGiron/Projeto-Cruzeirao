package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cruzeirao.data.enums.Sexo;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="CATEGORIA")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@Column(name="NASCIDOS_ATE", nullable=false)
	private int nascidosAte;
	
	@Column(name="MIN_JOGADORES", nullable=false)
	private int minJogadores; 
	
	@Column(name="MAX_JOGADORES", nullable=false)
	private int maxJogadores;
	
	@OneToMany
	@Column(name="INSCRICOES", nullable=true)
	private List<Inscricao> inscricoes = new ArrayList<Inscricao>();
	
	@OneToMany
	@Column(name="FASES", nullable=true)
	private List<Fase> fases = new ArrayList<Fase>();
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_SEXO", nullable=false)
	private Enum<Sexo> sexo;
	
	@Column(name="CAMPEONATO", nullable=false) 
	private Campeonato campeonato;
	
	@Column(name="INSCRICOES_HABILITADAS")
	private boolean inscricoesHabilitadas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNascidosAte() {
		return nascidosAte;
	}
	
	public void setNascidosAte(int nascidosAte) {
		this.nascidosAte = nascidosAte;
	}
	
	public int getMinJogadores() {
		return minJogadores;
	}
	
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	
	public int getMaxJogadores() {
		return maxJogadores;
	}
	
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}
	public Enum<Sexo> getSexo() {
		return sexo;
	}
	public void setSexo(Enum<Sexo> sexo) {
		this.sexo = sexo;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public boolean isInscricoesHabilitadas() {
		return inscricoesHabilitadas;
	}
	public void setInscricoesHabilitadas(boolean inscricoesHabilitadas) {
		this.inscricoesHabilitadas = inscricoesHabilitadas;
	}	
}


