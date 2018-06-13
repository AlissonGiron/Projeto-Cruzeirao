package cruzeirao.models;

import java.util.ArrayList;
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
	
	private ArrayList<Gol> golMandantes = new ArrayList<Gol>();
	private ArrayList<Gol> golVisitantes = new ArrayList<Gol>();
	private ArrayList<Cartao> cartoesMandante = new ArrayList<Cartao>();
	private ArrayList<Cartao> cartoesVisitante = new ArrayList<Cartao>();
	
	@OneToMany
	public ArrayList<Gol> getGolMandantes() {
		return golMandantes;
	}
	public void setGolMandantes(ArrayList<Gol> golMandantes) {
		this.golMandantes = golMandantes;
	}
	
	@OneToMany
	public ArrayList<Gol> getGolVisitantes() {
		return golVisitantes;
	}
	public void setGolVisitantes(ArrayList<Gol> golVisitantes) {
		this.golVisitantes = golVisitantes;
	}
	
	@OneToMany
	public ArrayList<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(ArrayList<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	
	@OneToMany
	public ArrayList<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}
	public void setCartoesVisitante(ArrayList<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}
	
	public boolean foraProximoJogo(Jogador jogador) {
		
		if(jogador.getCartoes() == "VERMELHO")
			return true; //jogador fora do proximo jogo
		return false;
	}
	
	public boolean penaltis() //Se houver empate no tempo regulamentar, a decisão será feita na cobrança de pênaltis
	{
		if(golMandantes == golVisitantes)
			return true;
		
		return false;
	}
}

