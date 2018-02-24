package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t5501")
public class MIDIA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_5501")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_5501")
	@JsonProperty("DESCRICAO")
	@Size(max = 40, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	private String DESCRICAO;

	@OneToOne
	@JoinColumn(name = "c3_5501_5002", foreignKey = @ForeignKey(name = "r3_5501_5002"))
	@JsonManagedReference
	private TIPO_VALOR TIPO_DA_IMAGEM;

	@Column(name = "c4_5501")
	@JsonIgnore
	private byte[] IMAGEM;

	@Column(name = "c5_5501")
	@JsonProperty("DATA_E_HORA")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Calendar DATA_E_HORA;

	@Column(name = "c6_5501")
	@JsonProperty("URL")
	@Size(max = 160, message = "URL deve possuir no maximo {max} caracteres.")
	private String URL;

	@Transient
	private String urlDownload;

	public String getUrlDownload() {
		return urlDownload;
	}

	public void setUrlDownload(String urlDownload) {
		this.urlDownload = urlDownload;
	}

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DA_IMAGEM() {
		return this.TIPO_DA_IMAGEM;
	}

	public void setTIPO_DA_IMAGEM(TIPO_VALOR TIPO_DA_IMAGEM) {
		this.TIPO_DA_IMAGEM = TIPO_DA_IMAGEM;
	}

	@JsonIgnore
	public byte[] getIMAGEM() {
		return this.IMAGEM;
	}

	public void setIMAGEM(byte[] IMAGEM) {
		this.IMAGEM = IMAGEM;
	}

	@JsonIgnore
	public Calendar getDATA_E_HORA() {
		return this.DATA_E_HORA;
	}

	public void setDATA_E_HORA(Calendar DATA_E_HORA) {
		this.DATA_E_HORA = DATA_E_HORA;
	}

	@JsonIgnore
	public String getURL() {
		return this.URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}
	/*
	 * public Set<ENTIDADE_IMAGEM> getIMAGEM_ENTIDADE_IMAGEMs() { return
	 * this.IMAGEM_ENTIDADE_IMAGEMs; }
	 * 
	 * public void setIMAGEM_ENTIDADE_IMAGEMs(Set<ENTIDADE_IMAGEM>
	 * IMAGEM_ENTIDADE_IMAGEMs) { this.IMAGEM_ENTIDADE_IMAGEMs =
	 * IMAGEM_ENTIDADE_IMAGEMs; } public Set<INSUMO_IMAGEM>
	 * getTABELA_DE_FOTOS_INSUMO_IMAGEMs() { return
	 * this.TABELA_DE_FOTOS_INSUMO_IMAGEMs; }
	 * 
	 * public void setTABELA_DE_FOTOS_INSUMO_IMAGEMs(Set<INSUMO_IMAGEM>
	 * TABELA_DE_FOTOS_INSUMO_IMAGEMs) { this.TABELA_DE_FOTOS_INSUMO_IMAGEMs =
	 * TABELA_DE_FOTOS_INSUMO_IMAGEMs; } public Set<SQL_ITEM>
	 * getCOMANDO_SQL_SQL_ITEMs() { return this.COMANDO_SQL_SQL_ITEMs; }
	 * 
	 * public void setCOMANDO_SQL_SQL_ITEMs(Set<SQL_ITEM>
	 * COMANDO_SQL_SQL_ITEMs) { this.COMANDO_SQL_SQL_ITEMs =
	 * COMANDO_SQL_SQL_ITEMs; }
	 */

}
