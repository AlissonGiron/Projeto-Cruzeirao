package cruzeirao.models;

import java.util.ArrayList;
import java.util.Date;

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
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Access(AccessType.PROPERTY)
@Table(name = "CAMPEONATO")
public class Campeonato {
	private int id;
	@Size(min = 3, message = "O nome do campeonato deve ter no mínimo 3 caracteres")
	private String nome;
	private ArrayList<Local> locais = new ArrayList<Local>();
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	@NotNull(message = "A data de início das inscrições não pode ser vazia")
	@FutureOrPresent(message = "A data início das inscrições não pode ser no passado")
	private Date dataInicioInscricao;
	@NotNull(message = "A data fim das inscrições não pode ser vazia")
	@Future(message = "A data fim das inscrições deve ser no futuro")
	private Date dataFimInscricao;
	@NotNull(message = "A data de início das inscrições não pode ser vazia")
	@Future(message = "A data de início do campeonato deve estar no futuro")
	private Date dataInicioCampeonato;
	@NotNull(message = "A data fim das inscrições não pode ser vazia")
	@Future(message = "A data fim do campeonato deve estar no futuro")
	private Date dataFimCampeonato;
	private double valorTaxa;
	
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
	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_FIM_INSCRICAO", nullable = false)
	public Date getDataFimInscricao() {
		return dataFimInscricao;
	}

	public void setDataFimInscricao(Date dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_INICIO_CAMPEONATO", nullable = false)
	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}

	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_FIM_CAMPEONATO", nullable = false)
	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}

	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}

	@Column(name = "VALOR_TAXA", nullable = false)
	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
}