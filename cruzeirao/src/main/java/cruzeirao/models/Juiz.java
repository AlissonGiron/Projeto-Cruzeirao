package cruzeirao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import cruzeirao.data.enums.TipoJuiz;

@Entity
@Table(name="JUIZ")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class Juiz extends Usuario {
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="TIPO_JUIZ", nullable=false)
	private Enum<TipoJuiz> tipo;

	// GETS AND SETS
	public Enum<TipoJuiz> getTipo() {
		return tipo;
	}
	public void setTipo(Enum<TipoJuiz> tipo) {
		this.tipo = tipo;
	}
}