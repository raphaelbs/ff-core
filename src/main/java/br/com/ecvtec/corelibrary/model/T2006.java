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
 * Classe INSUMO_DETALHE.<br>
 * Representa a tabela t2006 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2006")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2006 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2006) da tabela INSUMO_DETALHE (t2006)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2006;

	/**
	 * Campo TABELA DE INSUMO (c2_2006_2001) da tabela INSUMO_DETALHE (t2006)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2006_2001", foreignKey = @ForeignKey(name = "r2_2006_2001"))
	private T2001 c2_2006_2001;

	/**
	 * Campo TIPO DO DETALHE TIPO 79 (c3_2006_5002) da tabela INSUMO_DETALHE
	 * (t2006)
	 */
	@ManyToOne
	@JoinColumn(name = "c3_2006_5002", foreignKey = @ForeignKey(name = "r3_2006_5002"))
	private T5002 c3_2006_5002;

	/**
	 * Campo RELACIONA COM UM TIPO DE TIPO PRE ESTABELECIDO (c4_2006_5002) da
	 * tabela INSUMO_DETALHE (t2006)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_2006_5002", foreignKey = @ForeignKey(name = "r4_2006_5002"))
	private T5002 c4_2006_5002;

	/** Campo DESCRIÇÃO DO DETALHE (c5_2006) da tabela INSUMO_DETALHE (t2006) */
	@Size(max = 160, message = "DESCRIÇÃO DO DETALHE deve possuir no máximo {max} caracteres.")
	private String c5_2006;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2006) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public int getC1_2006() {
		return this.c1_2006;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2006) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public void setC1_2006(int c1_2006) {
		this.c1_2006 = c1_2006;
	}

	/**
	 * Busca valor do campo TABELA DE INSUMO (c2_2006_2001) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public T2001 getC2_2006_2001() {
		return this.c2_2006_2001;
	}

	/**
	 * Define valor do campo TABELA DE INSUMO (c2_2006_2001) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public void setC2_2006_2001(T2001 c2_2006_2001) {
		this.c2_2006_2001 = c2_2006_2001;
	}

	/**
	 * Busca valor do campo TIPO DO DETALHE TIPO 79 (c3_2006_5002) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public T5002 getC3_2006_5002() {
		return this.c3_2006_5002;
	}

	/**
	 * Define valor do campo TIPO DO DETALHE TIPO 79 (c3_2006_5002) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public void setC3_2006_5002(T5002 c3_2006_5002) {
		this.c3_2006_5002 = c3_2006_5002;
	}

	/**
	 * Busca valor do campo RELACIONA COM UM TIPO DE TIPO PRE ESTABELECIDO
	 * (c4_2006_5002) da tabela INSUMO_DETALHE (t2006)
	 */
	public T5002 getC4_2006_5002() {
		return this.c4_2006_5002;
	}

	/**
	 * Define valor do campo RELACIONA COM UM TIPO DE TIPO PRE ESTABELECIDO
	 * (c4_2006_5002) da tabela INSUMO_DETALHE (t2006)
	 */
	public void setC4_2006_5002(T5002 c4_2006_5002) {
		this.c4_2006_5002 = c4_2006_5002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO DO DETALHE (c5_2006) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public String getC5_2006() {
		return this.c5_2006;
	}

	/**
	 * Define valor do campo DESCRIÇÃO DO DETALHE (c5_2006) da tabela
	 * INSUMO_DETALHE (t2006)
	 */
	public void setC5_2006(String c5_2006) {
		this.c5_2006 = c5_2006;
	}

	@Override
	public String toString() {
		return "INSUMO_DETALHE (t2006) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2006)=" + c1_2006
				+ "\n\t\tDESCRIÇÃO DO DETALHE (c5_2006)=" + c5_2006 + "]";
	}

}
