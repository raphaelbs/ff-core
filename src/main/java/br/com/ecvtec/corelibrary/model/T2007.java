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
 * Classe INSUMO_ENTIDADE.<br>
 * Representa a tabela t2007 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2007")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2007 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2007) da tabela INSUMO_ENTIDADE (t2007)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2007;

	/**
	 * Campo TABELA DE INSUMO (c2_2007_2001) da tabela INSUMO_ENTIDADE (t2007)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2007_2001", foreignKey = @ForeignKey(name = "r2_2007_2001"))
	private T2001 c2_2007_2001;

	/**
	 * Campo TIPO (FABRICANTE/MARCA, PROPRIETARIO, LOCATARIO, MOTORISTA E ETC
	 * (c3_2007_5002) da tabela INSUMO_ENTIDADE (t2007)
	 */
	@ManyToOne
	@JoinColumn(name = "c3_2007_5002", foreignKey = @ForeignKey(name = "r3_2007_5002"))
	private T5002 c3_2007_5002;

	/**
	 * Campo TABELA DE PESSOA (PRACA) (c4_2007_1002) da tabela INSUMO_ENTIDADE
	 * (t2007)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_2007_1002", foreignKey = @ForeignKey(name = "r4_2007_1002"))
	private T1002 c4_2007_1002;

	/** Campo STATUS (c5_2007_5002) da tabela INSUMO_ENTIDADE (t2007) */
	@ManyToOne
	@JoinColumn(name = "c5_2007_5002", foreignKey = @ForeignKey(name = "r5_2007_5002"))
	private T5002 c5_2007_5002;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2007) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	public int getC1_2007() {
		return this.c1_2007;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2007) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	public void setC1_2007(int c1_2007) {
		this.c1_2007 = c1_2007;
	}

	/**
	 * Busca valor do campo TABELA DE INSUMO (c2_2007_2001) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	public T2001 getC2_2007_2001() {
		return this.c2_2007_2001;
	}

	/**
	 * Define valor do campo TABELA DE INSUMO (c2_2007_2001) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	public void setC2_2007_2001(T2001 c2_2007_2001) {
		this.c2_2007_2001 = c2_2007_2001;
	}

	/**
	 * Busca valor do campo TIPO (FABRICANTE/MARCA, PROPRIETARIO, LOCATARIO,
	 * MOTORISTA E ETC (c3_2007_5002) da tabela INSUMO_ENTIDADE (t2007)
	 */
	public T5002 getC3_2007_5002() {
		return this.c3_2007_5002;
	}

	/**
	 * Define valor do campo TIPO (FABRICANTE/MARCA, PROPRIETARIO, LOCATARIO,
	 * MOTORISTA E ETC (c3_2007_5002) da tabela INSUMO_ENTIDADE (t2007)
	 */
	public void setC3_2007_5002(T5002 c3_2007_5002) {
		this.c3_2007_5002 = c3_2007_5002;
	}

	/**
	 * Busca valor do campo TABELA DE PESSOA (PRACA) (c4_2007_1002) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	public T1002 getC4_2007_1002() {
		return this.c4_2007_1002;
	}

	/**
	 * Define valor do campo TABELA DE PESSOA (PRACA) (c4_2007_1002) da tabela
	 * INSUMO_ENTIDADE (t2007)
	 */
	public void setC4_2007_1002(T1002 c4_2007_1002) {
		this.c4_2007_1002 = c4_2007_1002;
	}

	/**
	 * Busca valor do campo STATUS (c5_2007_5002) da tabela INSUMO_ENTIDADE
	 * (t2007)
	 */
	public T5002 getC5_2007_5002() {
		return this.c5_2007_5002;
	}

	/**
	 * Define valor do campo STATUS (c5_2007_5002) da tabela INSUMO_ENTIDADE
	 * (t2007)
	 */
	public void setC5_2007_5002(T5002 c5_2007_5002) {
		this.c5_2007_5002 = c5_2007_5002;
	}

	@Override
	public String toString() {
		return "INSUMO_ENTIDADE (t2007) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2007)=" + c1_2007 + "]";
	}

}
