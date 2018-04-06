package cruzeirao.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="ORGANIZADOR")
@PrimaryKeyJoinColumn(name="ID_INSCRICAO", referencedColumnName="ID")
public class Partida {
	@OneToMany
	@JoinColumn(name="NUMERO_PARTIDA", referencedColumnName="ID")
	private int numeroPartida;
	
	@OneToMany
	@JoinColumn(name="EQUIPE_MANDANTE", referencedColumnName="ID")
	private Inscricao equipeMandante; 
	
	@OneToMany
	@JoinColumn(name="CATEGORIA", referencedColumnName="ID")
	private Inscricao equipeVisitante;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_PARTIDA", nullable=true)
	private Date dataPartida;
	
	@OneToMany
	@JoinColumn(name="LOCAL", referencedColumnName="ID")
	private Local local;
	
	@OneToMany
	@JoinColumn(name="GRUPO", referencedColumnName="ID")
	private Grupo grupo;
	
	@OneToOne
	@JoinColumn(name="RELATO_JUIZ, referencedColumnName="ID")
	private String relatoJuiz;
	
	@OneToMany
	@Column(name="GOL_MANDANTES", nullable=true)
	private List<Juiz> juizes = new ArrayList<Juiz>();
	
	public int getNumeroPartida() {
		return numeroPartida;
	}
	public void setNumeroPartida(int numeroPartida) {
		this.numeroPartida = numeroPartida;
	}
	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}
	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}
	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}
	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	public Date getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public String getRelatoJuiz() {
		return relatoJuiz;
	}
	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}
	public List<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}
}

