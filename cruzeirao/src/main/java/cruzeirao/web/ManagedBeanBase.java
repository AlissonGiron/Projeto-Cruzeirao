package cruzeirao.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import cruzeirao.core.CoreBase;
import cruzeirao.data.RepositoryBase;

@ManagedBean
@SessionScoped
public abstract class ManagedBeanBase <T, R extends RepositoryBase<T>, C extends CoreBase<T, R>> {
	
	private C _core;
	private List<T> _tiposGenericos;
	private T _tipoGenerico;
	
	public ManagedBeanBase() {
		_core = getNewInstanceOfC();
		_tipoGenerico = getNewInstanceOfT();
		_tiposGenericos = getAll();
	}
	
	public abstract T getNewInstanceOfT();
	public abstract C getNewInstanceOfC();
	
	public T getTipoGenerico() {
		return _tipoGenerico;
	}
	public void setTipoGenerico(T tipoGenerico) {
		_tipoGenerico = tipoGenerico;
	}
	
	public List<T> getTiposGenericos() {
		_tiposGenericos = getAll();
		return _tiposGenericos;
	}
	public void setTiposGenericos(List<T> tiposGenericos) {
		_tiposGenericos = tiposGenericos;
	}

	public T get(int id) {
		return _core.get(id);
	}
	
	public List<T> getAll() {
		return _core.getAll();
	}
	
	public abstract Boolean validate(T tipoGenerico);
	
	public String create() {
		if (!validate(_tipoGenerico)) {
			return "create.xhtml";
		}
		
		_core.add(_tipoGenerico);
		_tipoGenerico = getNewInstanceOfT();
		return "index.xhtml";
	}
	
	public String edit() {
		_core.edit(_tipoGenerico);
		_tipoGenerico = getNewInstanceOfT();
		return "index.xhtml";
	}
	
	public String edit(T tipoGenerico) {
		_tipoGenerico =  tipoGenerico;
		return "edit.xhtml";
	}
	
	public String delete(T tipoGenericoDelete) {
		if(tipoGenericoDelete == null) return "index.xhtml";
		
		_tiposGenericos.remove(tipoGenericoDelete);
		_core.delete(tipoGenericoDelete);
		
		return "index.xhtml";
	}
	
	@Override
	protected void finalize() throws Throwable {
		_core.close();
		super.finalize();
	}
}