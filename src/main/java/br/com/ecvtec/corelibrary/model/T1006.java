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
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe ENTIDADE_DETALHE.<br>
 * Representa a tabela t1006 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1006")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1006 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_1006) da tabela ENTIDADE_DETALHE (t1006)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1006;

	/** Campo PESSOA (c2_1006_1001) da tabela ENTIDADE_DETALHE (t1006) */
	@NotNull
	@ManyToOne
	@JsonBackReference("c2_1006_1001")
	@JoinColumn(name = "c2_1006_1001", foreignKey = @ForeignKey(name = "r2_1006_1001"))
	private T1001 c2_1006_1001;

	/**
	 * Campo TIPO DE DETALHE (c3_1006_5002) da tabela ENTIDADE_DETALHE (t1006)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_1006_5002", foreignKey = @ForeignKey(name = "r3_1006_5002"))
	private T5002 c3_1006_5002;

	/** Campo TIPO DE TIPO (c4_1006_5002) da tabela ENTIDADE_DETALHE (t1006) */
	@ManyToOne
	@JoinColumn(name = "c4_1006_5002", foreignKey = @ForeignKey(name = "r4_1006_5002"))
	private T5002 c4_1006_5002;

	/** Campo DESCRIÇÃO (c5_1006) da tabela ENTIDADE_DETALHE (t1006) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c5_1006;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1006) da tabela
	 * ENTIDADE_DETALHE (t1006)
	 */
	public int getC1_1006() {
		return this.c1_1006;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1006) da tabela
	 * ENTIDADE_DETALHE (t1006)
	 */
	public void setC1_1006(int c1_1006) {
		this.c1_1006 = c1_1006;
	}

	/**
	 * Busca valor do campo PESSOA (c2_1006_1001) da tabela ENTIDADE_DETALHE
	 * (t1006)
	 */
	public T1001 getC2_1006_1001() {
		return this.c2_1006_1001;
	}

	/**
	 * Define valor do campo PESSOA (c2_1006_1001) da tabela ENTIDADE_DETALHE
	 * (t1006)
	 */
	public void setC2_1006_1001(T1001 c2_1006_1001) {
		this.c2_1006_1001 = c2_1006_1001;
	}

	/**
	 * Busca valor do campo TIPO DE DETALHE (c3_1006_5002) da tabela
	 * ENTIDADE_DETALHE (t1006)
	 */
	public T5002 getC3_1006_5002() {
		return this.c3_1006_5002;
	}

	/**
	 * Define valor do campo TIPO DE DETALHE (c3_1006_5002) da tabela
	 * ENTIDADE_DETALHE (t1006)
	 */
	public void setC3_1006_5002(T5002 c3_1006_5002) {
		this.c3_1006_5002 = c3_1006_5002;
	}

	/**
	 * Busca valor do campo TIPO DE TIPO (c4_1006_5002) da tabela
	 * ENTIDADE_DETALHE (t1006)
	 */
	public T5002 getC4_1006_5002() {
		return this.c4_1006_5002;
	}

	/**
	 * Define valor do campo TIPO DE TIPO (c4_1006_5002) da tabela
	 * ENTIDADE_DETALHE (t1006)
	 */
	public void setC4_1006_5002(T5002 c4_1006_5002) {
		this.c4_1006_5002 = c4_1006_5002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c5_1006) da tabela ENTIDADE_DETALHE
	 * (t1006)
	 */
	public String getC5_1006() {
		return this.c5_1006;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c5_1006) da tabela ENTIDADE_DETALHE
	 * (t1006)
	 */
	public void setC5_1006(String c5_1006) {
		this.c5_1006 = c5_1006;
	}

	@Override
	public String toString() {
		return "ENTIDADE_DETALHE (t1006) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1006)=" + c1_1006
				+ "\n\t\tDESCRIÇÃO (c5_1006)=" + c5_1006 + "]";
	}

}
