package cruzeirao.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import cruzeirao.data.interfaces.IntegranteEquipe;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="INSCRITO")
public class Inscrito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int Id;
	
	@Column(name="ACEITE_USUARIO")
	private boolean aceiteUsuario;
	
	@Column(name="INSCRICAO_VALIDADA")
	private boolean inscricaoValidada;
	
	@OneToOne
	@Column(name="INSCRITO")
	private Usuario inscrito;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="ID")
	private Inscricao inscricao;

	// CONSTRUCTOR
	public Inscrito() {
		aceiteUsuario = false;
		inscricaoValidada = false;
	}
	
	// GETS AND SETS
	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}
	public void setAceiteUsuario(boolean aceitaUsuario) {
		this.aceiteUsuario = aceitaUsuario;
	}
	public boolean isInscricaoValidada() {
		return inscricaoValidada;
	}
	public void setInscricaoValidada(boolean inscricaoValida) {
		this.inscricaoValidada = inscricaoValida;
	}
	public Usuario getInscrito() {
		return inscrito;
	}
	public void setInscrito(Usuario inscrito) {
		this.inscrito = inscrito;
	}
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
}