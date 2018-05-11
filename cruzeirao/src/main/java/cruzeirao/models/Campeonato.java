package cruzeirao.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Entity
@Access(AccessType.PROPERTY)
@Table(name = "CAMPEONATO")
public class Campeonato {
	private int id;
	private String nome;
	private ArrayList<Local> locais = new ArrayList<Local>();
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private Calendar dataInicioInscricao;
	private Calendar dataFimInscricao;
	private Calendar dataInicioCampeonato;
	private Calendar dataFimCampeonato;
	private double valorTaxa;

	public Campeonato() {
		dataInicioInscricao = new GregorianCalendar();
		dataFimInscricao = new GregorianCalendar();
		dataInicioCampeonato = new GregorianCalendar();
		dataFimCampeonato = new GregorianCalendar();
	}
	
	// GETS AND SETS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NOME", nullable = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@ManyToMany(mappedBy = "campeonatos")
	public ArrayList<Local> getLocais() {
		return locais;
	}

	public void setLocais(ArrayList<Local> locais) {
		this.locais = locais;
	}

	@ManyToMany(mappedBy = "campeonatos")
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}

	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}

	@OneToMany(mappedBy = "campeonato")
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_INICIO_INSCRICAO", nullable = false)
	public Calendar getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Calendar dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_FIM_INSCRICAO", nullable = false)
	public Calendar getDataFimInscricao() {
		return dataFimInscricao;
	}

	public void setDataFimInscricao(Calendar dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_INICIO_CAMPEONATO", nullable = false)
	public Calendar getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}

	public void setDataInicioCampeonato(Calendar dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_FIM_CAMPEONATO", nullable = false)
	public Calendar getDataFimCampeonato() {
		return dataFimCampeonato;
	}

	public void setDataFimCampeonato(Calendar dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}

	@Column(name = "VALOR_TAXA", nullable = false)
	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	@Transient
	public Date getDataInicioInscricaoT() {
		return dataInicioInscricao.getTime();
	}

	public void setDataInicioInscricaoT(Date dataInicioInscricaoT) {
		this.dataInicioInscricao.setTime(dataInicioInscricaoT);
	}

	@Transient
	public Date getDataFimInscricaoT() {
		return dataFimInscricao.getTime();
	}

	public void setDataFimInscricaoT(Date dataFimInscricaoT) {
		this.dataFimInscricao.setTime(dataFimInscricaoT);
	}

	@Transient
	public Date getDataInicioCampeonatoT() {
		return dataInicioCampeonato.getTime();
	}

	public void setDataInicioCampeonatoT(Date dataInicioCampeonatoT) {
		this.dataInicioCampeonato.setTime(dataInicioCampeonatoT);
	}

	@Transient
	public Date getDataFimCampeonatoT() {
		return dataFimCampeonato.getTime();
	}

	public void setDataFimCampeonatoT(Date dataFimCampeonatoT) {
		this.dataFimCampeonato.setTime(dataFimCampeonatoT);
	}
}