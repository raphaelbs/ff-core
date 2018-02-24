package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe ENTIDADE_IMAGEM.<br>
 * Representa a tabela t1008 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1008")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1008 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_1008) da tabela ENTIDADE_IMAGEM (t1008)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1008;

	/** Campo PESSOA (c2_1008_1001) da tabela ENTIDADE_IMAGEM (t1008) */
	@NotNull
	@ManyToOne
	@JsonBackReference("c2_1008_1001")
	@JoinColumn(name = "c2_1008_1001", foreignKey = @ForeignKey(name = "r2_1008_1001"))
	private T1001 c2_1008_1001;

	/** Campo TIPO DE IMAGEM (c3_1008_5002) da tabela ENTIDADE_IMAGEM (t1008) */
	@ManyToOne
	@JoinColumn(name = "c3_1008_5002", foreignKey = @ForeignKey(name = "r3_1008_5002"))
	private T5002 c3_1008_5002;

	/** Campo IMAGEM (c4_1008_5501) da tabela ENTIDADE_IMAGEM (t1008) */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c4_1008_5501", foreignKey = @ForeignKey(name = "r4_1008_5501"))
	private T5501 c4_1008_5501;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1008) da tabela
	 * ENTIDADE_IMAGEM (t1008)
	 */
	public int getC1_1008() {
		return this.c1_1008;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1008) da tabela
	 * ENTIDADE_IMAGEM (t1008)
	 */
	public void setC1_1008(int c1_1008) {
		this.c1_1008 = c1_1008;
	}

	/**
	 * Busca valor do campo PESSOA (c2_1008_1001) da tabela ENTIDADE_IMAGEM
	 * (t1008)
	 */
	public T1001 getC2_1008_1001() {
		return this.c2_1008_1001;
	}

	/**
	 * Define valor do campo PESSOA (c2_1008_1001) da tabela ENTIDADE_IMAGEM
	 * (t1008)
	 */
	public void setC2_1008_1001(T1001 c2_1008_1001) {
		this.c2_1008_1001 = c2_1008_1001;
	}

	/**
	 * Busca valor do campo TIPO DE IMAGEM (c3_1008_5002) da tabela
	 * ENTIDADE_IMAGEM (t1008)
	 */
	public T5002 getC3_1008_5002() {
		return this.c3_1008_5002;
	}

	/**
	 * Define valor do campo TIPO DE IMAGEM (c3_1008_5002) da tabela
	 * ENTIDADE_IMAGEM (t1008)
	 */
	public void setC3_1008_5002(T5002 c3_1008_5002) {
		this.c3_1008_5002 = c3_1008_5002;
	}

	/**
	 * Busca valor do campo IMAGEM (c4_1008_5501) da tabela ENTIDADE_IMAGEM
	 * (t1008)
	 */
	public T5501 getC4_1008_5501() {
		return this.c4_1008_5501;
	}

	/**
	 * Define valor do campo IMAGEM (c4_1008_5501) da tabela ENTIDADE_IMAGEM
	 * (t1008)
	 */
	public void setC4_1008_5501(T5501 c4_1008_5501) {
		this.c4_1008_5501 = c4_1008_5501;
	}

	@Override
	public String toString() {
		return "ENTIDADE_IMAGEM (t1008) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1008)=" + c1_1008 + "]";
	}

}
