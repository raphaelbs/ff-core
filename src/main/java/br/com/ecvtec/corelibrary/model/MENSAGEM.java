package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t6501")
public class MENSAGEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_6501")
	private Integer CHAVE_SEQUENCIAL_PRIMARIA;

	@OneToOne
	@JoinColumn(name = "c2_6501_1001", foreignKey = @ForeignKey(name = "r2_6501_1001"))
	@NotNull
	@JsonManagedReference
	private ENTIDADE COLIGADA;

	@OneToOne
	@JoinColumn(name = "c3_6501_1001", foreignKey = @ForeignKey(name = "r3_6501_1001"))
	@JsonManagedReference
	private ENTIDADE REMETENTE;

	@OneToOne
	@JoinColumn(name = "c4_6501_1005", foreignKey = @ForeignKey(name = "r4_6501_1005"))
	@JsonManagedReference
	private ENTIDADE_AGENDA REMETENTE_AGENDA;

	@OneToOne
	@JoinColumn(name = "c5_6501_5002", foreignKey = @ForeignKey(name = "r5_6501_5002"))
	@NotNull
	@JsonManagedReference
	private TIPO_VALOR TIPO_MENSAGEM;

	@Column(name = "c6_6501")
	@NotNull
	private Date HORARIO;

	@Column(name = "c7_6501")
	@Size(max = 160, message = "TITULO deve possuir no maximo {max} caracteres.")
	private String TITULO;

	@JsonBackReference
	@OneToMany(mappedBy = "MENSAGEM", cascade = CascadeType.ALL)
	@JsonProperty("MENSAGEM_MENSAGEM_ANEXOs")
	private Set<MENSAGEM_ANEXO> MENSAGEM_MENSAGEM_ANEXOs;

	@OneToMany(mappedBy = "MENSAGEM", cascade = CascadeType.ALL)
	@JsonBackReference
	@JsonProperty("MENSAGEM_MENSAGEM_DESTINATARIOs")
	private Set<MENSAGEM_DESTINATARIO> MENSAGEM_MENSAGEM_DESTINATARIOs;

	@JsonIgnore
	public Integer getCHAVE_SEQUENCIAL_PRIMARIA() {
		return this.CHAVE_SEQUENCIAL_PRIMARIA;
	}

	public void setCHAVE_SEQUENCIAL_PRIMARIA(Integer CHAVE_SEQUENCIAL_PRIMARIA) {
		this.CHAVE_SEQUENCIAL_PRIMARIA = CHAVE_SEQUENCIAL_PRIMARIA;
	}

	@JsonIgnore
	public ENTIDADE getCOLIGADA() {
		return this.COLIGADA;
	}

	public void setCOLIGADA(ENTIDADE COLIGADA) {
		this.COLIGADA = COLIGADA;
	}

	@JsonIgnore
	public ENTIDADE getREMETENTE() {
		return this.REMETENTE;
	}

	public void setREMETENTE(ENTIDADE REMETENTE) {
		this.REMETENTE = REMETENTE;
	}

	@JsonIgnore
	public ENTIDADE_AGENDA getREMETENTE_AGENDA() {
		return this.REMETENTE_AGENDA;
	}

	public void setREMETENTE_AGENDA(ENTIDADE_AGENDA REMETENTE_AGENDA) {
		this.REMETENTE_AGENDA = REMETENTE_AGENDA;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_MENSAGEM() {
		return this.TIPO_MENSAGEM;
	}

	public void setTIPO_MENSAGEM(TIPO_VALOR TIPO_MENSAGEM) {
		this.TIPO_MENSAGEM = TIPO_MENSAGEM;
	}

	@JsonIgnore
	public Date getHORARIO() {
		return this.HORARIO;
	}

	public void setHORARIO(Date HORARIO) {
		this.HORARIO = HORARIO;
	}

	@JsonIgnore
	public String getTITULO() {
		return this.TITULO;
	}

	public void setTITULO(String TITULO) {
		this.TITULO = TITULO;
	}

	@JsonIgnore
	public Set<MENSAGEM_DESTINATARIO> getMENSAGEM_MENSAGEM_DESTINATARIOs() {
		return MENSAGEM_MENSAGEM_DESTINATARIOs;
	}

	public void setMENSAGEM_MENSAGEM_DESTINATARIOs(Set<MENSAGEM_DESTINATARIO> MENSAGEM_MENSAGEM_DESTINATARIOs) {
		this.MENSAGEM_MENSAGEM_DESTINATARIOs = MENSAGEM_MENSAGEM_DESTINATARIOs;
	}

	@JsonIgnore
	public Set<MENSAGEM_ANEXO> getMENSAGEM_MENSAGEM_ANEXOs() {
		return MENSAGEM_MENSAGEM_ANEXOs;
	}

	public void setMENSAGEM_MENSAGEM_ANEXOs(Set<MENSAGEM_ANEXO> mENSAGEM_MENSAGEM_ANEXOs) {
		MENSAGEM_MENSAGEM_ANEXOs = mENSAGEM_MENSAGEM_ANEXOs;
	}

}
