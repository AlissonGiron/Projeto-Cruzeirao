package cruzeirao.web;
/*
import cruzeirao.core.CoreBase;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public abstract class ManagedBeanBase<T> {
	
    private Class<T> tipoClasse;
    private T tipo;
	private CoreBase<T> coreBase;
	
    public ManagedBeanBase(Class<T> tipoClasse){
        this.tipoClasse = tipoClasse;
        
        coreBase = new CoreBase<T>(tipoClasse, );
    }

	public void salvar()
	{
		if(!isValid()) return;
		
		coreBase.salvar(tipo);
		tipo = tipoClasse.newInstance();
	}

	public abstract boolean isValid();
	
	public T get() {
		return tipo;
	}

	public void set(T tipo) {
		this.tipo = tipo;
	}

	public ArrayList<T> getAll() {
		return coreBase.getAll();
	}
}*/