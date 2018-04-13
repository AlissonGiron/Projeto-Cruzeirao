package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="ORGANIZADOR")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Organizador extends Usuario {
	
	private List<Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	// GETS AND SETS
	@OneToMany
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
}