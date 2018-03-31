package cruzeirao.models;

import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import cruzeirao.data.interfaces.IntegranteEquipe;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="TECNICO")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Tecnico extends Usuario  implements IntegranteEquipe {
	
	@OneToMany
	@Column(name="INSCRICAO_EM_CAMPEONATOS", nullable=true)
	private ArrayList<Inscrito> inscricaoEmCampeonatos;

	// GETS AND SETS
	public ArrayList<Inscrito> getInscricaoEmCampeonatos() {
		return inscricaoEmCampeonatos;
	}
	public void setInscricaoEmCampeonatos(ArrayList<Inscrito> inscricoes) {
		this.inscricaoEmCampeonatos = inscricoes;
	}
}