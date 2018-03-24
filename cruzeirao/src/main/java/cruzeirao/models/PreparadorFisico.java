package cruzeirao.models;

import java.util.ArrayList;

import cruzeirao.data.enums.Documento;
import cruzeirao.data.interfaces.IntegranteEquipe;

public class PreparadorFisico extends Usuario implements IntegranteEquipe {
	private ArrayList<Inscrito> inscricoes;

	public PreparadorFisico() {
		this.setTipoDocumento(Documento.CREF);
	}
	
	public ArrayList<Inscrito> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}
}