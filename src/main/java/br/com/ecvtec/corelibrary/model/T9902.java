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
 * Classe LOG_ITEM.<br>
 * Representa a tabela t9902 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9902")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9902 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo CHAVE SEQUENCIAL PRIMARIA (c1_9902) da tabela LOG_ITEM (t9902) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9902;

	/** Campo LOG (c2_9902_9901) da tabela LOG_ITEM (t9902) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9902_9901", foreignKey = @ForeignKey(name = "r2_9902_9901"))
	private T9901 c2_9902_9901;

	/** Campo DADO (c3_9902_5501) da tabela LOG_ITEM (t9902) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_9902_5501", foreignKey = @ForeignKey(name = "r3_9902_5501"))
	private T5501 c3_9902_5501;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9902) da tabela
	 * LOG_ITEM (t9902)
	 */
	public int getC1_9902() {
		return this.c1_9902;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9902) da tabela
	 * LOG_ITEM (t9902)
	 */
	public void setC1_9902(int c1_9902) {
		this.c1_9902 = c1_9902;
	}

	/** Busca valor do campo LOG (c2_9902_9901) da tabela LOG_ITEM (t9902) */
	public T9901 getC2_9902_9901() {
		return this.c2_9902_9901;
	}

	/** Define valor do campo LOG (c2_9902_9901) da tabela LOG_ITEM (t9902) */
	public void setC2_9902_9901(T9901 c2_9902_9901) {
		this.c2_9902_9901 = c2_9902_9901;
	}

	/** Busca valor do campo DADO (c3_9902_5501) da tabela LOG_ITEM (t9902) */
	public T5501 getC3_9902_5501() {
		return this.c3_9902_5501;
	}

	/** Define valor do campo DADO (c3_9902_5501) da tabela LOG_ITEM (t9902) */
	public void setC3_9902_5501(T5501 c3_9902_5501) {
		this.c3_9902_5501 = c3_9902_5501;
	}

	@Override
	public String toString() {
		return "LOG_ITEM (t9902) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_9902)=" + c1_9902 + "]";
	}

}
