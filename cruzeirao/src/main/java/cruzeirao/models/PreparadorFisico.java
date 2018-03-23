package cruzeirao.models;

import cruzeirao.data.enums.Documento;

public class PreparadorFisico extends Usuario {

	public PreparadorFisico() {
		this.setTipoDocumento(Documento.CREF);
	}
}