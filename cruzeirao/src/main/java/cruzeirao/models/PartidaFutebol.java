package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
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
	@Column(name="GOL_MANDANTES", nullable=true)
	private List<Gol> golMandantes = new ArrayList<Gol>();
	
	@OneToMany
	@Column(name="GOL_VISITANTES", nullable=true)
	private List<Gol> golVisitantes = new ArrayList<Gol>();
	
	@OneToMany
	@Column(name="CARTAO_MANDANTES", nullable=true)
	private List<Cartao> cartoesMandante = new ArrayList<Cartao>();
	
	@OneToMany
	@Column(name="CARTAO_VISITANTES", nullable=true)
	private List<Cartao> cartoesVisitante = new ArrayList<Cartao>();
	
	public List<Gol> getGolMandantes() {
		return golMandantes;
	}
	public void setGolMandantes(List<Gol> golMandantes) {
		this.golMandantes = golMandantes;
	}
	public List<Gol> getGolVisitantes() {
		return golVisitantes;
	}
	public void setGolVisitantes(List<Gol> golVisitantes) {
		this.golVisitantes = golVisitantes;
	}
	public List<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(List<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public List<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}
	public void setCartoesVisitante(List<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}
	
}

