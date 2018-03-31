package cruzeirao.data.interfaces;

import java.util.ArrayList;
import cruzeirao.models.Inscrito;

public interface IntegranteEquipe {
	
	public ArrayList<Inscrito> getInscricaoEmCampeonatos();
	public void setInscricaoEmCampeonatos(ArrayList<Inscrito> inscricoes);
}