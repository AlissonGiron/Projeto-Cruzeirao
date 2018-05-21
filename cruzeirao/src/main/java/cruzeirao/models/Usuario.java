package cruzeirao.models;

import java.util.Calendar;
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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import cruzeirao.data.enums.TipoDocumento;
import cruzeirao.data.enums.Sexo;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="USUARIO")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Usuario {
	
	private int id;
	@Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres")
	private String nome;
	private String apelidoCamiseta;
	@NotNull(message = "Preencha a data de nascimento")
	@Past(message = "A data de nascimento deve ser no passado")
	private Date dataNascimento;
	@NotNull(message = "Defina um sexo")
	private Sexo sexo;
	@NotNull(message = "Escolha um tipo de documento")
	private TipoDocumento tipoDocumento;
	@Size(min = 1, message = "Preencha o documento")
	private String documento;
	@Size(min = 1, message = "Digite um email")
	@Email(message = "Digite um email válido")
	private String email;
	private String telefone1;
	private String telefone2;
	@Size(min = 1, message = "Digite um endereço")
	private String endereco;
	private byte[] foto;
	
	// GETS AND SETS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int codigo) {
		this.id = codigo;
	}
	
	@Column(name="NOME", nullable=false)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.trim();
	}
	
	@Column(name="APELIDO_CAMISETA", nullable=true)
	public String getApelidoCamiseta() {
		return apelidoCamiseta;
	}
	public void setApelidoCamiseta(String apelidoCamiseta) {
		this.apelidoCamiseta = apelidoCamiseta;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_NASCIMENTO", nullable=false)
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="SEXO", nullable=false)
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="TIPO_DOCUMENTO", nullable=false)
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	@Column(name="DOCUMENTO", nullable=false)
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento.trim();
	}
	
	@Column(name="EMAIL", nullable=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email != null) {
			this.email = email.trim();
		}
	}
	
	@Column(name="TELEFONE_1", nullable=false)
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	
	@Column(name="TELEFONE_2", nullable=true)
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	
	@Column(name="ENDERECO", nullable=false)
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco.trim();
	}
	
	@Lob
	@Column(name="FOTO", nullable=true)
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
}