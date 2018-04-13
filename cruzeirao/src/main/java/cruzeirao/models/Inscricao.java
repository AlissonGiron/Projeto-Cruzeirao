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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="INSCRICAO")
public class Inscricao {
	private int id;
	private long numeroInscricao;
	private boolean inscricaoValida;
	private boolean pagamento;
	private Inscrito tecnico;
	private Inscrito auxiliar;
	private Inscrito preparadorFisico;
	private Inscrito massagista;
	private Categoria categoria;
	private Equipe equipe;
	private List<Inscrito> jogadores = new ArrayList<Inscrito>();
	private List<Inscrito> suspensoProximaPartida = new ArrayList<Inscrito>();
	private List<Partida> partidas = new ArrayList<Partida>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="NUMERO_INSCRICAO", nullable=false)
	public long getNumeroInscricao() {
		return numeroInscricao;
	}
	public void setNumeroInscricao(long numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}
	
	@Column(name="PAGAMENTO_VALIDO")
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	
	@Column(name="INSCRICAO_VALIDA")
	public boolean isInscricaoValida() {
		return inscricaoValida;
	}
	public void setInscricaoValida(boolean inscricaoValida) {
		this.inscricaoValida = inscricaoValida;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_TECNICO")
	public Inscrito getTecnico() {
		return tecnico;
	}
	public void setTecnico(Inscrito tecnico) {
		this.tecnico = tecnico;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_AUXILIAR")
	public Inscrito getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(Inscrito auxiliar) {
		this.auxiliar = auxiliar;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_PREPARADORFISICO")
	public Inscrito getPreparadorFisico() {
		return preparadorFisico;
	}
	public void setPreparadorFisico(Inscrito preparadorFisico) {
		this.preparadorFisico = preparadorFisico;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_MASSAGISTA")
	public Inscrito getMassagista() {
		return massagista;
	}
	public void setMassagista(Inscrito massagista) {
		this.massagista = massagista;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_CATEGORIA")
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_EQUIPE")
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	@OneToMany
	public List<Inscrito> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Inscrito> jogadores) {
		this.jogadores = jogadores;
	}
	
	@OneToMany
	public List<Inscrito> getSuspensoProximaPartida() {
		return suspensoProximaPartida;
	}
	public void setSuspensoProximaPartida(List<Inscrito> suspensoProximaPartida) {
		this.suspensoProximaPartida = suspensoProximaPartida;
	}
	
	@OneToMany
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
	
}

