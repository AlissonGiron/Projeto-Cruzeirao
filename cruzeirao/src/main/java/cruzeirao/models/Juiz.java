package cruzeirao.models;

import java.util.ArrayList;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import cruzeirao.data.enums.TipoJuiz;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="JUIZ")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Juiz extends Usuario {
	
	private TipoJuiz tipo;
	private ArrayList<Partida> partidas;
	private ArrayList<Campeonato> campeonatos;
 
	// GETS AND SETS
	@Enumerated(EnumType.ORDINAL)
	@Column(name="TIPO_JUIZ", nullable=false)
	public TipoJuiz getTipo() {
		return tipo;
	}
	public void setTipo(TipoJuiz tipo) {
		this.tipo = tipo;
	}
	
	@ManyToMany
	@JoinTable(name="JUIZ_PARTIDA", joinColumns=@JoinColumn(name="ID"), inverseJoinColumns=@JoinColumn(name="ID"))
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	
	@ManyToMany
	@JoinTable(name="JUIZ_CAMPEONATO", joinColumns=@JoinColumn(name="ID"), inverseJoinColumns=@JoinColumn(name="ID"))
	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
}