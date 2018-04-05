package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.PreparadorFisico;

public class PreparadorFisicoService {
	
	private ArrayList<PreparadorFisico> preparadoresFisico = new ArrayList<PreparadorFisico>();
	
	public void salvar(PreparadorFisico preparadorFisico) {
		preparadoresFisico.add(preparadorFisico);
	}

	public ArrayList<PreparadorFisico> getPreparadoresFisico() {
		return preparadoresFisico;
	}
}
