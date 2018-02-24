package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "t702")
@JsonPropertyOrder({ "ID__CHAVE_SEQUENCIAL", "SQL", "TIPO_DO_BANCO_DE_DADOS", "COMANDO_SQL_ID" })
public class SQL_ITEM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_702")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_702_701", foreignKey = @ForeignKey(name = "r2_702_701"))
	@JsonManagedReference
	@JsonProperty("SQL")
	private SQL SQL;

	@OneToOne
	@JoinColumn(name = "c3_702_5002", foreignKey = @ForeignKey(name = "r3_702_5002"))
	@JsonManagedReference
	@JsonProperty("TIPO_DO_BANCO_DE_DADOS")
	private TIPO_VALOR TIPO_DO_BANCO_DE_DADOS;

	@Column(name = "c4_702_5501")
	@JsonProperty("COMANDO_SQL_ID")
	private Integer COMANDO_SQL_ID;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public SQL getSQL() {
		return this.SQL;
	}

	public void setSQL(SQL SQL) {
		this.SQL = SQL;
	}

	@JsonIgnore
	public TIPO_VALOR getTIPO_DO_BANCO_DE_DADOS() {
		return this.TIPO_DO_BANCO_DE_DADOS;
	}

	public void setTIPO_DO_BANCO_DE_DADOS(TIPO_VALOR TIPO_DO_BANCO_DE_DADOS) {
		this.TIPO_DO_BANCO_DE_DADOS = TIPO_DO_BANCO_DE_DADOS;
	}

	@JsonIgnore
	public Integer getCOMANDO_SQL_ID() {
		return this.COMANDO_SQL_ID;
	}

	public void setCOMANDO_SQL_ID(Integer COMANDO_SQL_ID) {
		this.COMANDO_SQL_ID = COMANDO_SQL_ID;
	}

}
