package cruzeirao.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="LOCAL")
public class Local {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Column(name="NUMERO", nullable=false)
	private int numero;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@Column(name="ENDERECO", nullable=false)
	private String endereco;
	
	@Column(name="BAIRRO", nullable=false)
	private String bairro;
	
	@Column(name="CIDADE", nullable=false)
	private String cidade;
	
	@Column(name="CEP", nullable=false)
	private String CEP;
	
	@Column(name="TELEFONE", nullable=false)
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
}