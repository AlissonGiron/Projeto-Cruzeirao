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
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="INSCRITO")
public class Inscrito {
	private int id;
	private boolean aceiteUsuario;
	private boolean inscricaoValidada;
	private Usuario inscrito;
	private Inscricao inscricao;

	// CONSTRUCTOR
	public Inscrito() {
		aceiteUsuario = false;
		inscricaoValidada = false;
	}
	
	// GETS AND SETS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="ACEITE_USUARIO")
	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}
	public void setAceiteUsuario(boolean aceitaUsuario) {
		this.aceiteUsuario = aceitaUsuario;
	}
	
	@Column(name="INSCRICAO_VALIDADA")
	public boolean isInscricaoValidada() {
		return inscricaoValidada;
	}
	public void setInscricaoValidada(boolean inscricaoValida) {
		this.inscricaoValidada = inscricaoValida;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_INSCRITO")
	public Usuario getInscrito() {
		return inscrito;
	}
	public void setInscrito(Usuario inscrito) {
		this.inscrito = inscrito;
	}
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="ID_INSCRICAO")
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
}