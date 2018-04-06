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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="RODADA")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Rodada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PARTIDA", nullable=true)
	private int numero;
	
	@OneToOne
	@JoinColumn(name="GRUPO_ID", referencedColumnName="ID")
	private Grupo grupo;
	
	@OneToMany
	@Column(name="PARTIDAS", nullable=true)
	private List<Partida> partidas = new ArrayList<Partida>();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
}
