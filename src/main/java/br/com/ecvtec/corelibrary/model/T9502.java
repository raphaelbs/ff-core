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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Classe VIAGEM_TRAJETO.<br>
 * Representa a tabela t9502 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t9502")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T9502 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo CHAVE SEQUENCIAL PRIMARIA (c1_9502) da tabela VIAGEM_TRAJETO
	 * (t9502)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_9502;

	/** Campo VIAGEM (c2_9502_9501) da tabela VIAGEM_TRAJETO (t9502) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_9502_9501", foreignKey = @ForeignKey(name = "r2_9502_9501"))
	private T9501 c2_9502_9501;

	/** Campo CIDADE ORIGEM (c3_9502_6201) da tabela VIAGEM_TRAJETO (t9502) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_9502_6201", foreignKey = @ForeignKey(name = "r3_9502_6201"))
	private T6201 c3_9502_6201;

	/** Campo CIDADE DESTINO (c4_9502_6201) da tabela VIAGEM_TRAJETO (t9502) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_9502_6201", foreignKey = @ForeignKey(name = "r4_9502_6201"))
	private T6201 c4_9502_6201;

	/** Campo ORDENAÇÃO (c5_9502) da tabela VIAGEM_TRAJETO (t9502) */
	@NotNull
	private int c5_9502;

	/**
	 * Referencia ao campo TRAJETO (c4_9503_9502) da tabela VIAGEM_CARGA (t9503)
	 */
	@JsonBackReference(value = "c4_9503_9502")
	@OneToMany(mappedBy = "c4_9503_9502", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9503> t9503C4;

	/**
	 * Referencia ao campo TRAJETO (c3_9504_9502) da tabela VIAGEM_COORDENADA
	 * (t9504)
	 */
	@JsonBackReference(value = "c3_9504_9502")
	@OneToMany(mappedBy = "c3_9504_9502", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9504> t9504C3;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9502) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public int getC1_9502() {
		return this.c1_9502;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_9502) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public void setC1_9502(int c1_9502) {
		this.c1_9502 = c1_9502;
	}

	/**
	 * Busca valor do campo VIAGEM (c2_9502_9501) da tabela VIAGEM_TRAJETO
	 * (t9502)
	 */
	public T9501 getC2_9502_9501() {
		return this.c2_9502_9501;
	}

	/**
	 * Define valor do campo VIAGEM (c2_9502_9501) da tabela VIAGEM_TRAJETO
	 * (t9502)
	 */
	public void setC2_9502_9501(T9501 c2_9502_9501) {
		this.c2_9502_9501 = c2_9502_9501;
	}

	/**
	 * Busca valor do campo CIDADE ORIGEM (c3_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public T6201 getC3_9502_6201() {
		return this.c3_9502_6201;
	}

	/**
	 * Define valor do campo CIDADE ORIGEM (c3_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public void setC3_9502_6201(T6201 c3_9502_6201) {
		this.c3_9502_6201 = c3_9502_6201;
	}

	/**
	 * Busca valor do campo CIDADE DESTINO (c4_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public T6201 getC4_9502_6201() {
		return this.c4_9502_6201;
	}

	/**
	 * Define valor do campo CIDADE DESTINO (c4_9502_6201) da tabela
	 * VIAGEM_TRAJETO (t9502)
	 */
	public void setC4_9502_6201(T6201 c4_9502_6201) {
		this.c4_9502_6201 = c4_9502_6201;
	}

	/**
	 * Busca valor do campo ORDENAÇÃO (c5_9502) da tabela VIAGEM_TRAJETO (t9502)
	 */
	public int getC5_9502() {
		return this.c5_9502;
	}

	/**
	 * Define valor do campo ORDENAÇÃO (c5_9502) da tabela VIAGEM_TRAJETO
	 * (t9502)
	 */
	public void setC5_9502(int c5_9502) {
		this.c5_9502 = c5_9502;
	}

	/**
	 * Busca valor do campo referencia TRAJETO (c4_9503_9502) da tabela
	 * VIAGEM_CARGA (t9503)
	 */
	public Set<T9503> getT9503C4() {
		return this.t9503C4;
	}

	/**
	 * Define valor do campo referencia TRAJETO (c4_9503_9502) da tabela
	 * VIAGEM_CARGA (t9503)
	 */
	public void setT9503C4(Set<T9503> t9503C4) {
		this.t9503C4 = t9503C4;
	}

	/**
	 * Busca valor do campo referencia TRAJETO (c3_9504_9502) da tabela
	 * VIAGEM_COORDENADA (t9504)
	 */
	public Set<T9504> getT9504C3() {
		return this.t9504C3;
	}

	/**
	 * Define valor do campo referencia TRAJETO (c3_9504_9502) da tabela
	 * VIAGEM_COORDENADA (t9504)
	 */
	public void setT9504C3(Set<T9504> t9504C3) {
		this.t9504C3 = t9504C3;
	}

	@Override
	public String toString() {
		return "VIAGEM_TRAJETO (t9502) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_9502)=" + c1_9502
				+ "\n\t\tORDENAÇÃO (c5_9502)=" + c5_9502 + "]";
	}

}
