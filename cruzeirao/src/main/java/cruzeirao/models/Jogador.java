package cruzeirao.models;

import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="JOGADOR")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Jogador extends Usuario {
	
	private ArrayList<Inscrito> inscricaoEmCampeonatos = new ArrayList<Inscrito>();
	private ArrayList<Cartao> cartoes = new ArrayList<Cartao>();

	// GETS AND SETS
	@OneToMany(mappedBy="inscrito")
	public ArrayList<Inscrito> getInscricaoEmCampeonatos() {
		return inscricaoEmCampeonatos;
	}
	public void setInscricaoEmCampeonatos(ArrayList<Inscrito> inscricoes) {
		this.inscricaoEmCampeonatos = inscricoes;
	}
	
	@OneToMany(mappedBy="jogador")
	public ArrayList<Cartao> getCartoes() {
		return cartoes;
	}
	public void setCartoes(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
}