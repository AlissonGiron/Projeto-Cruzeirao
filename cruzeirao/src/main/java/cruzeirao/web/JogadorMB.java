package cruzeirao.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeirao.core.JogadorCore;
import cruzeirao.data.JogadorRepository;
import cruzeirao.data.enums.Sexo;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.models.Jogador;

@ManagedBean
@SessionScoped
public class JogadorMB extends ManagedBeanBase<Jogador, JogadorRepository, JogadorCore> {

	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}
	
	public Sexo[] getSexos() {
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

	@Override
	public Boolean validate(Jogador tipoGenerico) {
		return true;
	}
}