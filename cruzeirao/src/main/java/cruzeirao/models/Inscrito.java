package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

public class Inscrito {
	private boolean aceitaUsuario, inscricaoValida;
	private List<Inscrito> inscricoes = new ArrayList<Inscrito>();
	
	public boolean isAceitaUsuario() {
		return aceitaUsuario;
	}
	public void setAceitaUsuario(boolean aceitaUsuario) {
		this.aceitaUsuario = aceitaUsuario;
	}
	public boolean isInscricaoValida() {
		return inscricaoValida;
	}
	public void setInscricaoValida(boolean inscricaoValida) {
		this.inscricaoValida = inscricaoValida;
	}
	public List<Inscrito> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}
	
}
