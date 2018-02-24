package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
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
 * Classe INSUMO_ENDEREÇO.<br>
 * Representa a tabela t2002 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t2002")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T2002 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_2002) da tabela INSUMO_ENDEREÇO (t2002)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_2002;

	/**
	 * Campo TABELA DE INSUMO (c2_2002_2001) da tabela INSUMO_ENDEREÇO (t2002)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_2002_2001", foreignKey = @ForeignKey(name = "r2_2002_2001"))
	private T2001 c2_2002_2001;

	/** Campo DESCRICAO DA PRACA (c3_2002) da tabela INSUMO_ENDEREÇO (t2002) */
	@Size(max = 40, message = "DESCRICAO DA PRACA deve possuir no máximo {max} caracteres.")
	private String c3_2002;

	/**
	 * Campo TIPO DO ENDERECO (RESIDENCIAL, COMERCIAL, ETC) (c4_2002_5002) da
	 * tabela INSUMO_ENDEREÇO (t2002)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_2002_5002", foreignKey = @ForeignKey(name = "r4_2002_5002"))
	private T5002 c4_2002_5002;

	/**
	 * Campo TABELA DE ENDERECO (c5_2002_6001) da tabela INSUMO_ENDEREÇO (t2002)
	 */
	@ManyToOne
	@JoinColumn(name = "c5_2002_6001", foreignKey = @ForeignKey(name = "r5_2002_6001"))
	private T6001 c5_2002_6001;

	/**
	 * Referencia ao campo PRACA (QUANDO IDENTIFICAÇÃO FOR POR ENDEREÇO
	 * (c3_2003_2002) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	@JsonBackReference(value = "c3_2003_2002")
	@OneToMany(mappedBy = "c3_2003_2002", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2003> t2003C3;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_2002) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public int getC1_2002() {
		return this.c1_2002;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_2002) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public void setC1_2002(int c1_2002) {
		this.c1_2002 = c1_2002;
	}

	/**
	 * Busca valor do campo TABELA DE INSUMO (c2_2002_2001) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public T2001 getC2_2002_2001() {
		return this.c2_2002_2001;
	}

	/**
	 * Define valor do campo TABELA DE INSUMO (c2_2002_2001) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public void setC2_2002_2001(T2001 c2_2002_2001) {
		this.c2_2002_2001 = c2_2002_2001;
	}

	/**
	 * Busca valor do campo DESCRICAO DA PRACA (c3_2002) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public String getC3_2002() {
		return this.c3_2002;
	}

	/**
	 * Define valor do campo DESCRICAO DA PRACA (c3_2002) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public void setC3_2002(String c3_2002) {
		this.c3_2002 = c3_2002;
	}

	/**
	 * Busca valor do campo TIPO DO ENDERECO (RESIDENCIAL, COMERCIAL, ETC)
	 * (c4_2002_5002) da tabela INSUMO_ENDEREÇO (t2002)
	 */
	public T5002 getC4_2002_5002() {
		return this.c4_2002_5002;
	}

	/**
	 * Define valor do campo TIPO DO ENDERECO (RESIDENCIAL, COMERCIAL, ETC)
	 * (c4_2002_5002) da tabela INSUMO_ENDEREÇO (t2002)
	 */
	public void setC4_2002_5002(T5002 c4_2002_5002) {
		this.c4_2002_5002 = c4_2002_5002;
	}

	/**
	 * Busca valor do campo TABELA DE ENDERECO (c5_2002_6001) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public T6001 getC5_2002_6001() {
		return this.c5_2002_6001;
	}

	/**
	 * Define valor do campo TABELA DE ENDERECO (c5_2002_6001) da tabela
	 * INSUMO_ENDEREÇO (t2002)
	 */
	public void setC5_2002_6001(T6001 c5_2002_6001) {
		this.c5_2002_6001 = c5_2002_6001;
	}

	/**
	 * Busca valor do campo referencia PRACA (QUANDO IDENTIFICAÇÃO FOR POR
	 * ENDEREÇO (c3_2003_2002) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	public Set<T2003> getT2003C3() {
		return this.t2003C3;
	}

	/**
	 * Define valor do campo referencia PRACA (QUANDO IDENTIFICAÇÃO FOR POR
	 * ENDEREÇO (c3_2003_2002) da tabela INSUMO_DOCUMENTO (t2003)
	 */
	public void setT2003C3(Set<T2003> t2003C3) {
		this.t2003C3 = t2003C3;
	}

	@Override
	public String toString() {
		return "INSUMO_ENDEREÇO (t2002) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_2002)=" + c1_2002
				+ "\n\t\tDESCRICAO DA PRACA (c3_2002)=" + c3_2002 + "]";
	}

}
