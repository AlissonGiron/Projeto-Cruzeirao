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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="INSCRICAO")
public class Inscricao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
    @Column(name="NUMERO_INSCRICAO", nullable=false)
	private long numeroInscricao;
	
	@Column(name="INSCRICAO_VALIDA")
	private boolean inscricaoValida;
	
	@Column(name="PAGAMENTO_VALIDO")
	private boolean pagamento;
	
	@Column(name="TECNICO", nullable=false)
	private Inscrito tecnico;
	
	@Column(name="AUXILIAR", nullable=false)
	private Inscrito auxiliar;
	
	@Column(name="PREPADADOR_FISICO", nullable=false)
	private Inscrito preparadorFisico;
	
	@Column(name="MASSAGISTA", nullable=false)
	private Inscrito massagista;
	
	@Column(name="CATEGORIA", nullable=false)
	private Categoria categoria;
	
	@Column(name="EQUIPE", nullable=false)
	private Equipe equipe;
	
	@OneToMany
	private List<Inscrito> jogadores = new ArrayList<Inscrito>();
	
	@OneToMany
	private List<Inscrito> suspensoProximaPartida = new ArrayList<Inscrito>();
	
	@OneToMany
	private List<Partida> partidas = new ArrayList<Partida>();
	
	public long getNumeroInscricao() {
		return numeroInscricao;
	}
	public void setNumeroInscricao(long numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public boolean isInscricaoValida() {
		return inscricaoValida;
	}
	public void setInscricaoValida(boolean inscricaoValida) {
		this.inscricaoValida = inscricaoValida;
	}
	public Inscrito getTecnico() {
		return tecnico;
	}
	public void setTecnico(Inscrito tecnico) {
		this.tecnico = tecnico;
	}
	public Inscrito getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(Inscrito auxiliar) {
		this.auxiliar = auxiliar;
	}
	public Inscrito getPreparadorFisico() {
		return preparadorFisico;
	}
	public void setPreparadorFisico(Inscrito preparadorFisico) {
		this.preparadorFisico = preparadorFisico;
	}
	public Inscrito getMassagista() {
		return massagista;
	}
	public void setMassagista(Inscrito massagista) {
		this.massagista = massagista;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public List<Inscrito> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Inscrito> jogadores) {
		this.jogadores = jogadores;
	}
	public List<Inscrito> getSuspensoProximaPartida() {
		return suspensoProximaPartida;
	}
	public void setSuspensoProximaPartida(List<Inscrito> suspensoProximaPartida) {
		this.suspensoProximaPartida = suspensoProximaPartida;
	}
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
	
}

