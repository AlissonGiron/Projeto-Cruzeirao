package cruzeirao.web;

import cruzeirao.data.enums.Documento;
import cruzeirao.models.PreparadorFisico;
import cruzeirao.models.Usuario;

public class UsuarioMB extends ManagedBeanBase<Usuario> {

	public UsuarioMB(Class<Usuario> tipoClasse) {
		super(tipoClasse);
	}

	@Override
	public boolean isValid() {
		
		if(get().getNome().length() < 3) return false;
		if(get().getEmail().length() < 8) return false;
		if(get().getTelefoneFixo().length() < 8 && get().getTelefoneMovel().length() < 8) return false;
		if(get().getEndereco().length() < 7) return false;
		
		if(get() instanceof PreparadorFisico) {
			if(!get().getTipoDocumento().equals(Documento.CREF)) return false;
		}
		
		if(get().getTipoDocumento().equals(Documento.RG)) {
			if(get().getDocumento().length() != 9) return false;
		}
		else if(get().getTipoDocumento().equals(Documento.CPF)) {
			if(get().getDocumento().length() != 11) return false;
		}
		
		return true;
	}
}