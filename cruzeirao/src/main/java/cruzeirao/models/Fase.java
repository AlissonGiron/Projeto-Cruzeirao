package cruzeirao.models;

import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import cruzeirao.data.enums.Formato;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="FASE")
public class Fase {
	private int id;
	private Calendar dataInicio;
	private Calendar dataFim;
	private Formato formato;
	private Categoria categoria;
	private int numeroFase;
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_INICIO", nullable=false)
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_FIM", nullable=false)
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="TIPO_FORMATO", nullable=false)
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_CATEGORIA")
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Column(name="NUMERO_FASE", nullable=false)
	public int getNumeroFase() {
		return numeroFase;
	}
	public void setNumeroFase(int numeroFase) {
		this.numeroFase = numeroFase;
	}
	
	@OneToMany(mappedBy="fase")
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
}