package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe TIPO_DETALHE.<br>
 * Representa a tabela t5006 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t5006")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T5006 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMARIA (c1_5006) da tabela TIPO_DETALHE (t5006)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_5006;

	/** Campo TIPO (c2_5006_5001) da tabela TIPO_DETALHE (t5006) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_5006_5001", foreignKey = @ForeignKey(name = "r2_5006_5001"))
	private T5001 c2_5006_5001;

	/** Campo VALOR (c3_5006_5002) da tabela TIPO_DETALHE (t5006) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_5006_5002", foreignKey = @ForeignKey(name = "r3_5006_5002"))
	private T5002 c3_5006_5002;

	/** Campo TIPO DETALHE (c4_5006_5002) da tabela TIPO_DETALHE (t5006) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_5006_5002", foreignKey = @ForeignKey(name = "r4_5006_5002"))
	private T5002 c4_5006_5002;

	/** Campo TIPO DE TIPO (c5_5006_5002) da tabela TIPO_DETALHE (t5006) */
	@ManyToOne
	@JoinColumn(name = "c5_5006_5002", foreignKey = @ForeignKey(name = "r5_5006_5002"))
	private T5002 c5_5006_5002;

	/** Campo DESCRIÇÃO (c6_5006) da tabela TIPO_DETALHE (t5006) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c6_5006;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_5006) da tabela
	 * TIPO_DETALHE (t5006)
	 */
	public int getC1_5006() {
		return this.c1_5006;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_5006) da tabela
	 * TIPO_DETALHE (t5006)
	 */
	public void setC1_5006(int c1_5006) {
		this.c1_5006 = c1_5006;
	}

	/**
	 * Busca valor do campo TIPO (c2_5006_5001) da tabela TIPO_DETALHE (t5006)
	 */
	public T5001 getC2_5006_5001() {
		return this.c2_5006_5001;
	}

	/**
	 * Define valor do campo TIPO (c2_5006_5001) da tabela TIPO_DETALHE (t5006)
	 */
	public void setC2_5006_5001(T5001 c2_5006_5001) {
		this.c2_5006_5001 = c2_5006_5001;
	}

	/**
	 * Busca valor do campo VALOR (c3_5006_5002) da tabela TIPO_DETALHE (t5006)
	 */
	public T5002 getC3_5006_5002() {
		return this.c3_5006_5002;
	}

	/**
	 * Define valor do campo VALOR (c3_5006_5002) da tabela TIPO_DETALHE (t5006)
	 */
	public void setC3_5006_5002(T5002 c3_5006_5002) {
		this.c3_5006_5002 = c3_5006_5002;
	}

	/**
	 * Busca valor do campo TIPO DETALHE (c4_5006_5002) da tabela TIPO_DETALHE
	 * (t5006)
	 */
	public T5002 getC4_5006_5002() {
		return this.c4_5006_5002;
	}

	/**
	 * Define valor do campo TIPO DETALHE (c4_5006_5002) da tabela TIPO_DETALHE
	 * (t5006)
	 */
	public void setC4_5006_5002(T5002 c4_5006_5002) {
		this.c4_5006_5002 = c4_5006_5002;
	}

	/**
	 * Busca valor do campo TIPO DE TIPO (c5_5006_5002) da tabela TIPO_DETALHE
	 * (t5006)
	 */
	public T5002 getC5_5006_5002() {
		return this.c5_5006_5002;
	}

	/**
	 * Define valor do campo TIPO DE TIPO (c5_5006_5002) da tabela TIPO_DETALHE
	 * (t5006)
	 */
	public void setC5_5006_5002(T5002 c5_5006_5002) {
		this.c5_5006_5002 = c5_5006_5002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c6_5006) da tabela TIPO_DETALHE (t5006)
	 */
	public String getC6_5006() {
		return this.c6_5006;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c6_5006) da tabela TIPO_DETALHE (t5006)
	 */
	public void setC6_5006(String c6_5006) {
		this.c6_5006 = c6_5006;
	}

	@Override
	public String toString() {
		return "TIPO_DETALHE (t5006) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_5006)=" + c1_5006
				+ "\n\t\tDESCRIÇÃO (c6_5006)=" + c6_5006 + "]";
	}

}
