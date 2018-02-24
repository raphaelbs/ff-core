package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe ENDEREÇO.<br>
 * Representa a tabela t6001 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6001")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6001 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public T6001(){
		this.c2_6001 = "";
	}
	
	private String transformarEAdicionarNoC2(String str){
		if(c2_6001 != null) c2_6001 += ", ";
		c2_6001 += str;
		return str;
	}

	/** Campo ID - CHAVE SEQUENCIAL (c1_6001) da tabela ENDEREÇO (t6001) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6001;

	/** Campo DESCRIÇÃO (c2_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 400, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_6001;

	/** Campo VIA (c3_6001_6301) da tabela ENDEREÇO (t6001) */
	@ManyToOne
	@JoinColumn(name = "c3_6001_6301", foreignKey = @ForeignKey(name = "r3_6001_6301"))
	private T6301 c3_6001_6301;

	/** Campo QUARTEIRÃO (c4_6001_6302) da tabela ENDEREÇO (t6001) */
	@ManyToOne
	@JoinColumn(name = "c4_6001_6302", foreignKey = @ForeignKey(name = "r4_6001_6302"))
	private T6302 c4_6001_6302;

	/** Campo TIPO DO LOGRADOURO (c5_6001_5002) da tabela ENDEREÇO (t6001) */
	@ManyToOne
	@JoinColumn(name = "c5_6001_5002", foreignKey = @ForeignKey(name = "r5_6001_5002"))
	private T5002 c5_6001_5002;

	/** Campo LOGRADOURO (c6_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 160, message = "LOGRADOURO deve possuir no máximo {max} caracteres.")
	private String c6_6001;

	/** Campo NÚMERO (c7_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 40, message = "NÚMERO deve possuir no máximo {max} caracteres.")
	private String c7_6001;

	/** Campo TIPO DO COMPLEMENTO (c8_6001_5002) da tabela ENDEREÇO (t6001) */
	@ManyToOne
	@JoinColumn(name = "c8_6001_5002", foreignKey = @ForeignKey(name = "r8_6001_5002"))
	private T5002 c8_6001_5002;

	/** Campo COMPLEMENTO (c9_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 40, message = "COMPLEMENTO deve possuir no máximo {max} caracteres.")
	private String c9_6001;

	/** Campo BAIRRO (c10_6001_6202) da tabela ENDEREÇO (t6001) */
	@ManyToOne
	@JoinColumn(name = "c10_6001_6202", foreignKey = @ForeignKey(name = "r10_6001_6202"))
	private T6202 c10_6001_6202;

	/** Campo DESCRIÇÃO DO BAIRRO (c11_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 160, message = "DESCRIÇÃO DO BAIRRO deve possuir no máximo {max} caracteres.")
	private String c11_6001;

	/** Campo CIDADE (c12_6001_6201) da tabela ENDEREÇO (t6001) */
	@ManyToOne
	@JoinColumn(name = "c12_6001_6201", foreignKey = @ForeignKey(name = "r12_6001_6201"))
	private T6201 c12_6001_6201;

	/** Campo NÚMERO DO CEP (c13_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 40, message = "NÚMERO DO CEP deve possuir no máximo {max} caracteres.")
	private String c13_6001;

	/** Campo REFERÊNCIA (c14_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 160, message = "REFERÊNCIA deve possuir no máximo {max} caracteres.")
	private String c14_6001;

	/** Campo TIPO DE COORDENADA (c15_6001_5002) da tabela ENDEREÇO (t6001) */
	@ManyToOne
	@JoinColumn(name = "c15_6001_5002", foreignKey = @ForeignKey(name = "r15_6001_5002"))
	private T5002 c15_6001_5002;

	/** Campo LATITUDE (c16_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 40, message = "LATITUDE deve possuir no máximo {max} caracteres.")
	private String c16_6001;

	/** Campo LONGITUDE (c17_6001) da tabela ENDEREÇO (t6001) */
	@Size(max = 40, message = "LONGITUDE deve possuir no máximo {max} caracteres.")
	private String c17_6001;

	/**
	 * Referencia ao campo ENDEREÇO (c5_1002_6001) da tabela ENTIDADE_ENDEREÇO
	 * (t1002)
	 */
	@JsonBackReference(value = "c5_1002_6001")
	@OneToMany(mappedBy = "c5_1002_6001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1002> t1002C5;

	/**
	 * Referencia ao campo TABELA DE ENDERECO (c5_2002_6001) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	@JsonBackReference(value = "c5_2002_6001")
	@OneToMany(mappedBy = "c5_2002_6001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2002> t2002C5;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_6001) da tabela ENDEREÇO
	 * (t6001)
	 */
	public int getC1_6001() {
		return this.c1_6001;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_6001) da tabela ENDEREÇO
	 * (t6001)
	 */
	public void setC1_6001(int c1_6001) {
		this.c1_6001 = c1_6001;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_6001) da tabela ENDEREÇO (t6001) */
	public String getC2_6001() {
		return this.c2_6001;
	}

	/** Define valor do campo DESCRIÇÃO (c2_6001) da tabela ENDEREÇO (t6001) */
	public void setC2_6001(String c2_6001) {
		this.c2_6001 = c2_6001;
	}

	/** Busca valor do campo VIA (c3_6001_6301) da tabela ENDEREÇO (t6001) */
	public T6301 getC3_6001_6301() {
		return this.c3_6001_6301;
	}

	/** Define valor do campo VIA (c3_6001_6301) da tabela ENDEREÇO (t6001) */
	public void setC3_6001_6301(T6301 c3_6001_6301) {
		this.c3_6001_6301 = c3_6001_6301;
	}

	/**
	 * Busca valor do campo QUARTEIRÃO (c4_6001_6302) da tabela ENDEREÇO (t6001)
	 */
	public T6302 getC4_6001_6302() {
		return this.c4_6001_6302;
	}

	/**
	 * Define valor do campo QUARTEIRÃO (c4_6001_6302) da tabela ENDEREÇO
	 * (t6001)
	 */
	public void setC4_6001_6302(T6302 c4_6001_6302) {
		this.c4_6001_6302 = c4_6001_6302;
	}

	/**
	 * Busca valor do campo TIPO DO LOGRADOURO (c5_6001_5002) da tabela ENDEREÇO
	 * (t6001)
	 */
	public T5002 getC5_6001_5002() {
		return this.c5_6001_5002;
	}

	/**
	 * Define valor do campo TIPO DO LOGRADOURO (c5_6001_5002) da tabela
	 * ENDEREÇO (t6001)
	 */
	public void setC5_6001_5002(T5002 c5_6001_5002) {
		this.c5_6001_5002 = c5_6001_5002;
	}

	/** Busca valor do campo LOGRADOURO (c6_6001) da tabela ENDEREÇO (t6001) */
	public String getC6_6001() {
		return this.c6_6001;
	}

	/** Define valor do campo LOGRADOURO (c6_6001) da tabela ENDEREÇO (t6001) */
	public void setC6_6001(String c6_6001) {
		this.c6_6001 = transformarEAdicionarNoC2(c6_6001);
	}

	/** Busca valor do campo NÚMERO (c7_6001) da tabela ENDEREÇO (t6001) */
	public String getC7_6001() {
		return this.c7_6001;
	}

	/** Define valor do campo NÚMERO (c7_6001) da tabela ENDEREÇO (t6001) */
	public void setC7_6001(String c7_6001) {
		this.c7_6001 = transformarEAdicionarNoC2(c7_6001);
	}

	/**
	 * Busca valor do campo TIPO DO COMPLEMENTO (c8_6001_5002) da tabela
	 * ENDEREÇO (t6001)
	 */
	public T5002 getC8_6001_5002() {
		return this.c8_6001_5002;
	}

	/**
	 * Define valor do campo TIPO DO COMPLEMENTO (c8_6001_5002) da tabela
	 * ENDEREÇO (t6001)
	 */
	public void setC8_6001_5002(T5002 c8_6001_5002) {
		this.c8_6001_5002 = c8_6001_5002;
	}

	/** Busca valor do campo COMPLEMENTO (c9_6001) da tabela ENDEREÇO (t6001) */
	public String getC9_6001() {
		return this.c9_6001;
	}

	/**
	 * Define valor do campo COMPLEMENTO (c9_6001) da tabela ENDEREÇO (t6001)
	 */
	public void setC9_6001(String c9_6001) {
		this.c9_6001 = transformarEAdicionarNoC2(c9_6001);
	}

	/**
	 * Busca valor do campo BAIRRO (c10_6001_6202) da tabela ENDEREÇO (t6001)
	 */
	public T6202 getC10_6001_6202() {
		return this.c10_6001_6202;
	}

	/**
	 * Define valor do campo BAIRRO (c10_6001_6202) da tabela ENDEREÇO (t6001)
	 */
	public void setC10_6001_6202(T6202 c10_6001_6202) {
		this.c10_6001_6202 = c10_6001_6202;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO DO BAIRRO (c11_6001) da tabela ENDEREÇO
	 * (t6001)
	 */
	public String getC11_6001() {
		return this.c11_6001;
	}

	/**
	 * Define valor do campo DESCRIÇÃO DO BAIRRO (c11_6001) da tabela ENDEREÇO
	 * (t6001)
	 */
	public void setC11_6001(String c11_6001) {
		this.c11_6001 = transformarEAdicionarNoC2(c11_6001);
	}

	/**
	 * Busca valor do campo CIDADE (c12_6001_6201) da tabela ENDEREÇO (t6001)
	 */
	public T6201 getC12_6001_6201() {
		return this.c12_6001_6201;
	}

	/**
	 * Define valor do campo CIDADE (c12_6001_6201) da tabela ENDEREÇO (t6001)
	 */
	public void setC12_6001_6201(T6201 c12_6001_6201) {
		this.c12_6001_6201 = c12_6001_6201;
	}

	/**
	 * Busca valor do campo NÚMERO DO CEP (c13_6001) da tabela ENDEREÇO (t6001)
	 */
	public String getC13_6001() {
		return this.c13_6001;
	}

	/**
	 * Define valor do campo NÚMERO DO CEP (c13_6001) da tabela ENDEREÇO (t6001)
	 */
	public void setC13_6001(String c13_6001) {
		this.c13_6001 = transformarEAdicionarNoC2(c13_6001);
	}

	/** Busca valor do campo REFERÊNCIA (c14_6001) da tabela ENDEREÇO (t6001) */
	public String getC14_6001() {
		return this.c14_6001;
	}

	/**
	 * Define valor do campo REFERÊNCIA (c14_6001) da tabela ENDEREÇO (t6001)
	 */
	public void setC14_6001(String c14_6001) {
		this.c14_6001 = transformarEAdicionarNoC2(c14_6001);
	}

	/**
	 * Busca valor do campo TIPO DE COORDENADA (c15_6001_5002) da tabela
	 * ENDEREÇO (t6001)
	 */
	public T5002 getC15_6001_5002() {
		return this.c15_6001_5002;
	}

	/**
	 * Define valor do campo TIPO DE COORDENADA (c15_6001_5002) da tabela
	 * ENDEREÇO (t6001)
	 */
	public void setC15_6001_5002(T5002 c15_6001_5002) {
		this.c15_6001_5002 = c15_6001_5002;
	}

	/** Busca valor do campo LATITUDE (c16_6001) da tabela ENDEREÇO (t6001) */
	public String getC16_6001() {
		return this.c16_6001;
	}

	/** Define valor do campo LATITUDE (c16_6001) da tabela ENDEREÇO (t6001) */
	public void setC16_6001(String c16_6001) {
		this.c16_6001 = c16_6001;
	}

	/** Busca valor do campo LONGITUDE (c17_6001) da tabela ENDEREÇO (t6001) */
	public String getC17_6001() {
		return this.c17_6001;
	}

	/** Define valor do campo LONGITUDE (c17_6001) da tabela ENDEREÇO (t6001) */
	public void setC17_6001(String c17_6001) {
		this.c17_6001 = c17_6001;
	}

	/**
	 * Busca valor do campo referencia ENDEREÇO (c5_1002_6001) da tabela
	 * ENTIDADE_ENDEREÇO (t1002)
	 */
	public Set<T1002> getT1002C5() {
		return this.t1002C5;
	}

	/**
	 * Define valor do campo referencia ENDEREÇO (c5_1002_6001) da tabela
	 * ENTIDADE_ENDEREÇO (t1002)
	 */
	public void setT1002C5(Set<T1002> t1002C5) {
		this.t1002C5 = t1002C5;
	}

	/**
	 * Busca valor do campo referencia TABELA DE ENDERECO (c5_2002_6001) da
	 * tabela INSUMO_ENDEREÇO (t2002)
	 */
	public Set<T2002> getT2002C5() {
		return this.t2002C5;
	}

	/**
	 * Define valor do campo referencia TABELA DE ENDERECO (c5_2002_6001) da
	 * tabela INSUMO_ENDEREÇO (t2002)
	 */
	public void setT2002C5(Set<T2002> t2002C5) {
		this.t2002C5 = t2002C5;
	}

	@Override
	public String toString() {
		return "ENDEREÇO (t6001) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_6001)=" + c1_6001 + "\n\t\tDESCRIÇÃO (c2_6001)="
				+ c2_6001 + "\n\t\tLOGRADOURO (c6_6001)=" + c6_6001 + "\n\t\tNÚMERO (c7_6001)=" + c7_6001
				+ "\n\t\tCOMPLEMENTO (c9_6001)=" + c9_6001 + "\n\t\tDESCRIÇÃO DO BAIRRO (c11_6001)=" + c11_6001
				+ "\n\t\tNÚMERO DO CEP (c13_6001)=" + c13_6001 + "\n\t\tREFERÊNCIA (c14_6001)=" + c14_6001
				+ "\n\t\tLATITUDE (c16_6001)=" + c16_6001 + "\n\t\tLONGITUDE (c17_6001)=" + c17_6001 + "]";
	}

}
