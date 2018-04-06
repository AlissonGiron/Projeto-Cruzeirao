package cruzeirao.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import cruzeirao.data.enums.Formato;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="FASE")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Fase {
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_INICIO", nullable=true)
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_FIM", nullable=true)
	private Date dataFim;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_FORMATO", nullable=false)
	private Enum<Formato> formato;
	
	@OneToOne
	@JoinColumn(name="CATEGORIA", referencedColumnName="ID")
	private Categoria categoria;
	
	@OneToOne
	@JoinColumn(name="CATEGORIA", referencedColumnName="ID")
	private int numeroFase;
	
	@OneToMany
	@JoinColumn(name="GRUPOS", referencedColumnName="ID")
	private List<Grupo> grupos = new ArrayList<Grupo>();
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
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

