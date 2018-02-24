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
 * Classe MÍDIA.<br>
 * Representa a tabela t5501 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t5501")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T5501 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_5501) da tabela MÍDIA (t5501) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_5501;

	/** Campo DESCRIÇÃO (c2_5501) da tabela MÍDIA (t5501) */
	@Size(max = 40, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_5501;

	/** Campo TIPO DA IMAGEM (c3_5501_5002) da tabela MÍDIA (t5501) */
	@ManyToOne
	@JoinColumn(name = "c3_5501_5002", foreignKey = @ForeignKey(name = "r3_5501_5002"))
	private T5002 c3_5501_5002;

	/** Campo IMAGEM (c4_5501) da tabela MÍDIA (t5501) */
	private String c4_5501;

	/** Campo DATA E HORA (c5_5501) da tabela MÍDIA (t5501) */
	private Date c5_5501;

	/** Campo URL (c6_5501) da tabela MÍDIA (t5501) */
	@Size(max = 160, message = "URL deve possuir no máximo {max} caracteres.")
	private String c6_5501;

	/**
	 * Referencia ao campo IMAGEM (c4_1008_5501) da tabela ENTIDADE_IMAGEM
	 * (t1008)
	 */
	@JsonBackReference(value = "c4_1008_5501")
	@OneToMany(mappedBy = "c4_1008_5501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1008> t1008C4;

	/**
	 * Referencia ao campo TABELA DE FOTOS (c4_2008_5501) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	@JsonBackReference(value = "c4_2008_5501")
	@OneToMany(mappedBy = "c4_2008_5501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2008> t2008C4;

	/**
	 * Referencia ao campo ANEXO (c4_6508_5501) da tabela MENSAGEM_ANEXO (t6508)
	 */
	@JsonBackReference(value = "c4_6508_5501")
	@OneToMany(mappedBy = "c4_6508_5501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6508> t6508C4;

	/** Referencia ao campo DADO (c3_9902_5501) da tabela LOG_ITEM (t9902) */
	@JsonBackReference(value = "c3_9902_5501")
	@OneToMany(mappedBy = "c3_9902_5501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9902> t9902C3;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_5501) da tabela MÍDIA
	 * (t5501)
	 */
	public int getC1_5501() {
		return this.c1_5501;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_5501) da tabela MÍDIA
	 * (t5501)
	 */
	public void setC1_5501(int c1_5501) {
		this.c1_5501 = c1_5501;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_5501) da tabela MÍDIA (t5501) */
	public String getC2_5501() {
		return this.c2_5501;
	}

	/** Define valor do campo DESCRIÇÃO (c2_5501) da tabela MÍDIA (t5501) */
	public void setC2_5501(String c2_5501) {
		this.c2_5501 = c2_5501;
	}

	/**
	 * Busca valor do campo TIPO DA IMAGEM (c3_5501_5002) da tabela MÍDIA
	 * (t5501)
	 */
	public T5002 getC3_5501_5002() {
		return this.c3_5501_5002;
	}

	/**
	 * Define valor do campo TIPO DA IMAGEM (c3_5501_5002) da tabela MÍDIA
	 * (t5501)
	 */
	public void setC3_5501_5002(T5002 c3_5501_5002) {
		this.c3_5501_5002 = c3_5501_5002;
	}

	/** Busca valor do campo IMAGEM (c4_5501) da tabela MÍDIA (t5501) */
	public String getC4_5501() {
		return this.c4_5501;
	}

	/** Define valor do campo IMAGEM (c4_5501) da tabela MÍDIA (t5501) */
	public void setC4_5501(String c4_5501) {
		this.c4_5501 = c4_5501;
	}

	/** Busca valor do campo DATA E HORA (c5_5501) da tabela MÍDIA (t5501) */
	public Date getC5_5501() {
		return this.c5_5501;
	}

	/** Define valor do campo DATA E HORA (c5_5501) da tabela MÍDIA (t5501) */
	public void setC5_5501(Date c5_5501) {
		this.c5_5501 = c5_5501;
	}

	/** Busca valor do campo URL (c6_5501) da tabela MÍDIA (t5501) */
	public String getC6_5501() {
		return this.c6_5501;
	}

	/** Define valor do campo URL (c6_5501) da tabela MÍDIA (t5501) */
	public void setC6_5501(String c6_5501) {
		this.c6_5501 = c6_5501;
	}

	/**
	 * Busca valor do campo referencia IMAGEM (c4_1008_5501) da tabela
	 * ENTIDADE_IMAGEM (t1008)
	 */
	public Set<T1008> getT1008C4() {
		return this.t1008C4;
	}

	/**
	 * Define valor do campo referencia IMAGEM (c4_1008_5501) da tabela
	 * ENTIDADE_IMAGEM (t1008)
	 */
	public void setT1008C4(Set<T1008> t1008C4) {
		this.t1008C4 = t1008C4;
	}

	/**
	 * Busca valor do campo referencia TABELA DE FOTOS (c4_2008_5501) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public Set<T2008> getT2008C4() {
		return this.t2008C4;
	}

	/**
	 * Define valor do campo referencia TABELA DE FOTOS (c4_2008_5501) da tabela
	 * INSUMO_IMAGEM (t2008)
	 */
	public void setT2008C4(Set<T2008> t2008C4) {
		this.t2008C4 = t2008C4;
	}

	/**
	 * Busca valor do campo referencia ANEXO (c4_6508_5501) da tabela
	 * MENSAGEM_ANEXO (t6508)
	 */
	public Set<T6508> getT6508C4() {
		return this.t6508C4;
	}

	/**
	 * Define valor do campo referencia ANEXO (c4_6508_5501) da tabela
	 * MENSAGEM_ANEXO (t6508)
	 */
	public void setT6508C4(Set<T6508> t6508C4) {
		this.t6508C4 = t6508C4;
	}

	/**
	 * Busca valor do campo referencia DADO (c3_9902_5501) da tabela LOG_ITEM
	 * (t9902)
	 */
	public Set<T9902> getT9902C3() {
		return this.t9902C3;
	}

	/**
	 * Define valor do campo referencia DADO (c3_9902_5501) da tabela LOG_ITEM
	 * (t9902)
	 */
	public void setT9902C3(Set<T9902> t9902C3) {
		this.t9902C3 = t9902C3;
	}

	@Override
	public String toString() {
		return "MÍDIA (t5501) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_5501)=" + c1_5501 + "\n\t\tDESCRIÇÃO (c2_5501)="
				+ c2_5501 + "\n\t\tIMAGEM (c4_5501)=" + c4_5501 + "\n\t\tDATA E HORA (c5_5501)=" + c5_5501
				+ "\n\t\tURL (c6_5501)=" + c6_5501 + "]";
	}

}
