package cruzeirao.web;

import cruzeirao.models.Usuario;

public class UsuarioMB extends ManagedBeanBase<Usuario> {

	public UsuarioMB(Class<Usuario> tipoClasse) {
		super(tipoClasse);
	}

	@Override
	public boolean isValid() {
		
		if(get().getNome().length() < 3) return false;
		
		return true;
	}
}