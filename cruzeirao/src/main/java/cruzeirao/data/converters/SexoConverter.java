package cruzeirao.data.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import cruzeirao.data.enums.Sexo;

// Convers�o autom�tica do tipo pelo JPA, n�o � necess�rio usar @Convert nas entidades.
@Converter(autoApply = true)
public class SexoConverter implements AttributeConverter<Sexo, String> {

	@Override
	public String convertToDatabaseColumn(Sexo sexo) {
		switch (sexo) {
		case FEMININO: return "F";
		case MASCULINO: return "M";
		default: throw new IllegalArgumentException("Unknown" + sexo);
		}
	}

	@Override
	public Sexo convertToEntityAttribute(String sexo) {
		switch (sexo) {
			case "F": return Sexo.FEMININO;
			case "M": return Sexo.MASCULINO;
			default: throw new IllegalArgumentException("Unknown" + sexo);
		}
	}
}