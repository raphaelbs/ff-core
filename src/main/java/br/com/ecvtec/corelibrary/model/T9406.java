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
 * Classe CARGA_DETALHE.<br>
 * Representa a tabela t9406 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9406")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9406 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMARIA (c1_9406) da tabela CARGA_DETALHE (t9406)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9406;

	/** Campo CARGA (c2_9406_9401) da tabela CARGA_DETALHE (t9406) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9406_9401", foreignKey = @ForeignKey(name = "r2_9406_9401"))
	private T9401 c2_9406_9401;

	/** Campo TIPO DETALHE (c3_9406_5002) da tabela CARGA_DETALHE (t9406) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_9406_5002", foreignKey = @ForeignKey(name = "r3_9406_5002"))
	private T5002 c3_9406_5002;

	/** Campo TIPO DE TIPO (c4_9406_5002) da tabela CARGA_DETALHE (t9406) */
	@ManyToOne
	@JoinColumn(name = "c4_9406_5002", foreignKey = @ForeignKey(name = "r4_9406_5002"))
	private T5002 c4_9406_5002;

	/** Campo DESCRIÇÃO (c5_9406) da tabela CARGA_DETALHE (t9406) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c5_9406;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9406) da tabela
	 * CARGA_DETALHE (t9406)
	 */
	public int getC1_9406() {
		return this.c1_9406;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9406) da tabela
	 * CARGA_DETALHE (t9406)
	 */
	public void setC1_9406(int c1_9406) {
		this.c1_9406 = c1_9406;
	}

	/**
	 * Busca valor do campo CARGA (c2_9406_9401) da tabela CARGA_DETALHE (t9406)
	 */
	public T9401 getC2_9406_9401() {
		return this.c2_9406_9401;
	}

	/**
	 * Define valor do campo CARGA (c2_9406_9401) da tabela CARGA_DETALHE
	 * (t9406)
	 */
	public void setC2_9406_9401(T9401 c2_9406_9401) {
		this.c2_9406_9401 = c2_9406_9401;
	}

	/**
	 * Busca valor do campo TIPO DETALHE (c3_9406_5002) da tabela CARGA_DETALHE
	 * (t9406)
	 */
	public T5002 getC3_9406_5002() {
		return this.c3_9406_5002;
	}

	/**
	 * Define valor do campo TIPO DETALHE (c3_9406_5002) da tabela CARGA_DETALHE
	 * (t9406)
	 */
	public void setC3_9406_5002(T5002 c3_9406_5002) {
		this.c3_9406_5002 = c3_9406_5002;
	}

	/**
	 * Busca valor do campo TIPO DE TIPO (c4_9406_5002) da tabela CARGA_DETALHE
	 * (t9406)
	 */
	public T5002 getC4_9406_5002() {
		return this.c4_9406_5002;
	}

	/**
	 * Define valor do campo TIPO DE TIPO (c4_9406_5002) da tabela CARGA_DETALHE
	 * (t9406)
	 */
	public void setC4_9406_5002(T5002 c4_9406_5002) {
		this.c4_9406_5002 = c4_9406_5002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c5_9406) da tabela CARGA_DETALHE (t9406)
	 */
	public String getC5_9406() {
		return this.c5_9406;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c5_9406) da tabela CARGA_DETALHE (t9406)
	 */
	public void setC5_9406(String c5_9406) {
		this.c5_9406 = c5_9406;
	}

	@Override
	public String toString() {
		return "CARGA_DETALHE (t9406) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_9406)=" + c1_9406
				+ "\n\t\tDESCRIÇÃO (c5_9406)=" + c5_9406 + "]";
	}

}
