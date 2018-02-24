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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe INSUMO_IMAGEM.<br>
 * Representa a tabela t2008 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2008")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2008 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_2008) da tabela INSUMO_IMAGEM (t2008) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2008;

	/** Campo TABELA DE INSUMO (c2_2008_2001) da tabela INSUMO_IMAGEM (t2008) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2008_2001", foreignKey = @ForeignKey(name = "r2_2008_2001"))
	private T2001 c2_2008_2001;

	/** Campo TIPO (FOTO ETC) (c3_2008_5002) da tabela INSUMO_IMAGEM (t2008) */
	@ManyToOne
	@JoinColumn(name = "c3_2008_5002", foreignKey = @ForeignKey(name = "r3_2008_5002"))
	private T5002 c3_2008_5002;

	/** Campo TABELA DE FOTOS (c4_2008_5501) da tabela INSUMO_IMAGEM (t2008) */
	@ManyToOne
	@JoinColumn(name = "c4_2008_5501", foreignKey = @ForeignKey(name = "r4_2008_5501"))
	private T5501 c4_2008_5501;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2008) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public int getC1_2008() {
		return this.c1_2008;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2008) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public void setC1_2008(int c1_2008) {
		this.c1_2008 = c1_2008;
	}

	/**
	 * Busca valor do campo TABELA DE INSUMO (c2_2008_2001) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public T2001 getC2_2008_2001() {
		return this.c2_2008_2001;
	}

	/**
	 * Define valor do campo TABELA DE INSUMO (c2_2008_2001) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public void setC2_2008_2001(T2001 c2_2008_2001) {
		this.c2_2008_2001 = c2_2008_2001;
	}

	/**
	 * Busca valor do campo TIPO (FOTO ETC) (c3_2008_5002) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public T5002 getC3_2008_5002() {
		return this.c3_2008_5002;
	}

	/**
	 * Define valor do campo TIPO (FOTO ETC) (c3_2008_5002) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public void setC3_2008_5002(T5002 c3_2008_5002) {
		this.c3_2008_5002 = c3_2008_5002;
	}

	/**
	 * Busca valor do campo TABELA DE FOTOS (c4_2008_5501) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public T5501 getC4_2008_5501() {
		return this.c4_2008_5501;
	}

	/**
	 * Define valor do campo TABELA DE FOTOS (c4_2008_5501) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public void setC4_2008_5501(T5501 c4_2008_5501) {
		this.c4_2008_5501 = c4_2008_5501;
	}

	@Override
	public String toString() {
		return "INSUMO_IMAGEM (t2008) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2008)=" + c1_2008 + "]";
	}

}
