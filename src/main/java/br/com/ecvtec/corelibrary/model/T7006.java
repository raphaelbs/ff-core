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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe HISTÓRICO_FUNCIONAL_DETALHE.<br>
 * Representa a tabela t7006 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t7006")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T7006 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_7006) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_7006;

	/**
	 * Campo HISTÓRICO FUNCIONAL (c2_7006_7001) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_7006_7001", foreignKey = @ForeignKey(name = "r2_7006_7001"))
	private T7001 c2_7006_7001;

	/**
	 * Campo TIPO DE DETALHE (c3_7006_5002) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_7006_5002", foreignKey = @ForeignKey(name = "r3_7006_5002"))
	private T5002 c3_7006_5002;

	/**
	 * Campo TIPO DE TIPO (c4_7006_5002) da tabela HISTÓRICO_FUNCIONAL_DETALHE
	 * (t7006)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_7006_5002", foreignKey = @ForeignKey(name = "r4_7006_5002"))
	private T5002 c4_7006_5002;

	/**
	 * Campo DESCRIÇÃO (c5_7006) da tabela HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c5_7006;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_7006) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public int getC1_7006() {
		return this.c1_7006;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_7006) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public void setC1_7006(int c1_7006) {
		this.c1_7006 = c1_7006;
	}

	/**
	 * Busca valor do campo HISTÓRICO FUNCIONAL (c2_7006_7001) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public T7001 getC2_7006_7001() {
		return this.c2_7006_7001;
	}

	/**
	 * Define valor do campo HISTÓRICO FUNCIONAL (c2_7006_7001) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public void setC2_7006_7001(T7001 c2_7006_7001) {
		this.c2_7006_7001 = c2_7006_7001;
	}

	/**
	 * Busca valor do campo TIPO DE DETALHE (c3_7006_5002) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public T5002 getC3_7006_5002() {
		return this.c3_7006_5002;
	}

	/**
	 * Define valor do campo TIPO DE DETALHE (c3_7006_5002) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public void setC3_7006_5002(T5002 c3_7006_5002) {
		this.c3_7006_5002 = c3_7006_5002;
	}

	/**
	 * Busca valor do campo TIPO DE TIPO (c4_7006_5002) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public T5002 getC4_7006_5002() {
		return this.c4_7006_5002;
	}

	/**
	 * Define valor do campo TIPO DE TIPO (c4_7006_5002) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public void setC4_7006_5002(T5002 c4_7006_5002) {
		this.c4_7006_5002 = c4_7006_5002;
	}

	/**
	 * Busca valor do campo DESCRIÇÃO (c5_7006) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public String getC5_7006() {
		return this.c5_7006;
	}

	/**
	 * Define valor do campo DESCRIÇÃO (c5_7006) da tabela
	 * HISTÓRICO_FUNCIONAL_DETALHE (t7006)
	 */
	public void setC5_7006(String c5_7006) {
		this.c5_7006 = c5_7006;
	}

	@Override
	public String toString() {
		return "HISTÓRICO_FUNCIONAL_DETALHE (t7006) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_7006)=" + c1_7006
				+ "\n\t\tDESCRIÇÃO (c5_7006)=" + c5_7006 + "]";
	}

}
