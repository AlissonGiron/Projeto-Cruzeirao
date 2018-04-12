package cruzeirao.models;

import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="PARTIDA")
public class Partida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Column(name="NUMERO_PARTIDA", nullable=false)
	private int numeroPartida;
	
	@Column(name="EQUIPE_MANDANTE", nullable=false)
	private Inscricao equipeMandante;
	
	@Column(name="EQUIPE_VISITANTE", nullable=false)
	private Inscricao equipeVisitante;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_PARTIDA", nullable=false)
	private Calendar dataPartida;
	
	@Column(name="LOCAL", nullable=false)
	private Local local;
	
	@Column(name="GRUPO", nullable=false)
	private Grupo grupo;
	
	@Column(name="RELATO_JUIZ", nullable=false)
    private String relatoJuiz;
	
	@Column(name="JUIZES", nullable=true)
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	
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
	public Calendar getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(Calendar dataPartida) {
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
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
}