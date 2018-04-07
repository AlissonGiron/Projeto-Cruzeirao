package cruzeirao.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import cruzeirao.data.enums.Formato;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="FASE")
public class Fase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_INICIO", nullable=false)
	private Calendar dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_FIM", nullable=false)
	private Calendar dataFim;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_FORMATO", nullable=false)
	private Enum<Formato> formato;
	
	@Column(name="CATEGORIA", nullable=false)
	private Categoria categoria;
	
	@Column(name="NUMERO_FASE", nullable=false)
	private int numeroFase;
	
	@OneToMany
	@Column(name="GRUPOS", nullable=true)
	private List<Grupo> grupos = new ArrayList<Grupo>();
	
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	public Enum<Formato> getFormato() {
		return formato;
	}
	public void setFormato(Enum<Formato> formato) {
		this.formato = formato;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getNumeroFase() {
		return numeroFase;
	}
	public void setNumeroFase(int numeroFase) {
		this.numeroFase = numeroFase;
	}
	public List<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
}

