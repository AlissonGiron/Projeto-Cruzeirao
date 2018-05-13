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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="PARTIDA")
public class Partida {
	private int id;
	private int numeroPartida;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante;
	private Calendar dataPartida;
	private Local local;
	private Rodada rodada;
    private String relatoJuiz;
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="NUMERO_PARTIDA", nullable=false)
	public int getNumeroPartida() {
		return numeroPartida;
	}
	public void setNumeroPartida(int numeroPartida) {
		this.numeroPartida = numeroPartida;
	}
	
	@OneToOne
	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}
	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}

	@OneToOne
	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}
	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_PARTIDA", nullable=false)
	public Calendar getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(Calendar dataPartida) {
		this.dataPartida = dataPartida;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_LOCAL")
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
	
	@ManyToOne
	@JoinColumn(name="ID_RODADA")
	public Rodada getRodada() {
		return rodada;
	}
	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}
	
	@Column(name="RELATO_JUIZ", nullable=false)
	public String getRelatoJuiz() {
		return relatoJuiz;
	}
	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}
	
	@ManyToMany(mappedBy="partidas")
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
}