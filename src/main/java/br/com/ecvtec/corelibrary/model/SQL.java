package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t701")
public class SQL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_701")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@Column(name = "c2_701")
	@JsonProperty("DESCRICAO")
	@NotNull
	@Size(max = 40, message = "DESCRICAO deve possuir no maximo {max} caracteres.")
	private String DESCRICAO;

	@OneToMany(mappedBy = "SQL")
	@JsonBackReference
	private Set<SQL_ITEM> SQL_SQL_ITEMs;

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
	public Set<SQL_ITEM> getSQL_SQL_ITEMs() {
		return this.SQL_SQL_ITEMs;
	}

	public void setSQL_SQL_ITEMs(Set<SQL_ITEM> SQL_SQL_ITEMs) {
		this.SQL_SQL_ITEMs = SQL_SQL_ITEMs;
	}

}
