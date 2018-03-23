package cruzeirao.web;

import cruzeirao.core.CoreBase;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public abstract class ManagedBeanBase<T> {
	
    private Class<T> tipoClasse;
    private T tipo;
	private CoreBase coreBase = new CoreBase();
	
    public ManagedBeanBase(Class<T> tipoClasse){
        this.tipoClasse = tipoClasse;
    }

	public void salvar()
	{
		coreBase.salvar(tipo);
		tipo = tipoClasse.newInstance();
	}

	public T get() {
		return tipo;
	}

	public void set(T tipo) {
		this.tipo = tipo;
	}

	public ArrayList<T> getAll() {
		return coreBase.getAll();
	}
}