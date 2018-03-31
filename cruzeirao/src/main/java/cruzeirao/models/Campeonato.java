package cruzeirao.models;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Campeonato {
	private String nome;
	private ArrayList<Local> locais = new ArrayList<Local>();
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	private List<Categoria> categorias = new ArrayList<Categoria>();
	private Date dataInicioInscricao, dataFimInscricao, dataInicioCampeonato, dataFimCampeonato;
	private double valorTaxa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Local> getLocais() {
		return locais;
	}
	public void setLocais(ArrayList<Local> locais) {
		this.locais = locais;
	}
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}
	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}
	public Date getDataFimInscricao() {
		return dataFimInscricao;
	}
	public void setDataFimInscricao(Date dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}
	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}
	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}
	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
	public double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	
	
}
