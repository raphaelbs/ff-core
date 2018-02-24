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
 * Classe PROCEDIMENTO_DETALHE.<br>
 * Representa a tabela t8906 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t8906")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T8906 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_8906) da tabela PROCEDIMENTO_DETALHE
	 * (t8906)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_8906;

	/**
	 * Campo PROCEDIMENTO (c2_8906_1001) da tabela PROCEDIMENTO_DETALHE (t8906)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_8906_1001", foreignKey = @ForeignKey(name = "r2_8906_1001"))
	private T1001 c2_8906_1001;

	/**
	 * Campo TIPO DE DETALHE (c3_8906_5002) da tabela PROCEDIMENTO_DETALHE
	 * (t8906)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_8906_5002", foreignKey = @ForeignKey(name = "r3_8906_5002"))
	private T5002 c3_8906_5002;

	/**
	 * Campo TIPO DE TIPO (c4_8906_5002) da tabela PROCEDIMENTO_DETALHE (t8906)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_8906_5002", foreignKey = @ForeignKey(name = "r4_8906_5002"))
	private T5002 c4_8906_5002;

	/** Campo DESCRIÇÃO (c5_8906) da tabela PROCEDIMENTO_DETALHE (t8906) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c5_8906;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_8906) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public int getC1_8906() {
		return this.c1_8906;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_8906) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public void setC1_8906(int c1_8906) {
		this.c1_8906 = c1_8906;
	}

	/**
	 * Busca valor do campo PROCEDIMENTO (c2_8906_1001) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public T1001 getC2_8906_1001() {
		return this.c2_8906_1001;
	}

	/**
	 * Define valor do campo PROCEDIMENTO (c2_8906_1001) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public void setC2_8906_1001(T1001 c2_8906_1001) {
		this.c2_8906_1001 = c2_8906_1001;
	}

	/**
	 * Busca valor do campo TIPO DE DETALHE (c3_8906_5002) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public T5002 getC3_8906_5002() {
		return this.c3_8906_5002;
	}

	/**
	 * Define valor do campo TIPO DE DETALHE (c3_8906_5002) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public void setC3_8906_5002(T5002 c3_8906_5002) {
		this.c3_8906_5002 = c3_8906_5002;
	}

	/**
	 * Busca valor do campo TIPO DE TIPO (c4_8906_5002) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public T5002 getC4_8906_5002() {
		return this.c4_8906_5002;
	}

	/**
	 * Define valor do campo TIPO DE TIPO (c4_8906_5002) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public void setC4_8906_5002(T5002 c4_8906_5002) {
		this.c4_8906_5002 = c4_8906_5002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c5_8906) da tabela PROCEDIMENTO_DETALHE
	 * (t8906)
	 */
	public String getC5_8906() {
		return this.c5_8906;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c5_8906) da tabela PROCEDIMENTO_DETALHE
	 * (t8906)
	 */
	public void setC5_8906(String c5_8906) {
		this.c5_8906 = c5_8906;
	}

	@Override
	public String toString() {
		return "PROCEDIMENTO_DETALHE (t8906) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_8906)=" + c1_8906
				+ "\n\t\tDESCRIÇÃO (c5_8906)=" + c5_8906 + "]";
	}

}
