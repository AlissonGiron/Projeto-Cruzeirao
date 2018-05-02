package cruzeirao.models;

import java.util.Calendar;
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
	
	private int id;
	private String nome;
	private String apelidoCamiseta;
	private Calendar dataNascimento;
	private Sexo sexo;
	private TipoDocumento tipoDocumento;
	private String documento;
	private String email;
	private String telefone1;
	private String telefone2;
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
	
	@Column(name="APELIDO_CAMISETA", nullable=false)
	public String getApelidoCamiseta() {
		return apelidoCamiseta;
	}
	public void setApelidoCamiseta(String apelidoCamiseta) {
		this.apelidoCamiseta = apelidoCamiseta;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_NASCIMENTO", nullable=false)
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	// Usando auto converter (F/M)
	@Enumerated(EnumType.ORDINAL)
	@Column(name="SEXO", nullable=false, length=1)
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