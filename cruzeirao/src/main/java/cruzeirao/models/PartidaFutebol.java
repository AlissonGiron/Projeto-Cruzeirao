package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

public class PartidaFutebol extends Partida {
	private List<Gol> golMandantes = new ArrayList<Gol>();
	private List<Gol> golVisitantes = new ArrayList<Gol>();
	private List<Cartao> cartoesMandante = new ArrayList<Cartao>();
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
