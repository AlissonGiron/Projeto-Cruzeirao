package cruzeirao.models;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
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

