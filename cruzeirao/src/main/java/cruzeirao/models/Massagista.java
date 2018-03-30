package cruzeirao.models;

import java.util.ArrayList;

import cruzeirao.data.interfaces.IntegranteEquipe;

public class Massagista extends Usuario implements IntegranteEquipe {
	private ArrayList<Inscrito> inscricoes;

	public ArrayList<Inscrito> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}
}