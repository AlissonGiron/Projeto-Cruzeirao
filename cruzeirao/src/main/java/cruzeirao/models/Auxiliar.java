package cruzeirao.models;

import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="AUXILIAR")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Auxiliar extends Usuario {
	
	private ArrayList<Inscrito> inscricaoEmCampeonatos = new ArrayList<Inscrito>();

	// GETS AND SETS
	@OneToMany(mappedBy="inscrito")
	public ArrayList<Inscrito> getInscricaoEmCampeonatos() {
		return inscricaoEmCampeonatos;
	}
	public void setInscricaoEmCampeonatos(ArrayList<Inscrito> inscricoes) {
		this.inscricaoEmCampeonatos = inscricoes;
	}
}