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
 * Classe MENSAGEM_ANEXO.<br>
 * Representa a tabela t6508 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6508")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6508 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMÁRIA (c1_6508) da tabela MENSAGEM_ANEXO
	 * (t6508)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6508;

	/** Campo MENSAGEM (c2_6508_6501) da tabela MENSAGEM_ANEXO (t6508) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_6508_6501", foreignKey = @ForeignKey(name = "r2_6508_6501"))
	private T6501 c2_6508_6501;

	/** Campo TIPO ANEXO (c3_6508_5002) da tabela MENSAGEM_ANEXO (t6508) */
	@ManyToOne
	@JoinColumn(name = "c3_6508_5002", foreignKey = @ForeignKey(name = "r3_6508_5002"))
	private T5002 c3_6508_5002;

	/** Campo ANEXO (c4_6508_5501) da tabela MENSAGEM_ANEXO (t6508) */
	@ManyToOne
	@JoinColumn(name = "c4_6508_5501", foreignKey = @ForeignKey(name = "r4_6508_5501"))
	private T5501 c4_6508_5501;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMÁRIA (c1_6508) da tabela
	 * MENSAGEM_ANEXO (t6508)
	 */
	public int getC1_6508() {
		return this.c1_6508;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMÁRIA (c1_6508) da tabela
	 * MENSAGEM_ANEXO (t6508)
	 */
	public void setC1_6508(int c1_6508) {
		this.c1_6508 = c1_6508;
	}

	/**
	 * Busca valor do campo MENSAGEM (c2_6508_6501) da tabela MENSAGEM_ANEXO
	 * (t6508)
	 */
	public T6501 getC2_6508_6501() {
		return this.c2_6508_6501;
	}

	/**
	 * Define valor do campo MENSAGEM (c2_6508_6501) da tabela MENSAGEM_ANEXO
	 * (t6508)
	 */
	public void setC2_6508_6501(T6501 c2_6508_6501) {
		this.c2_6508_6501 = c2_6508_6501;
	}

	/**
	 * Busca valor do campo TIPO ANEXO (c3_6508_5002) da tabela MENSAGEM_ANEXO
	 * (t6508)
	 */
	public T5002 getC3_6508_5002() {
		return this.c3_6508_5002;
	}

	/**
	 * Define valor do campo TIPO ANEXO (c3_6508_5002) da tabela MENSAGEM_ANEXO
	 * (t6508)
	 */
	public void setC3_6508_5002(T5002 c3_6508_5002) {
		this.c3_6508_5002 = c3_6508_5002;
	}

	/**
	 * Busca valor do campo ANEXO (c4_6508_5501) da tabela MENSAGEM_ANEXO
	 * (t6508)
	 */
	public T5501 getC4_6508_5501() {
		return this.c4_6508_5501;
	}

	/**
	 * Define valor do campo ANEXO (c4_6508_5501) da tabela MENSAGEM_ANEXO
	 * (t6508)
	 */
	public void setC4_6508_5501(T5501 c4_6508_5501) {
		this.c4_6508_5501 = c4_6508_5501;
	}

	@Override
	public String toString() {
		return "MENSAGEM_ANEXO (t6508) [" + "\n\t\tCHAVE SEQUENCIAL PRIMÁRIA (c1_6508)=" + c1_6508 + "]";
	}

}
