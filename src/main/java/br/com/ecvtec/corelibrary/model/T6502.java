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
 * Classe MENSAGEM_DESTINATÁRIO.<br>
 * Representa a tabela t6502 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6502")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6502 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMÁRIA (c1_6502) da tabela MENSAGEM_DESTINATÁRIO
	 * (t6502)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6502;

	/** Campo MENSAGEM (c2_6502_6501) da tabela MENSAGEM_DESTINATÁRIO (t6502) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_6502_6501", foreignKey = @ForeignKey(name = "r2_6502_6501"))
	private T6501 c2_6502_6501;

	/**
	 * Campo DESTINATARIO_AGENDA (c3_6502_1005) da tabela MENSAGEM_DESTINATÁRIO
	 * (t6502)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_6502_1005", foreignKey = @ForeignKey(name = "r3_6502_1005"))
	private T1005 c3_6502_1005;

	/** Campo TEXTO (c4_6502) da tabela MENSAGEM_DESTINATÁRIO (t6502) */
	@Size(max = 1600, message = "TEXTO deve possuir no máximo {max} caracteres.")
	private String c4_6502;

	/** Campo STATUS (c5_6502_5002) da tabela MENSAGEM_DESTINATÁRIO (t6502) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c5_6502_5002", foreignKey = @ForeignKey(name = "r5_6502_5002"))
	private T5002 c5_6502_5002;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMÁRIA (c1_6502) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public int getC1_6502() {
		return this.c1_6502;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMÁRIA (c1_6502) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public void setC1_6502(int c1_6502) {
		this.c1_6502 = c1_6502;
	}

	/**
	 * Busca valor do campo MENSAGEM (c2_6502_6501) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public T6501 getC2_6502_6501() {
		return this.c2_6502_6501;
	}

	/**
	 * Define valor do campo MENSAGEM (c2_6502_6501) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public void setC2_6502_6501(T6501 c2_6502_6501) {
		this.c2_6502_6501 = c2_6502_6501;
	}

	/**
	 * Busca valor do campo DESTINATARIO_AGENDA (c3_6502_1005) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public T1005 getC3_6502_1005() {
		return this.c3_6502_1005;
	}

	/**
	 * Define valor do campo DESTINATARIO_AGENDA (c3_6502_1005) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public void setC3_6502_1005(T1005 c3_6502_1005) {
		this.c3_6502_1005 = c3_6502_1005;
	}

	/**
	 * Busca valor do campo TEXTO (c4_6502) da tabela MENSAGEM_DESTINATÁRIO
	 * (t6502)
	 */
	public String getC4_6502() {
		return this.c4_6502;
	}

	/**
	 * Define valor do campo TEXTO (c4_6502) da tabela MENSAGEM_DESTINATÁRIO
	 * (t6502)
	 */
	public void setC4_6502(String c4_6502) {
		this.c4_6502 = c4_6502;
	}

	/**
	 * Busca valor do campo STATUS (c5_6502_5002) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public T5002 getC5_6502_5002() {
		return this.c5_6502_5002;
	}

	/**
	 * Define valor do campo STATUS (c5_6502_5002) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public void setC5_6502_5002(T5002 c5_6502_5002) {
		this.c5_6502_5002 = c5_6502_5002;
	}

	@Override
	public String toString() {
		return "MENSAGEM_DESTINATÁRIO (t6502) [" + "\n\t\tCHAVE SEQUENCIAL PRIMÁRIA (c1_6502)=" + c1_6502
				+ "\n\t\tTEXTO (c4_6502)=" + c4_6502 + "]";
	}

}
