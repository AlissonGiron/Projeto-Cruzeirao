package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.Jogador;

public class JogadorService {
	
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public void salvar(Jogador jogador)
	{
		jogadores.add(jogador);
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}	
}
