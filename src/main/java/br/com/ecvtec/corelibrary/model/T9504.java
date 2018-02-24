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
 * Classe VIAGEM_COORDENADA.<br>
 * Representa a tabela t9504 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9504")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9504 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMARIA (c1_9504) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9504;

	/** Campo VIAGEM (c2_9504_9501) da tabela VIAGEM_COORDENADA (t9504) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9504_9501", foreignKey = @ForeignKey(name = "r2_9504_9501"))
	private T9501 c2_9504_9501;

	/** Campo TRAJETO (c3_9504_9502) da tabela VIAGEM_COORDENADA (t9504) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_9504_9502", foreignKey = @ForeignKey(name = "r3_9504_9502"))
	private T9502 c3_9504_9502;

	/** Campo HORÁRIO (c4_9504) da tabela VIAGEM_COORDENADA (t9504) */
	@NotNull
	private Date c4_9504;

	/** Campo LATITUDE (c5_9504) da tabela VIAGEM_COORDENADA (t9504) */
	@Size(max = 40, message = "LATITUDE deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c5_9504;

	/** Campo LONGITUDE (c6_9504) da tabela VIAGEM_COORDENADA (t9504) */
	@Size(max = 40, message = "LONGITUDE deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c6_9504;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9504) da tabela
	 * VIAGEM_COORDENADA (t9504)
	 */
	public int getC1_9504() {
		return this.c1_9504;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9504) da tabela
	 * VIAGEM_COORDENADA (t9504)
	 */
	public void setC1_9504(int c1_9504) {
		this.c1_9504 = c1_9504;
	}

	/**
	 * Busca valor do campo VIAGEM (c2_9504_9501) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public T9501 getC2_9504_9501() {
		return this.c2_9504_9501;
	}

	/**
	 * Define valor do campo VIAGEM (c2_9504_9501) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public void setC2_9504_9501(T9501 c2_9504_9501) {
		this.c2_9504_9501 = c2_9504_9501;
	}

	/**
	 * Busca valor do campo TRAJETO (c3_9504_9502) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public T9502 getC3_9504_9502() {
		return this.c3_9504_9502;
	}

	/**
	 * Define valor do campo TRAJETO (c3_9504_9502) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public void setC3_9504_9502(T9502 c3_9504_9502) {
		this.c3_9504_9502 = c3_9504_9502;
	}

	/**
	 * Busca valor do campo HORÁRIO (c4_9504) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public Date getC4_9504() {
		return this.c4_9504;
	}

	/**
	 * Define valor do campo HORÁRIO (c4_9504) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public void setC4_9504(Date c4_9504) {
		this.c4_9504 = c4_9504;
	}

	/**
	 * Busca valor do campo LATITUDE (c5_9504) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public String getC5_9504() {
		return this.c5_9504;
	}

	/**
	 * Define valor do campo LATITUDE (c5_9504) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public void setC5_9504(String c5_9504) {
		this.c5_9504 = c5_9504;
	}

	/**
	 * Busca valor do campo LONGITUDE (c6_9504) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public String getC6_9504() {
		return this.c6_9504;
	}

	/**
	 * Define valor do campo LONGITUDE (c6_9504) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	public void setC6_9504(String c6_9504) {
		this.c6_9504 = c6_9504;
	}

	@Override
	public String toString() {
		return "VIAGEM_COORDENADA (t9504) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_9504)=" + c1_9504
				+ "\n\t\tHORÁRIO (c4_9504)=" + c4_9504 + "\n\t\tLATITUDE (c5_9504)=" + c5_9504
				+ "\n\t\tLONGITUDE (c6_9504)=" + c6_9504 + "]";
	}

}
