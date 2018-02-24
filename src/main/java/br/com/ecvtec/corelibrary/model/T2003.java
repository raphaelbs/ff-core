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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe INSUMO_DOCUMENTO.<br>
 * Representa a tabela t2003 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2003")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2003 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2003) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2003;

	/**
	 * Campo TABELA DE INSUMO (c2_2003_2001) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2003_2001", foreignKey = @ForeignKey(name = "r2_2003_2001"))
	private T2001 c2_2003_2001;

	/**
	 * Campo PRACA (QUANDO IDENTIFICAÇÃO FOR POR ENDEREÇO (c3_2003_2002) da
	 * tabela INSUMO_DOCUMENTO (t2003)
	 */
	@ManyToOne
	@JoinColumn(name = "c3_2003_2002", foreignKey = @ForeignKey(name = "r3_2003_2002"))
	private T2002 c3_2003_2002;

	/**
	 * Campo TIPO (NRO DE SERIE, CHASSI, PLACA, RENAVAM E ETC) (c4_2003_5002) da
	 * tabela INSUMO_DOCUMENTO (t2003)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_2003_5002", foreignKey = @ForeignKey(name = "r4_2003_5002"))
	private T5002 c4_2003_5002;

	/** Campo NÚMERO (c5_2003) da tabela INSUMO_DOCUMENTO (t2003) */
	@Size(max = 40, message = "NÚMERO deve possuir no máximo {max} caracteres.")
	private String c5_2003;

	/** Campo ÓRGÃO EMISSOR (c6_2003_1001) da tabela INSUMO_DOCUMENTO (t2003) */
	@ManyToOne
	@JoinColumn(name = "c6_2003_1001", foreignKey = @ForeignKey(name = "r6_2003_1001"))
	private T1001 c6_2003_1001;

	/** Campo DATA EMISSÃO (c7_2003) da tabela INSUMO_DOCUMENTO (t2003) */
	private Date c7_2003;

	/** Campo DATA VALIDADE (c8_2003) da tabela INSUMO_DOCUMENTO (t2003) */
	private Date c8_2003;

	/** Campo CATEGORIA (c9_2003_5002) da tabela INSUMO_DOCUMENTO (t2003) */
	@ManyToOne
	@JoinColumn(name = "c9_2003_5002", foreignKey = @ForeignKey(name = "r9_2003_5002"))
	private T5002 c9_2003_5002;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2003) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public int getC1_2003() {
		return this.c1_2003;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2003) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public void setC1_2003(int c1_2003) {
		this.c1_2003 = c1_2003;
	}

	/**
	 * Busca valor do campo TABELA DE INSUMO (c2_2003_2001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public T2001 getC2_2003_2001() {
		return this.c2_2003_2001;
	}

	/**
	 * Define valor do campo TABELA DE INSUMO (c2_2003_2001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public void setC2_2003_2001(T2001 c2_2003_2001) {
		this.c2_2003_2001 = c2_2003_2001;
	}

	/**
	 * Busca valor do campo PRACA (QUANDO IDENTIFICAÇÃO FOR POR ENDEREÇO
	 * (c3_2003_2002) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	public T2002 getC3_2003_2002() {
		return this.c3_2003_2002;
	}

	/**
	 * Define valor do campo PRACA (QUANDO IDENTIFICAÇÃO FOR POR ENDEREÇO
	 * (c3_2003_2002) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	public void setC3_2003_2002(T2002 c3_2003_2002) {
		this.c3_2003_2002 = c3_2003_2002;
	}

	/**
	 * Busca valor do campo TIPO (NRO DE SERIE, CHASSI, PLACA, RENAVAM E ETC)
	 * (c4_2003_5002) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	public T5002 getC4_2003_5002() {
		return this.c4_2003_5002;
	}

	/**
	 * Define valor do campo TIPO (NRO DE SERIE, CHASSI, PLACA, RENAVAM E ETC)
	 * (c4_2003_5002) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	public void setC4_2003_5002(T5002 c4_2003_5002) {
		this.c4_2003_5002 = c4_2003_5002;
	}

	/**
	 * Busca valor do campo NÚMERO (c5_2003) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	public String getC5_2003() {
		return this.c5_2003;
	}

	/**
	 * Define valor do campo NÚMERO (c5_2003) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	public void setC5_2003(String c5_2003) {
		this.c5_2003 = c5_2003;
	}

	/**
	 * Busca valor do campo ÓRGÃO EMISSOR (c6_2003_1001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public T1001 getC6_2003_1001() {
		return this.c6_2003_1001;
	}

	/**
	 * Define valor do campo ÓRGÃO EMISSOR (c6_2003_1001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public void setC6_2003_1001(T1001 c6_2003_1001) {
		this.c6_2003_1001 = c6_2003_1001;
	}

	/**
	 * Busca valor do campo DATA EMISSÃO (c7_2003) da tabela INSUMO_DOCUMENTO
	 * (t2003)
	 */
	public Date getC7_2003() {
		return this.c7_2003;
	}

	/**
	 * Define valor do campo DATA EMISSÃO (c7_2003) da tabela INSUMO_DOCUMENTO
	 * (t2003)
	 */
	public void setC7_2003(Date c7_2003) {
		this.c7_2003 = c7_2003;
	}

	/**
	 * Busca valor do campo DATA VALIDADE (c8_2003) da tabela INSUMO_DOCUMENTO
	 * (t2003)
	 */
	public Date getC8_2003() {
		return this.c8_2003;
	}

	/**
	 * Define valor do campo DATA VALIDADE (c8_2003) da tabela INSUMO_DOCUMENTO
	 * (t2003)
	 */
	public void setC8_2003(Date c8_2003) {
		this.c8_2003 = c8_2003;
	}

	/**
	 * Busca valor do campo CATEGORIA (c9_2003_5002) da tabela INSUMO_DOCUMENTO
	 * (t2003)
	 */
	public T5002 getC9_2003_5002() {
		return this.c9_2003_5002;
	}

	/**
	 * Define valor do campo CATEGORIA (c9_2003_5002) da tabela INSUMO_DOCUMENTO
	 * (t2003)
	 */
	public void setC9_2003_5002(T5002 c9_2003_5002) {
		this.c9_2003_5002 = c9_2003_5002;
	}

	@Override
	public String toString() {
		return "INSUMO_DOCUMENTO (t2003) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2003)=" + c1_2003
				+ "\n\t\tNÚMERO (c5_2003)=" + c5_2003 + "\n\t\tDATA EMISSÃO (c7_2003)=" + c7_2003
				+ "\n\t\tDATA VALIDADE (c8_2003)=" + c8_2003 + "]";
	}

}
