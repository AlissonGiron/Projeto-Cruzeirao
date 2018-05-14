package cruzeirao.core;

import cruzeirao.data.JogadorRepository;
import cruzeirao.models.Jogador;

public class JogadorCore extends CoreBase<Jogador, JogadorRepository> {

	public JogadorCore() {
		super(new JogadorRepository(), "Jogador");
	}
}