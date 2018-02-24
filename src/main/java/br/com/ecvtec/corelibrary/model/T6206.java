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
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe CIDADE_DETALHE.<br>
 * Representa a tabela t6206 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6206")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6206 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_6206) da tabela CIDADE_DETALHE (t6206)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6206;

	/** Campo CIDADE (c2_6206_6201) da tabela CIDADE_DETALHE (t6206) */
	@NotNull
	@ManyToOne
	@JsonBackReference("t6206C2")
	@JoinColumn(name = "c2_6206_6201", foreignKey = @ForeignKey(name = "r2_6206_6201"))
	private T6201 c2_6206_6201;

	/** Campo TIPO DE DETALHE (c3_6206_5002) da tabela CIDADE_DETALHE (t6206) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_6206_5002", foreignKey = @ForeignKey(name = "r3_6206_5002"))
	private T5002 c3_6206_5002;

	/** Campo TIPO DE TIPO (c4_6206_5002) da tabela CIDADE_DETALHE (t6206) */
	@ManyToOne
	@JoinColumn(name = "c4_6206_5002", foreignKey = @ForeignKey(name = "r4_6206_5002"))
	private T5002 c4_6206_5002;

	/** Campo DESCRIÇÃO (c5_6206) da tabela CIDADE_DETALHE (t6206) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c5_6206;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6206) da tabela
	 * CIDADE_DETALHE (t6206)
	 */
	public int getC1_6206() {
		return this.c1_6206;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6206) da tabela
	 * CIDADE_DETALHE (t6206)
	 */
	public void setC1_6206(int c1_6206) {
		this.c1_6206 = c1_6206;
	}

	/**
	 * Busca valor do campo CIDADE (c2_6206_6201) da tabela CIDADE_DETALHE
	 * (t6206)
	 */
	public T6201 getC2_6206_6201() {
		return this.c2_6206_6201;
	}

	/**
	 * Define valor do campo CIDADE (c2_6206_6201) da tabela CIDADE_DETALHE
	 * (t6206)
	 */
	public void setC2_6206_6201(T6201 c2_6206_6201) {
		this.c2_6206_6201 = c2_6206_6201;
	}

	/**
	 * Busca valor do campo TIPO DE DETALHE (c3_6206_5002) da tabela
	 * CIDADE_DETALHE (t6206)
	 */
	public T5002 getC3_6206_5002() {
		return this.c3_6206_5002;
	}

	/**
	 * Define valor do campo TIPO DE DETALHE (c3_6206_5002) da tabela
	 * CIDADE_DETALHE (t6206)
	 */
	public void setC3_6206_5002(T5002 c3_6206_5002) {
		this.c3_6206_5002 = c3_6206_5002;
	}

	/**
	 * Busca valor do campo TIPO DE TIPO (c4_6206_5002) da tabela CIDADE_DETALHE
	 * (t6206)
	 */
	public T5002 getC4_6206_5002() {
		return this.c4_6206_5002;
	}

	/**
	 * Define valor do campo TIPO DE TIPO (c4_6206_5002) da tabela
	 * CIDADE_DETALHE (t6206)
	 */
	public void setC4_6206_5002(T5002 c4_6206_5002) {
		this.c4_6206_5002 = c4_6206_5002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c5_6206) da tabela CIDADE_DETALHE (t6206)
	 */
	public String getC5_6206() {
		return this.c5_6206;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c5_6206) da tabela CIDADE_DETALHE
	 * (t6206)
	 */
	public void setC5_6206(String c5_6206) {
		this.c5_6206 = c5_6206;
	}

	@Override
	public String toString() {
		return "CIDADE_DETALHE (t6206) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6206)=" + c1_6206
				+ "\n\t\tDESCRIÇÃO (c5_6206)=" + c5_6206 + "]";
	}

}
