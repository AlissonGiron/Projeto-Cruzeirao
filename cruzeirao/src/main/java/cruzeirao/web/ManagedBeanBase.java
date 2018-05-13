package cruzeirao.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import cruzeirao.core.CoreBase;
import cruzeirao.data.RepositoryBase;

@ManagedBean
@SessionScoped
public abstract class ManagedBeanBase <T, R extends RepositoryBase<T>, C extends CoreBase<T, R>> {
	
	private CoreBase<T, R> _core;
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
	public void setTipoGenerico(T _tipoGenerico) {
		this._tipoGenerico = _tipoGenerico;
	}
	
	public List<T> getTiposGenericos() {
		return _tiposGenericos;
	}
	public void setTiposGenericos(List<T> _tiposGenericos) {
		this._tiposGenericos = _tiposGenericos;
	}

	public T get(int id) {
		return _core.get(id);
	}
	
	public List<T> getAll() {
		return _core.getAll();
	}
	
	public String create() {
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