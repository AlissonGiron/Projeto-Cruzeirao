package cruzeirao.web;

import java.util.ArrayList;

import cruzeirao.models.Massagista;

public class MassagistaService {
	
	private ArrayList<Massagista> massagistas = new ArrayList<Massagista>();
	
	public void salvar(Massagista massagista)
	{
		massagistas.add(massagista);
	}

	public ArrayList<Massagista> getMassagistas() {
		return massagistas;
	}
}
