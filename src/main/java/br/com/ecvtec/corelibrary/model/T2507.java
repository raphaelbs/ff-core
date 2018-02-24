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
 * Classe CONTA_CORRENTISTA.<br>
 * Representa a tabela t2507 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2507")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2507 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2507) da tabela CONTA_CORRENTISTA (t2507)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2507;

	/** Campo CONTA (c2_2507_2501) da tabela CONTA_CORRENTISTA (t2507) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2507_2501", foreignKey = @ForeignKey(name = "r2_2507_2501"))
	private T2501 c2_2507_2501;

	/**
	 * Campo TIPO DE CORRENTISTA (c3_2507_5002) da tabela CONTA_CORRENTISTA
	 * (t2507)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_2507_5002", foreignKey = @ForeignKey(name = "r3_2507_5002"))
	private T5002 c3_2507_5002;

	/** Campo CORRENTISTA (c4_2507_1001) da tabela CONTA_CORRENTISTA (t2507) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_2507_1001", foreignKey = @ForeignKey(name = "r4_2507_1001"))
	private T1001 c4_2507_1001;

	/**
	 * Campo CORRENTISTA PRAÇA (c5_2507_1002) da tabela CONTA_CORRENTISTA
	 * (t2507)
	 */
	@ManyToOne
	@JoinColumn(name = "c5_2507_1002", foreignKey = @ForeignKey(name = "r5_2507_1002"))
	private T1002 c5_2507_1002;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2507) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public int getC1_2507() {
		return this.c1_2507;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2507) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public void setC1_2507(int c1_2507) {
		this.c1_2507 = c1_2507;
	}

	/**
	 * Busca valor do campo CONTA (c2_2507_2501) da tabela CONTA_CORRENTISTA
	 * (t2507)
	 */
	public T2501 getC2_2507_2501() {
		return this.c2_2507_2501;
	}

	/**
	 * Define valor do campo CONTA (c2_2507_2501) da tabela CONTA_CORRENTISTA
	 * (t2507)
	 */
	public void setC2_2507_2501(T2501 c2_2507_2501) {
		this.c2_2507_2501 = c2_2507_2501;
	}

	/**
	 * Busca valor do campo TIPO DE CORRENTISTA (c3_2507_5002) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public T5002 getC3_2507_5002() {
		return this.c3_2507_5002;
	}

	/**
	 * Define valor do campo TIPO DE CORRENTISTA (c3_2507_5002) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public void setC3_2507_5002(T5002 c3_2507_5002) {
		this.c3_2507_5002 = c3_2507_5002;
	}

	/**
	 * Busca valor do campo CORRENTISTA (c4_2507_1001) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public T1001 getC4_2507_1001() {
		return this.c4_2507_1001;
	}

	/**
	 * Define valor do campo CORRENTISTA (c4_2507_1001) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public void setC4_2507_1001(T1001 c4_2507_1001) {
		this.c4_2507_1001 = c4_2507_1001;
	}

	/**
	 * Busca valor do campo CORRENTISTA PRAÇA (c5_2507_1002) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public T1002 getC5_2507_1002() {
		return this.c5_2507_1002;
	}

	/**
	 * Define valor do campo CORRENTISTA PRAÇA (c5_2507_1002) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public void setC5_2507_1002(T1002 c5_2507_1002) {
		this.c5_2507_1002 = c5_2507_1002;
	}

	@Override
	public String toString() {
		return "CONTA_CORRENTISTA (t2507) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2507)=" + c1_2507 + "]";
	}

}
