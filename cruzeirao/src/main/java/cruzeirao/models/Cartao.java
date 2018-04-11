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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import cruzeirao.data.enums.TipoCartao;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="CARTAO")
public class Cartao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Column(name="CARTOES_JOGADORES", nullable=false) 
	private Jogador jogador;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="TIPO_CARTAO", nullable=false)
	private Enum<TipoCartao> tipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TEMPO_DE_JOGO", nullable=false)
	private Calendar tempo;
	
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public Enum<TipoCartao> getTipo() {
		return tipo;
	}
	public void setTipo(Enum<TipoCartao> tipo) {
		this.tipo = tipo;
	}
	public Calendar getTempo() {
		return tempo;
	}
	public void setTempo(Calendar tempo) {
		this.tempo = tempo;
	}	
}

