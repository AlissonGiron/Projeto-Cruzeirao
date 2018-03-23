package cruzeirao.models;

import cruzeirao.data.enums.TipoJuiz;

public class Juiz extends Usuario {
	private Enum<TipoJuiz> tipo;

	public Enum<TipoJuiz> getTipo() {
		return tipo;
	}
	public void setTipo(Enum<TipoJuiz> tipo) {
		this.tipo = tipo;
	}
}