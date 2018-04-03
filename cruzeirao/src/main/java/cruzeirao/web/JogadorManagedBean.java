package cruzeirao.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.models.Jogador;

@ManagedBean
@SessionScoped
public class JogadorManagedBean {
	
	private Jogador jogador = new Jogador();
	private JogadorService service = new JogadorService();
	
	public void salvar()
	{
		service.salvar(jogador);
		jogador = new Jogador();
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public List<Jogador> getJogadores(){
		return service.getJogadores();
	}
}
