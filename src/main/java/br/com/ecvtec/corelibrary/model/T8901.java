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
 * Classe PROCEDIMENTO.<br>
 * Representa a tabela t8901 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t8901")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T8901 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_8901) da tabela PROCEDIMENTO (t8901) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_8901;

	/** Campo DESCRIÇÃO (c2_8901) da tabela PROCEDIMENTO (t8901) */
	@Size(max = 300, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_8901;

	/** Campo CÓDIGO (c3_8901) da tabela PROCEDIMENTO (t8901) */
	@Size(max = 40, message = "CÓDIGO deve possuir no máximo {max} caracteres.")
	private String c3_8901;

	/** Campo TIPO (c4_8901_5002) da tabela PROCEDIMENTO (t8901) */
	@ManyToOne
	@JoinColumn(name = "c4_8901_5002", foreignKey = @ForeignKey(name = "r4_8901_5002"))
	private T5002 c4_8901_5002;

	/** Campo DÍGITO (c5_8901) da tabela PROCEDIMENTO (t8901) */
	@Size(max = 40, message = "DÍGITO deve possuir no máximo {max} caracteres.")
	private String c5_8901;

	/** Campo GRUPO (c6_8901) da tabela PROCEDIMENTO (t8901) */
	private int c6_8901;

	/** Campo SUBGRUPO (c7_8901) da tabela PROCEDIMENTO (t8901) */
	private int c7_8901;

	/** Campo FORMA (c8_8901) da tabela PROCEDIMENTO (t8901) */
	private int c8_8901;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_8901) da tabela
	 * PROCEDIMENTO (t8901)
	 */
	public int getC1_8901() {
		return this.c1_8901;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_8901) da tabela
	 * PROCEDIMENTO (t8901)
	 */
	public void setC1_8901(int c1_8901) {
		this.c1_8901 = c1_8901;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c2_8901) da tabela PROCEDIMENTO (t8901)
	 */
	public String getC2_8901() {
		return this.c2_8901;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c2_8901) da tabela PROCEDIMENTO (t8901)
	 */
	public void setC2_8901(String c2_8901) {
		this.c2_8901 = c2_8901;
	}

	/** Busca valor do campo CÓDIGO (c3_8901) da tabela PROCEDIMENTO (t8901) */
	public String getC3_8901() {
		return this.c3_8901;
	}

	/** Define valor do campo CÓDIGO (c3_8901) da tabela PROCEDIMENTO (t8901) */
	public void setC3_8901(String c3_8901) {
		this.c3_8901 = c3_8901;
	}

	/**
	 * Busca valor do campo TIPO (c4_8901_5002) da tabela PROCEDIMENTO (t8901)
	 */
	public T5002 getC4_8901_5002() {
		return this.c4_8901_5002;
	}

	/**
	 * Define valor do campo TIPO (c4_8901_5002) da tabela PROCEDIMENTO (t8901)
	 */
	public void setC4_8901_5002(T5002 c4_8901_5002) {
		this.c4_8901_5002 = c4_8901_5002;
	}

	/** Busca valor do campo DÍGITO (c5_8901) da tabela PROCEDIMENTO (t8901) */
	public String getC5_8901() {
		return this.c5_8901;
	}

	/** Define valor do campo DÍGITO (c5_8901) da tabela PROCEDIMENTO (t8901) */
	public void setC5_8901(String c5_8901) {
		this.c5_8901 = c5_8901;
	}

	/** Busca valor do campo GRUPO (c6_8901) da tabela PROCEDIMENTO (t8901) */
	public int getC6_8901() {
		return this.c6_8901;
	}

	/** Define valor do campo GRUPO (c6_8901) da tabela PROCEDIMENTO (t8901) */
	public void setC6_8901(int c6_8901) {
		this.c6_8901 = c6_8901;
	}

	/**
	 * Busca valor do campo SUBGRUPO (c7_8901) da tabela PROCEDIMENTO (t8901)
	 */
	public int getC7_8901() {
		return this.c7_8901;
	}

	/**
	 * Define valor do campo SUBGRUPO (c7_8901) da tabela PROCEDIMENTO (t8901)
	 */
	public void setC7_8901(int c7_8901) {
		this.c7_8901 = c7_8901;
	}

	/** Busca valor do campo FORMA (c8_8901) da tabela PROCEDIMENTO (t8901) */
	public int getC8_8901() {
		return this.c8_8901;
	}

	/** Define valor do campo FORMA (c8_8901) da tabela PROCEDIMENTO (t8901) */
	public void setC8_8901(int c8_8901) {
		this.c8_8901 = c8_8901;
	}

	@Override
	public String toString() {
		return "PROCEDIMENTO (t8901) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_8901)=" + c1_8901
				+ "\n\t\tDESCRIÇÃO (c2_8901)=" + c2_8901 + "\n\t\tCÓDIGO (c3_8901)=" + c3_8901
				+ "\n\t\tDÍGITO (c5_8901)=" + c5_8901 + "\n\t\tGRUPO (c6_8901)=" + c6_8901 + "\n\t\tSUBGRUPO (c7_8901)="
				+ c7_8901 + "\n\t\tFORMA (c8_8901)=" + c8_8901 + "]";
	}

}
