package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="DIRETOR")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Diretor extends Usuario {
	
	@ManyToMany
	@JoinTable( 
		name ="DIRETOR_EQUIPE",
		joinColumns = @JoinColumn(name ="ID"),
		inverseJoinColumns = @JoinColumn(name="ID")
	)
	private List<Equipe> equipes = new ArrayList<Equipe>();

	// GETS AND SETS
	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
}