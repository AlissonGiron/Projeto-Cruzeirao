package cruzeirao.web;

import cruzeirao.core.JogadorCore;
import cruzeirao.data.JogadorRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.models.Jogador;

public class JogadorMB extends ManagedBeanBase<Jogador, JogadorRepository, JogadorCore> {

	public JogadorMB() {
		super();
	}

	public Sexo[] getSexo() {
		return Sexo.values();
	}

	@Override
	public Jogador getNewInstanceOfT() {
		return new Jogador();
	}

	@Override
	public JogadorCore getNewInstanceOfC() {
		return new JogadorCore();
	}
}