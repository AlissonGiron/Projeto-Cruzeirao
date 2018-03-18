package cruzeirao.models;

public class Juiz extends Usuario {
	private Enum<TipoJuiz> tipo;

	public Enum<TipoJuiz> getTipo() {
		return tipo;
	}
	public void setTipo(Enum<TipoJuiz> tipo) {
		this.tipo = tipo;
	}
}