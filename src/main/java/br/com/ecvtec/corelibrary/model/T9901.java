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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe LOG.<br>
 * Representa a tabela t9901 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9901")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9901 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo CHAVE SEQUENCIAL PRIMÁRIA (c1_9901) da tabela LOG (t9901) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9901;

	/** Campo TIPO (c2_9901_5002) da tabela LOG (t9901) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9901_5002", foreignKey = @ForeignKey(name = "r2_9901_5002"))
	private T5002 c2_9901_5002;

	/** Campo TABELA (c3_9901_101) da tabela LOG (t9901) */

	@ManyToOne
	@JoinColumn(name = "c3_9901_101", foreignKey = @ForeignKey(name = "r3_9901_101"))
	private T101 c3_9901_101;

	/** Campo TABELA_PK (c4_9901) da tabela LOG (t9901) */
	private int c4_9901;

	/** Campo USUÁRIO (c5_9901_1001) da tabela LOG (t9901) */
	@ManyToOne
	@JoinColumn(name = "c5_9901_1001", foreignKey = @ForeignKey(name = "r5_9901_1001"))
	private T1001 c5_9901_1001;

	/** Campo HORA_INÍCIO (c6_9901) da tabela LOG (t9901) */
	@NotNull
	private Date c6_9901;

	/** Campo MÁQUINA (c7_9901) da tabela LOG (t9901) */
	@Size(max = 80, message = "MÁQUINA deve possuir no máximo {max} caracteres.")
	private String c7_9901;

	/** Campo MÁQUINA_IP (c8_9901) da tabela LOG (t9901) */
	@Size(max = 80, message = "MÁQUINA_IP deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c8_9901;

	/** Campo FORM (c9_9901) da tabela LOG (t9901) */
	@Size(max = 80, message = "FORM deve possuir no máximo {max} caracteres.")
	private String c9_9901;

	/** Campo COMENTÁRIO (c10_9901) da tabela LOG (t9901) */
	@Size(max = 160, message = "COMENTÁRIO deve possuir no máximo {max} caracteres.")
	private String c10_9901;

	/** Referencia ao campo LOG (c2_9902_9901) da tabela LOG_ITEM (t9902) */
	@JsonBackReference(value = "c2_9902_9901")
	@OneToMany(mappedBy = "c2_9902_9901", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9902> t9902C2;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMÁRIA (c1_9901) da tabela LOG
	 * (t9901)
	 */
	public int getC1_9901() {
		return this.c1_9901;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMÁRIA (c1_9901) da tabela LOG
	 * (t9901)
	 */
	public void setC1_9901(int c1_9901) {
		this.c1_9901 = c1_9901;
	}

	/** Busca valor do campo TIPO (c2_9901_5002) da tabela LOG (t9901) */
	public T5002 getC2_9901_5002() {
		return this.c2_9901_5002;
	}

	/** Define valor do campo TIPO (c2_9901_5002) da tabela LOG (t9901) */
	public void setC2_9901_5002(T5002 c2_9901_5002) {
		this.c2_9901_5002 = c2_9901_5002;
	}

	/** Busca valor do campo TABELA (c3_9901_101) da tabela LOG (t9901) */
	/*
	 * public T101 getC3_9901_101(){ return this.c3_9901_101; }
	 */

	/** Define valor do campo TABELA (c3_9901_101) da tabela LOG (t9901) */
	/*
	 * public void setC3_9901_101(T101 c3_9901_101){ this.c3_9901_101 =
	 * c3_9901_101; }
	 */

	/** Busca valor do campo TABELA_PK (c4_9901) da tabela LOG (t9901) */
	public int getC4_9901() {
		return this.c4_9901;
	}

	/** Define valor do campo TABELA_PK (c4_9901) da tabela LOG (t9901) */
	public void setC4_9901(int c4_9901) {
		this.c4_9901 = c4_9901;
	}

	/** Busca valor do campo USUÁRIO (c5_9901_1001) da tabela LOG (t9901) */
	public T1001 getC5_9901_1001() {
		return this.c5_9901_1001;
	}

	/** Define valor do campo USUÁRIO (c5_9901_1001) da tabela LOG (t9901) */
	public void setC5_9901_1001(T1001 c5_9901_1001) {
		this.c5_9901_1001 = c5_9901_1001;
	}

	/** Busca valor do campo HORA_INÍCIO (c6_9901) da tabela LOG (t9901) */
	public Date getC6_9901() {
		return this.c6_9901;
	}

	/** Define valor do campo HORA_INÍCIO (c6_9901) da tabela LOG (t9901) */
	public void setC6_9901(Date c6_9901) {
		this.c6_9901 = c6_9901;
	}

	/** Busca valor do campo MÁQUINA (c7_9901) da tabela LOG (t9901) */
	public String getC7_9901() {
		return this.c7_9901;
	}

	/** Define valor do campo MÁQUINA (c7_9901) da tabela LOG (t9901) */
	public void setC7_9901(String c7_9901) {
		this.c7_9901 = c7_9901;
	}

	/** Busca valor do campo MÁQUINA_IP (c8_9901) da tabela LOG (t9901) */
	public String getC8_9901() {
		return this.c8_9901;
	}

	/** Define valor do campo MÁQUINA_IP (c8_9901) da tabela LOG (t9901) */
	public void setC8_9901(String c8_9901) {
		this.c8_9901 = c8_9901;
	}

	/** Busca valor do campo FORM (c9_9901) da tabela LOG (t9901) */
	public String getC9_9901() {
		return this.c9_9901;
	}

	/** Define valor do campo FORM (c9_9901) da tabela LOG (t9901) */
	public void setC9_9901(String c9_9901) {
		this.c9_9901 = c9_9901;
	}

	/** Busca valor do campo COMENTÁRIO (c10_9901) da tabela LOG (t9901) */
	public String getC10_9901() {
		return this.c10_9901;
	}

	/** Define valor do campo COMENTÁRIO (c10_9901) da tabela LOG (t9901) */
	public void setC10_9901(String c10_9901) {
		this.c10_9901 = c10_9901;
	}

	/**
	 * Busca valor do campo referencia LOG (c2_9902_9901) da tabela LOG_ITEM
	 * (t9902)
	 */
	public Set<T9902> getT9902C2() {
		return this.t9902C2;
	}

	/**
	 * Define valor do campo referencia LOG (c2_9902_9901) da tabela LOG_ITEM
	 * (t9902)
	 */
	public void setT9902C2(Set<T9902> t9902C2) {
		this.t9902C2 = t9902C2;
	}

	@Override
	public String toString() {
		return "LOG (t9901) [" + "\n\t\tCHAVE SEQUENCIAL PRIMÁRIA (c1_9901)=" + c1_9901 + "\n\t\tTABELA_PK (c4_9901)="
				+ c4_9901 + "\n\t\tHORA_INÍCIO (c6_9901)=" + c6_9901 + "\n\t\tMÁQUINA (c7_9901)=" + c7_9901
				+ "\n\t\tMÁQUINA_IP (c8_9901)=" + c8_9901 + "\n\t\tFORM (c9_9901)=" + c9_9901
				+ "\n\t\tCOMENTÁRIO (c10_9901)=" + c10_9901 + "]";
	}

}
