package cruzeirao.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fase {
	private Date dataInicio, dataFim;
	private Enum formato;
	private Categoria categoria;
	private int numeroFase;
	private List<Grupo> grupos = new ArrayList<Grupo>();
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Enum getFormato() {
		return formato;
	}
	public void setFormato(Enum formato) {
		this.formato = formato;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getNumeroFase() {
		return numeroFase;
	}
	public void setNumeroFase(int numeroFase) {
		this.numeroFase = numeroFase;
	}
	public List<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
}
