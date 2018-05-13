package cruzeirao.data.enums;

public enum Sexo {
	FEMININO("Feminino"),
	MASCULINO("Masculino"),
	OUTRO("Outro");
	
	private String label;
	
	private Sexo(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}