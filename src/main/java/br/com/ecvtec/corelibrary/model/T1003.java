package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.sql.Date;

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
 * Classe ENTIDADE_DOCUMENTO.<br>
 * Representa a tabela t1003 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1003")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1003 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_1003) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1003;

	/** Campo PESSOA (c2_1003_1001) da tabela ENTIDADE_DOCUMENTO (t1003) */
	@ManyToOne
	@JoinColumn(name = "c2_1003_1001", foreignKey = @ForeignKey(name = "r2_1003_1001"))
	@JsonBackReference("c2_1003_1001")
	private T1001 c2_1003_1001;

	/** Campo PRAÇA (c3_1003_1002) da tabela ENTIDADE_DOCUMENTO (t1003) */
	@ManyToOne
	@JsonBackReference("t1003C3")
	@JoinColumn(name = "c3_1003_1002", foreignKey = @ForeignKey(name = "r3_1003_1002"))
	private T1002 c3_1003_1002;

	/**
	 * Campo TIPO DE DOCUMENTO (c4_1003_5002) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_1003_5002", foreignKey = @ForeignKey(name = "r4_1003_5002"))
	private T5002 c4_1003_5002;

	/** Campo NÚMERO DOCUMENTO (c5_1003) da tabela ENTIDADE_DOCUMENTO (t1003) */
	@Size(max = 40, message = "NÚMERO DOCUMENTO deve possuir no máximo {max} caracteres.")
	private String c5_1003;

	/**
	 * Campo ORGÃO EMISSOR (c6_1003_1001) da tabela ENTIDADE_DOCUMENTO (t1003)
	 */
	@ManyToOne
	@JoinColumn(name = "c6_1003_1001", foreignKey = @ForeignKey(name = "r6_1003_1001"))
	private T1001 c6_1003_1001;

	/** Campo DATA DE EMISSÃO (c7_1003) da tabela ENTIDADE_DOCUMENTO (t1003) */
	private Date c7_1003;

	/** Campo DATA DE VALIDADE (c8_1003) da tabela ENTIDADE_DOCUMENTO (t1003) */
	private Date c8_1003;

	/** Campo CATEGORIA (c9_1003_5002) da tabela ENTIDADE_DOCUMENTO (t1003) */
	@ManyToOne
	@JoinColumn(name = "c9_1003_5002", foreignKey = @ForeignKey(name = "r9_1003_5002"))
	private T5002 c9_1003_5002;

	/** Campo COMPLEMENTO (c10_1003) da tabela ENTIDADE_DOCUMENTO (t1003) */
	@Size(max = 160, message = "COMPLEMENTO deve possuir no máximo {max} caracteres.")
	private String c10_1003;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1003) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public int getC1_1003() {
		return this.c1_1003;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1003) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setC1_1003(int c1_1003) {
		this.c1_1003 = c1_1003;
	}

	/**
	 * Busca valor do campo PESSOA (c2_1003_1001) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	public T1001 getC2_1003_1001() {
		return this.c2_1003_1001;
	}

	/**
	 * Define valor do campo PESSOA (c2_1003_1001) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	public void setC2_1003_1001(T1001 c2_1003_1001) {
		this.c2_1003_1001 = c2_1003_1001;
	}

	/**
	 * Busca valor do campo PRAÇA (c3_1003_1002) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	public T1002 getC3_1003_1002() {
		return this.c3_1003_1002;
	}

	/**
	 * Define valor do campo PRAÇA (c3_1003_1002) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	public void setC3_1003_1002(T1002 c3_1003_1002) {
		this.c3_1003_1002 = c3_1003_1002;
	}

	/**
	 * Busca valor do campo TIPO DE DOCUMENTO (c4_1003_5002) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public T5002 getC4_1003_5002() {
		return this.c4_1003_5002;
	}

	/**
	 * Define valor do campo TIPO DE DOCUMENTO (c4_1003_5002) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setC4_1003_5002(T5002 c4_1003_5002) {
		this.c4_1003_5002 = c4_1003_5002;
	}

	/**
	 * Busca valor do campo NÚMERO DOCUMENTO (c5_1003) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public String getC5_1003() {
		return this.c5_1003;
	}

	/**
	 * Define valor do campo NÚMERO DOCUMENTO (c5_1003) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setC5_1003(String c5_1003) {
		this.c5_1003 = c5_1003;
	}

	/**
	 * Busca valor do campo ORGÃO EMISSOR (c6_1003_1001) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public T1001 getC6_1003_1001() {
		return this.c6_1003_1001;
	}

	/**
	 * Define valor do campo ORGÃO EMISSOR (c6_1003_1001) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setC6_1003_1001(T1001 c6_1003_1001) {
		this.c6_1003_1001 = c6_1003_1001;
	}

	/**
	 * Busca valor do campo DATA DE EMISSÃO (c7_1003) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public Date getC7_1003() {
		return this.c7_1003;
	}

	/**
	 * Define valor do campo DATA DE EMISSÃO (c7_1003) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setC7_1003(Date c7_1003) {
		this.c7_1003 = c7_1003;
	}

	/**
	 * Busca valor do campo DATA DE VALIDADE (c8_1003) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public Date getC8_1003() {
		return this.c8_1003;
	}

	/**
	 * Define valor do campo DATA DE VALIDADE (c8_1003) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setC8_1003(Date c8_1003) {
		this.c8_1003 = c8_1003;
	}

	/**
	 * Busca valor do campo CATEGORIA (c9_1003_5002) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public T5002 getC9_1003_5002() {
		return this.c9_1003_5002;
	}

	/**
	 * Define valor do campo CATEGORIA (c9_1003_5002) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setC9_1003_5002(T5002 c9_1003_5002) {
		this.c9_1003_5002 = c9_1003_5002;
	}

	/**
	 * Busca valor do campo COMPLEMENTO (c10_1003) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	public String getC10_1003() {
		return this.c10_1003;
	}

	/**
	 * Define valor do campo COMPLEMENTO (c10_1003) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	public void setC10_1003(String c10_1003) {
		this.c10_1003 = c10_1003;
	}

	@Override
	public String toString() {
		return "ENTIDADE_DOCUMENTO (t1003) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1003)=" + c1_1003
				+ "\n\t\tNÚMERO DOCUMENTO (c5_1003)=" + c5_1003 + "\n\t\tDATA DE EMISSÃO (c7_1003)=" + c7_1003
				+ "\n\t\tDATA DE VALIDADE (c8_1003)=" + c8_1003 + "\n\t\tCOMPLEMENTO (c10_1003)=" + c10_1003 + "]";
	}

}
