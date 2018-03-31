package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
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
	@Column(name="EQUIPES", nullable=true)
	private List<Equipe> equipes = new ArrayList<Equipe>();

	// GETS AND SETS
	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
}