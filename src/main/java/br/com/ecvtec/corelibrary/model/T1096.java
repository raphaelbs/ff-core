package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.sql.Date;

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
 * Classe ENTIDADE_COORDENADA.<br>
 * Representa a tabela t1096 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1096")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1096 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMARIA (c1_1096) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1096;

	/** Campo ENTIDADE (c2_1096_1001) da tabela ENTIDADE_COORDENADA (t1096) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_1096_1001", foreignKey = @ForeignKey(name = "r2_1096_1001"))
	private T1001 c2_1096_1001;

	/** Campo STATUS (c3_1096_5002) da tabela ENTIDADE_COORDENADA (t1096) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_1096_5002", foreignKey = @ForeignKey(name = "r3_1096_5002"))
	private T5002 c3_1096_5002;

	/** Campo HORÁRIO (c4_1096) da tabela ENTIDADE_COORDENADA (t1096) */
	@NotNull
	private Date c4_1096;

	/**
	 * Campo TIPO COORDENADA (c5_1096_5002) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c5_1096_5002", foreignKey = @ForeignKey(name = "r5_1096_5002"))
	private T5002 c5_1096_5002;

	/** Campo LATITUDE (c6_1096) da tabela ENTIDADE_COORDENADA (t1096) */
	@Size(max = 40, message = "LATITUDE deve possuir no máximo {max} caracteres.")
	private String c6_1096;

	/** Campo LONGITUDE (c7_1096) da tabela ENTIDADE_COORDENADA (t1096) */
	@Size(max = 40, message = "LONGITUDE deve possuir no máximo {max} caracteres.")
	private String c7_1096;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_1096) da tabela
	 * ENTIDADE_COORDENADA (t1096)
	 */
	public int getC1_1096() {
		return this.c1_1096;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_1096) da tabela
	 * ENTIDADE_COORDENADA (t1096)
	 */
	public void setC1_1096(int c1_1096) {
		this.c1_1096 = c1_1096;
	}

	/**
	 * Busca valor do campo ENTIDADE (c2_1096_1001) da tabela
	 * ENTIDADE_COORDENADA (t1096)
	 */
	public T1001 getC2_1096_1001() {
		return this.c2_1096_1001;
	}

	/**
	 * Define valor do campo ENTIDADE (c2_1096_1001) da tabela
	 * ENTIDADE_COORDENADA (t1096)
	 */
	public void setC2_1096_1001(T1001 c2_1096_1001) {
		this.c2_1096_1001 = c2_1096_1001;
	}

	/**
	 * Busca valor do campo STATUS (c3_1096_5002) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	public T5002 getC3_1096_5002() {
		return this.c3_1096_5002;
	}

	/**
	 * Define valor do campo STATUS (c3_1096_5002) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	public void setC3_1096_5002(T5002 c3_1096_5002) {
		this.c3_1096_5002 = c3_1096_5002;
	}

	/**
	 * Busca valor do campo HORÁRIO (c4_1096) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	public Date getC4_1096() {
		return this.c4_1096;
	}

	/**
	 * Define valor do campo HORÁRIO (c4_1096) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	public void setC4_1096(Date c4_1096) {
		this.c4_1096 = c4_1096;
	}

	/**
	 * Busca valor do campo TIPO COORDENADA (c5_1096_5002) da tabela
	 * ENTIDADE_COORDENADA (t1096)
	 */
	public T5002 getC5_1096_5002() {
		return this.c5_1096_5002;
	}

	/**
	 * Define valor do campo TIPO COORDENADA (c5_1096_5002) da tabela
	 * ENTIDADE_COORDENADA (t1096)
	 */
	public void setC5_1096_5002(T5002 c5_1096_5002) {
		this.c5_1096_5002 = c5_1096_5002;
	}

	/**
	 * Busca valor do campo LATITUDE (c6_1096) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	public String getC6_1096() {
		return this.c6_1096;
	}

	/**
	 * Define valor do campo LATITUDE (c6_1096) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	public void setC6_1096(String c6_1096) {
		this.c6_1096 = c6_1096;
	}

	/**
	 * Busca valor do campo LONGITUDE (c7_1096) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	public String getC7_1096() {
		return this.c7_1096;
	}

	/**
	 * Define valor do campo LONGITUDE (c7_1096) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	public void setC7_1096(String c7_1096) {
		this.c7_1096 = c7_1096;
	}

	@Override
	public String toString() {
		return "ENTIDADE_COORDENADA (t1096) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_1096)=" + c1_1096
				+ "\n\t\tHORÁRIO (c4_1096)=" + c4_1096 + "\n\t\tLATITUDE (c6_1096)=" + c6_1096
				+ "\n\t\tLONGITUDE (c7_1096)=" + c7_1096 + "]";
	}

}
