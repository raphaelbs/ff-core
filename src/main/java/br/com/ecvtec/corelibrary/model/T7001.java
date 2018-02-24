package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.sql.Date;
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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe HISTÓRICO_FUNCIONAL.<br>
 * Representa a tabela t7001 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t7001")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T7001 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_7001) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_7001;

	/** Campo COLIGADA (c2_7001_1001) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_7001_1001", foreignKey = @ForeignKey(name = "r2_7001_1001"))
	private T1001 c2_7001_1001;

	/**
	 * Campo FUNCIONÁRIO (c3_7001_1001) da tabela HISTÓRICO_FUNCIONAL (t7001)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_7001_1001", foreignKey = @ForeignKey(name = "r3_7001_1001"))
	private T1001 c3_7001_1001;

	/** Campo DATA INÍCIO (c4_7001) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	private Date c4_7001;

	/** Campo DATA FIM (c5_7001) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	private Date c5_7001;

	/** Campo SINDICATO (c6_7001_1001) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	@ManyToOne
	@JoinColumn(name = "c6_7001_1001", foreignKey = @ForeignKey(name = "r6_7001_1001"))
	private T1001 c6_7001_1001;

	/** Campo CARGO (c7_7001_5002) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	@ManyToOne
	@JoinColumn(name = "c7_7001_5002", foreignKey = @ForeignKey(name = "r7_7001_5002"))
	private T5002 c7_7001_5002;

	/** Campo MATRICULA (c8_7001) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	@Size(max = 40, message = "MATRICULA deve possuir no máximo {max} caracteres.")
	private String c8_7001;

	/**
	 * Campo VALOR REMUNERAÇÃO (c9_7001) da tabela HISTÓRICO_FUNCIONAL (t7001)
	 */
	@Digits(integer = 20, fraction = 6, message = "VALOR REMUNERAÇÃO deve possuir no máximo {integer},{fraction} digitos.")
	private double c9_7001;

	/**
	 * Campo PERÍODO REMUNERAÇÃO (c10_7001_5002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	@ManyToOne
	@JoinColumn(name = "c10_7001_5002", foreignKey = @ForeignKey(name = "r10_7001_5002"))
	private T5002 c10_7001_5002;

	/** Campo VALOR COMISSÃO (c11_7001) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	@Digits(integer = 20, fraction = 6, message = "VALOR COMISSÃO deve possuir no máximo {integer},{fraction} digitos.")
	private double c11_7001;

	/**
	 * Campo PERÍODO COMISSÃO (c12_7001_5002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	@ManyToOne
	@JoinColumn(name = "c12_7001_5002", foreignKey = @ForeignKey(name = "r12_7001_5002"))
	private T5002 c12_7001_5002;

	/** Campo FILIAL (c13_7001_1002) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	@ManyToOne
	@JoinColumn(name = "c13_7001_1002", foreignKey = @ForeignKey(name = "r13_7001_1002"))
	private T1002 c13_7001_1002;

	/**
	 * Campo DEPARTAMENTO (c14_7001_6401) da tabela HISTÓRICO_FUNCIONAL (t7001)
	 */
	@ManyToOne
	@JoinColumn(name = "c14_7001_6401", foreignKey = @ForeignKey(name = "r14_7001_6401"))
	private T6401 c14_7001_6401;

	/** Campo STATUS (c15_7001_5002) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	@ManyToOne
	@JoinColumn(name = "c15_7001_5002", foreignKey = @ForeignKey(name = "r15_7001_5002"))
	private T5002 c15_7001_5002;

	/**
	 * Campo HORAS CONTRATADAS (c16_7001) da tabela HISTÓRICO_FUNCIONAL (t7001)
	 */
	@Size(max = 40, message = "HORAS CONTRATADAS deve possuir no máximo {max} caracteres.")
	private String c16_7001;

	/** Campo MOEDA (c17_7001_5002) da tabela HISTÓRICO_FUNCIONAL (t7001) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c17_7001_5002", foreignKey = @ForeignKey(name = "r17_7001_5002"))
	private T5002 c17_7001_5002;

	/**
	 * Referencia ao campo HISTÓRICO FUNCIONAL (c2_7006_7001) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	@JsonBackReference(value = "c2_7006_7001")
	@OneToMany(mappedBy = "c2_7006_7001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T7006> t7006C2;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_7001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public int getC1_7001() {
		return this.c1_7001;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_7001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC1_7001(int c1_7001) {
		this.c1_7001 = c1_7001;
	}

	/**
	 * Busca valor do campo COLIGADA (c2_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public T1001 getC2_7001_1001() {
		return this.c2_7001_1001;
	}

	/**
	 * Define valor do campo COLIGADA (c2_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC2_7001_1001(T1001 c2_7001_1001) {
		this.c2_7001_1001 = c2_7001_1001;
	}

	/**
	 * Busca valor do campo FUNCIONÁRIO (c3_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public T1001 getC3_7001_1001() {
		return this.c3_7001_1001;
	}

	/**
	 * Define valor do campo FUNCIONÁRIO (c3_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC3_7001_1001(T1001 c3_7001_1001) {
		this.c3_7001_1001 = c3_7001_1001;
	}

	/**
	 * Busca valor do campo DATA INÍCIO (c4_7001) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public Date getC4_7001() {
		return this.c4_7001;
	}

	/**
	 * Define valor do campo DATA INÍCIO (c4_7001) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public void setC4_7001(Date c4_7001) {
		this.c4_7001 = c4_7001;
	}

	/**
	 * Busca valor do campo DATA FIM (c5_7001) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public Date getC5_7001() {
		return this.c5_7001;
	}

	/**
	 * Define valor do campo DATA FIM (c5_7001) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public void setC5_7001(Date c5_7001) {
		this.c5_7001 = c5_7001;
	}

	/**
	 * Busca valor do campo SINDICATO (c6_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public T1001 getC6_7001_1001() {
		return this.c6_7001_1001;
	}

	/**
	 * Define valor do campo SINDICATO (c6_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC6_7001_1001(T1001 c6_7001_1001) {
		this.c6_7001_1001 = c6_7001_1001;
	}

	/**
	 * Busca valor do campo CARGO (c7_7001_5002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public T5002 getC7_7001_5002() {
		return this.c7_7001_5002;
	}

	/**
	 * Define valor do campo CARGO (c7_7001_5002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public void setC7_7001_5002(T5002 c7_7001_5002) {
		this.c7_7001_5002 = c7_7001_5002;
	}

	/**
	 * Busca valor do campo MATRICULA (c8_7001) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public String getC8_7001() {
		return this.c8_7001;
	}

	/**
	 * Define valor do campo MATRICULA (c8_7001) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public void setC8_7001(String c8_7001) {
		this.c8_7001 = c8_7001;
	}

	/**
	 * Busca valor do campo VALOR REMUNERAÇÃO (c9_7001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public double getC9_7001() {
		return this.c9_7001;
	}

	/**
	 * Define valor do campo VALOR REMUNERAÇÃO (c9_7001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC9_7001(double c9_7001) {
		this.c9_7001 = c9_7001;
	}

	/**
	 * Busca valor do campo PERÍODO REMUNERAÇÃO (c10_7001_5002) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public T5002 getC10_7001_5002() {
		return this.c10_7001_5002;
	}

	/**
	 * Define valor do campo PERÍODO REMUNERAÇÃO (c10_7001_5002) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC10_7001_5002(T5002 c10_7001_5002) {
		this.c10_7001_5002 = c10_7001_5002;
	}

	/**
	 * Busca valor do campo VALOR COMISSÃO (c11_7001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public double getC11_7001() {
		return this.c11_7001;
	}

	/**
	 * Define valor do campo VALOR COMISSÃO (c11_7001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC11_7001(double c11_7001) {
		this.c11_7001 = c11_7001;
	}

	/**
	 * Busca valor do campo PERÍODO COMISSÃO (c12_7001_5002) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public T5002 getC12_7001_5002() {
		return this.c12_7001_5002;
	}

	/**
	 * Define valor do campo PERÍODO COMISSÃO (c12_7001_5002) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC12_7001_5002(T5002 c12_7001_5002) {
		this.c12_7001_5002 = c12_7001_5002;
	}

	/**
	 * Busca valor do campo FILIAL (c13_7001_1002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public T1002 getC13_7001_1002() {
		return this.c13_7001_1002;
	}

	/**
	 * Define valor do campo FILIAL (c13_7001_1002) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC13_7001_1002(T1002 c13_7001_1002) {
		this.c13_7001_1002 = c13_7001_1002;
	}

	/**
	 * Busca valor do campo DEPARTAMENTO (c14_7001_6401) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public T6401 getC14_7001_6401() {
		return this.c14_7001_6401;
	}

	/**
	 * Define valor do campo DEPARTAMENTO (c14_7001_6401) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC14_7001_6401(T6401 c14_7001_6401) {
		this.c14_7001_6401 = c14_7001_6401;
	}

	/**
	 * Busca valor do campo STATUS (c15_7001_5002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public T5002 getC15_7001_5002() {
		return this.c15_7001_5002;
	}

	/**
	 * Define valor do campo STATUS (c15_7001_5002) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC15_7001_5002(T5002 c15_7001_5002) {
		this.c15_7001_5002 = c15_7001_5002;
	}

	/**
	 * Busca valor do campo HORAS CONTRATADAS (c16_7001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public String getC16_7001() {
		return this.c16_7001;
	}

	/**
	 * Define valor do campo HORAS CONTRATADAS (c16_7001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setC16_7001(String c16_7001) {
		this.c16_7001 = c16_7001;
	}

	/**
	 * Busca valor do campo MOEDA (c17_7001_5002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public T5002 getC17_7001_5002() {
		return this.c17_7001_5002;
	}

	/**
	 * Define valor do campo MOEDA (c17_7001_5002) da tabela HISTÓRICO_FUNCIONAL
	 * (t7001)
	 */
	public void setC17_7001_5002(T5002 c17_7001_5002) {
		this.c17_7001_5002 = c17_7001_5002;
	}

	/**
	 * Busca valor do campo referencia HISTÓRICO FUNCIONAL (c2_7006_7001) da
	 * tabela HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public Set<T7006> getT7006C2() {
		return this.t7006C2;
	}

	/**
	 * Define valor do campo referencia HISTÓRICO FUNCIONAL (c2_7006_7001) da
	 * tabela HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public void setT7006C2(Set<T7006> t7006C2) {
		this.t7006C2 = t7006C2;
	}

	@Override
	public String toString() {
		return "HISTÓRICO_FUNCIONAL (t7001) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_7001)=" + c1_7001
				+ "\n\t\tDATA INÍCIO (c4_7001)=" + c4_7001 + "\n\t\tDATA FIM (c5_7001)=" + c5_7001
				+ "\n\t\tMATRICULA (c8_7001)=" + c8_7001 + "\n\t\tVALOR REMUNERAÇÃO (c9_7001)=" + c9_7001
				+ "\n\t\tVALOR COMISSÃO (c11_7001)=" + c11_7001 + "\n\t\tHORAS CONTRATADAS (c16_7001)=" + c16_7001
				+ "]";
	}

}
