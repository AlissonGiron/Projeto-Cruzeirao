package cruzeirao.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipe {
	private String nome, cidade;
	private Date dataFundacao;
	private List<Diretor> diretores = new ArrayList<Diretor>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public List<Diretor> getDiretores() {
		return diretores;
	}
	public void setDiretores(List<Diretor> diretores) {
		this.diretores = diretores;
	}
}
