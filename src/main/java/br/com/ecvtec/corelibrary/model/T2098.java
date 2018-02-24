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
 * Classe INSUMO_GRUPO.<br>
 * Representa a tabela t2098 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2098")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2098 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_2098) da tabela INSUMO_GRUPO (t2098) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2098;

	/** Campo TABELA DE INSUMO (c2_2098_2001) da tabela INSUMO_GRUPO (t2098) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2098_2001", foreignKey = @ForeignKey(name = "r2_2098_2001"))
	private T2001 c2_2098_2001;

	/**
	 * Campo GRUPO QUE O INSUMO PERTENCE (VEICULO, TELEFONE, IMPOSTO, PROVENTO,
	 * DESCONTO, COM (c3_2098_5002) da tabela INSUMO_GRUPO (t2098)
	 */
	@ManyToOne
	@JoinColumn(name = "c3_2098_5002", foreignKey = @ForeignKey(name = "r3_2098_5002"))
	private T5002 c3_2098_5002;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2098) da tabela
	 * INSUMO_GRUPO (t2098)
	 */
	public int getC1_2098() {
		return this.c1_2098;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2098) da tabela
	 * INSUMO_GRUPO (t2098)
	 */
	public void setC1_2098(int c1_2098) {
		this.c1_2098 = c1_2098;
	}

	/**
	 * Busca valor do campo TABELA DE INSUMO (c2_2098_2001) da tabela
	 * INSUMO_GRUPO (t2098)
	 */
	public T2001 getC2_2098_2001() {
		return this.c2_2098_2001;
	}

	/**
	 * Define valor do campo TABELA DE INSUMO (c2_2098_2001) da tabela
	 * INSUMO_GRUPO (t2098)
	 */
	public void setC2_2098_2001(T2001 c2_2098_2001) {
		this.c2_2098_2001 = c2_2098_2001;
	}

	/**
	 * Busca valor do campo GRUPO QUE O INSUMO PERTENCE (VEICULO, TELEFONE,
	 * IMPOSTO, PROVENTO, DESCONTO, COM (c3_2098_5002) da tabela INSUMO_GRUPO
	 * (t2098)
	 */
	public T5002 getC3_2098_5002() {
		return this.c3_2098_5002;
	}

	/**
	 * Define valor do campo GRUPO QUE O INSUMO PERTENCE (VEICULO, TELEFONE,
	 * IMPOSTO, PROVENTO, DESCONTO, COM (c3_2098_5002) da tabela INSUMO_GRUPO
	 * (t2098)
	 */
	public void setC3_2098_5002(T5002 c3_2098_5002) {
		this.c3_2098_5002 = c3_2098_5002;
	}

	@Override
	public String toString() {
		return "INSUMO_GRUPO (t2098) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2098)=" + c1_2098 + "]";
	}

}
