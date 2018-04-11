package cruzeirao.models;

import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import cruzeirao.data.interfaces.IntegranteEquipe;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="AUXILIAR")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Auxiliar extends Usuario  implements IntegranteEquipe {
	
	@OneToMany(mappedBy="inscrito")
	private ArrayList<Inscrito> inscricaoEmCampeonatos;

	// GETS AND SETS
	public ArrayList<Inscrito> getInscricaoEmCampeonatos() {
		return inscricaoEmCampeonatos;
	}
	public void setInscricaoEmCampeonatos(ArrayList<Inscrito> inscricoes) {
		this.inscricaoEmCampeonatos = inscricoes;
	}
}