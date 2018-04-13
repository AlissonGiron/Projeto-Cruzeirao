package cruzeirao.models;

import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="EQUIPE")
public class Equipe {
	private int id;
	private String nome;
	private String cidade;
	private Calendar dataFundacao;
	private ArrayList<Diretor> diretores = new ArrayList<Diretor>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="NOME", nullable=false)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="CIDADE", nullable=false)
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_FUNDACAO", nullable=false)
	public Calendar getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	@ManyToMany(mappedBy="equipes")
	public ArrayList<Diretor> getDiretores() {
		return diretores;
	}
	public void setDiretores(ArrayList<Diretor> diretores) {
		this.diretores = diretores;
	}
}