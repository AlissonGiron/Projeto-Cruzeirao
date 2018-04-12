package cruzeirao.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Calendar;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="CAMPEONATO")
public class Campeonato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@OneToMany
	@Column(name="LOCAIS", nullable=true)
	private ArrayList<Local> locais = new ArrayList<Local>();
	
	@OneToMany
	@Column(name="JUIZES", nullable=true)
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	
	@OneToMany
	@Column(name="CATEGORIAS", nullable=true)
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_INICIO_INSCRICAO", nullable=false)
	private Calendar dataInicioInscricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_FIM_INSCRICAO", nullable=false)
	private Calendar dataFimInscricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_INICIO_CAMPEONATO", nullable=false)
	private Calendar dataInicioCampeonato;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_FIM_CAMPEONATO", nullable=false)
	private Calendar dataFimCampeonato;
	
	@Column(name="VALOR_TAXA", nullable=false)
	private double valorTaxa;
	
	// GETS AND SETS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
	
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	public Calendar getDataInicioInscricao() {
		return dataInicioInscricao;
	}
	public void setDataInicioInscricao(Calendar dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}
	
	public Calendar getDataFimInscricao() {
		return dataFimInscricao;
	}
	public void setDataFimInscricao(Calendar dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}
	
	public Calendar getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}
	public void setDataInicioCampeonato(Calendar dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}
	
	public Calendar getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(Calendar dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
	
	public double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
}