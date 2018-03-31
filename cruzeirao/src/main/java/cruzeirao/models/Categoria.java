package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

import cruzeirao.data.enums.Sexo;

public class Categoria {
	private String nome;
	private int nascidosAte, minJogadores, maxJogadores;
	private List<Inscricao> inscricoes = new ArrayList<Inscricao>();
	private List<Fase> fases = new ArrayList<Fase>();
	private Enum<Sexo> sexo;
	private Campeonato campeonato;
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
