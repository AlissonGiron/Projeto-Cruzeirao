package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="PARTIDA_FUTEBOL")
@Inheritance(strategy=InheritanceType.JOINED)
public class PartidaFutebol extends Partida {
	
	@OneToMany
	private ArrayList<Gol> golMandantes = new ArrayList<Gol>();
	
	@OneToMany
	private ArrayList<Gol> golVisitantes = new ArrayList<Gol>();
	
	@OneToMany
	private ArrayList<Cartao> cartoesMandante = new ArrayList<Cartao>();
	
	@OneToMany
	private ArrayList<Cartao> cartoesVisitante = new ArrayList<Cartao>();
	
	public ArrayList<Gol> getGolMandantes() {
		return golMandantes;
	}
	public void setGolMandantes(ArrayList<Gol> golMandantes) {
		this.golMandantes = golMandantes;
	}
	public ArrayList<Gol> getGolVisitantes() {
		return golVisitantes;
	}
	public void setGolVisitantes(ArrayList<Gol> golVisitantes) {
		this.golVisitantes = golVisitantes;
	}
	public ArrayList<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(ArrayList<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public ArrayList<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}
	public void setCartoesVisitante(ArrayList<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}
	
}

