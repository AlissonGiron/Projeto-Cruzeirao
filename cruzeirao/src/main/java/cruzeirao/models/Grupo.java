package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private String nome;
	private Fase fase;
	private int numeroEquipes;
	private List<Rodada> rodadas = new ArrayList<Rodada>();
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
