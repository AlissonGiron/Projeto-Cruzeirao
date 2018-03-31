package cruzeirao.models;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.data.enums.Sexo;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="USUARIO")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@Column(name="APELIDO_CAMISETA", nullable=false)
	private String apelidoCamiseta;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_NASCIMENTO", nullable=false)
	private Date dataNascimento = new Date();
	
	// Usando auto converter (F/M)
	@Enumerated(EnumType.ORDINAL)
	@Column(name="SEXO", nullable=false)
	private Enum<Sexo> sexo;

	@Enumerated(EnumType.ORDINAL)
	@Column(name="TIPO_DOCUMENTO", nullable=false)
	private Enum<TipoDocumento> tipoDocumento;
	
	@Column(name="DOCUMENTO", nullable=false)
	private String documento;
	
	@Column(name="EMAIL", nullable=true)
	private String email;
	
	@Column(name="TELEFONE_1", nullable=false)
	private String telefone1;
	
	@Column(name="TELEFONE_2", nullable=true)
	private String telefone2;
	
	@Column(name="ENDERECO", nullable=false)
	private String endereco;
	
	@Lob
	@Column(name="FOTO", nullable=true)
	private byte[] foto;
	
	
	// GETS AND SETS
	public int getId() {
		return id;
	}
	public void setId(int codigo) {
		this.id = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.trim();
	}
	
	public String getApelidoCamiseta() {
		return apelidoCamiseta;
	}
	public void setApelidoCamiseta(String apelidoCamiseta) {
		this.apelidoCamiseta = apelidoCamiseta;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Enum<Sexo> getSexo() {
		return sexo;
	}
	public void setSexo(Enum<Sexo> sexo) {
		this.sexo = sexo;
	}
	
	public Enum<TipoDocumento> getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(Enum<TipoDocumento> tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento.trim();
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email.trim();
	}
	
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco.trim();
	}
	
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
}