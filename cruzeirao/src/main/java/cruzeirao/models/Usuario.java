package cruzeirao.models;

import java.util.Date;

import cruzeirao.data.enums.Documento;
import cruzeirao.data.enums.Sexo;

public abstract class Usuario {
	private String nome;
	private Date dataNascimento;
	private Enum<Documento> tipoDocumento;
	private String documento;
	private String email;
	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private Enum<Sexo> sexo;
	private String foto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Enum<Documento> getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(Enum<Documento> tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneMovel() {
		return telefoneMovel;
	}
	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Enum<Sexo> getSexo() {
		return sexo;
	}
	public void setSexo(Enum<Sexo> sexo) {
		this.sexo = sexo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}