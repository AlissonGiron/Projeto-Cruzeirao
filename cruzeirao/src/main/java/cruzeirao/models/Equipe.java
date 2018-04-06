package cruzeirao.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="EQUIPE")
@PrimaryKeyJoinColumn(name="ID_INSCRICAO", referencedColumnName="ID")
public class Equipe {
	@OneToOne
	@JoinColumn(name="NOME", referencedColumnName="ID")
	private String nome;
	
	@OneToOne
	@JoinColumn(name="CIDADE", referencedColumnName="ID")
	private String cidade;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_FUNDACAO", nullable=true)
	private Date dataFundacao;
	
	@OneToMany
	@Column(name="DIRETORES", nullable=true)
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

