//package cruzeirao.data.converters;
//
//import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//import cruzeirao.data.enums.Sexo;
//
//// Conversão automática do tipo pelo JPA, não é necessário usar @Convert nas entidades.
//@Converter(autoApply = true)
//public class SexoConverter implements AttributeConverter<Sexo, String> {
//
//	@Override
//	public String convertToDatabaseColumn(Sexo sexo) {
//		switch (sexo) {
//		case FEMININO: return "F";
//		case MASCULINO: return "M";
//		case OUTRO: return "O";
//		default: throw new IllegalArgumentException("Unknown" + sexo);
//		}
//	}
//
//	@Override
//	public Sexo convertToEntityAttribute(String sexo) {
//		switch (sexo) {
//			case "F": return Sexo.FEMININO;
//			case "M": return Sexo.MASCULINO;
//			case "O": return Sexo.OUTRO;
//			default: throw new IllegalArgumentException("Unknown" + sexo);
//		}
//	}
//}