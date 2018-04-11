/*package cruzeirao.models;

import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="TORCEDOR")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Torcedor extends Usuario {
	
	@OneToMany
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();

	// GETS AND SETS
	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}
}*/