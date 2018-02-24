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
 * Classe MENSAGEM.<br>
 * Representa a tabela t6501 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t6501")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T6501 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo CHAVE SEQUENCIAL PRIMARIA (c1_6501) da tabela MENSAGEM (t6501) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_6501;

	/** Campo COLIGADA (c2_6501_1001) da tabela MENSAGEM (t6501) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_6501_1001", foreignKey = @ForeignKey(name = "r2_6501_1001"))
	private T1001 c2_6501_1001;

	/** Campo REMETENTE (c3_6501_1001) da tabela MENSAGEM (t6501) */
	@ManyToOne
	@JoinColumn(name = "c3_6501_1001", foreignKey = @ForeignKey(name = "r3_6501_1001"))
	private T1001 c3_6501_1001;

	/** Campo REMETENTE_AGENDA (c4_6501_1005) da tabela MENSAGEM (t6501) */
	@ManyToOne
	@JoinColumn(name = "c4_6501_1005", foreignKey = @ForeignKey(name = "r4_6501_1005"))
	private T1005 c4_6501_1005;

	/** Campo TIPO_MENSAGEM (c5_6501_5002) da tabela MENSAGEM (t6501) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c5_6501_5002", foreignKey = @ForeignKey(name = "r5_6501_5002"))
	private T5002 c5_6501_5002;

	/** Campo HORÁRIO (c6_6501) da tabela MENSAGEM (t6501) */
	@NotNull
	private Date c6_6501;

	/** Campo TÍTULO (c7_6501) da tabela MENSAGEM (t6501) */
	@Size(max = 160, message = "TÍTULO deve possuir no máximo {max} caracteres.")
	private String c7_6501;

	/**
	 * Referencia ao campo MENSAGEM (c2_6502_6501) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	@JsonBackReference(value = "c2_6502_6501")
	@OneToMany(mappedBy = "c2_6502_6501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6502> t6502C2;

	/**
	 * Referencia ao campo MENSAGEM (c2_6508_6501) da tabela MENSAGEM_ANEXO
	 * (t6508)
	 */
	@JsonBackReference(value = "c2_6508_6501")
	@OneToMany(mappedBy = "c2_6508_6501", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6508> t6508C2;

	/**
	 * Busca valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_6501) da tabela
	 * MENSAGEM (t6501)
	 */
	public int getC1_6501() {
		return this.c1_6501;
	}

	/**
	 * Define valor do campo CHAVE SEQUENCIAL PRIMARIA (c1_6501) da tabela
	 * MENSAGEM (t6501)
	 */
	public void setC1_6501(int c1_6501) {
		this.c1_6501 = c1_6501;
	}

	/**
	 * Busca valor do campo COLIGADA (c2_6501_1001) da tabela MENSAGEM (t6501)
	 */
	public T1001 getC2_6501_1001() {
		return this.c2_6501_1001;
	}

	/**
	 * Define valor do campo COLIGADA (c2_6501_1001) da tabela MENSAGEM (t6501)
	 */
	public void setC2_6501_1001(T1001 c2_6501_1001) {
		this.c2_6501_1001 = c2_6501_1001;
	}

	/**
	 * Busca valor do campo REMETENTE (c3_6501_1001) da tabela MENSAGEM (t6501)
	 */
	public T1001 getC3_6501_1001() {
		return this.c3_6501_1001;
	}

	/**
	 * Define valor do campo REMETENTE (c3_6501_1001) da tabela MENSAGEM (t6501)
	 */
	public void setC3_6501_1001(T1001 c3_6501_1001) {
		this.c3_6501_1001 = c3_6501_1001;
	}

	/**
	 * Busca valor do campo REMETENTE_AGENDA (c4_6501_1005) da tabela MENSAGEM
	 * (t6501)
	 */
	public T1005 getC4_6501_1005() {
		return this.c4_6501_1005;
	}

	/**
	 * Define valor do campo REMETENTE_AGENDA (c4_6501_1005) da tabela MENSAGEM
	 * (t6501)
	 */
	public void setC4_6501_1005(T1005 c4_6501_1005) {
		this.c4_6501_1005 = c4_6501_1005;
	}

	/**
	 * Busca valor do campo TIPO_MENSAGEM (c5_6501_5002) da tabela MENSAGEM
	 * (t6501)
	 */
	public T5002 getC5_6501_5002() {
		return this.c5_6501_5002;
	}

	/**
	 * Define valor do campo TIPO_MENSAGEM (c5_6501_5002) da tabela MENSAGEM
	 * (t6501)
	 */
	public void setC5_6501_5002(T5002 c5_6501_5002) {
		this.c5_6501_5002 = c5_6501_5002;
	}

	/** Busca valor do campo HORÁRIO (c6_6501) da tabela MENSAGEM (t6501) */
	public Date getC6_6501() {
		return this.c6_6501;
	}

	/** Define valor do campo HORÁRIO (c6_6501) da tabela MENSAGEM (t6501) */
	public void setC6_6501(Date c6_6501) {
		this.c6_6501 = c6_6501;
	}

	/** Busca valor do campo TÍTULO (c7_6501) da tabela MENSAGEM (t6501) */
	public String getC7_6501() {
		return this.c7_6501;
	}

	/** Define valor do campo TÍTULO (c7_6501) da tabela MENSAGEM (t6501) */
	public void setC7_6501(String c7_6501) {
		this.c7_6501 = c7_6501;
	}

	/**
	 * Busca valor do campo referencia MENSAGEM (c2_6502_6501) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public Set<T6502> getT6502C2() {
		return this.t6502C2;
	}

	/**
	 * Define valor do campo referencia MENSAGEM (c2_6502_6501) da tabela
	 * MENSAGEM_DESTINATÁRIO (t6502)
	 */
	public void setT6502C2(Set<T6502> t6502C2) {
		this.t6502C2 = t6502C2;
	}

	/**
	 * Busca valor do campo referencia MENSAGEM (c2_6508_6501) da tabela
	 * MENSAGEM_ANEXO (t6508)
	 */
	public Set<T6508> getT6508C2() {
		return this.t6508C2;
	}

	/**
	 * Define valor do campo referencia MENSAGEM (c2_6508_6501) da tabela
	 * MENSAGEM_ANEXO (t6508)
	 */
	public void setT6508C2(Set<T6508> t6508C2) {
		this.t6508C2 = t6508C2;
	}

	@Override
	public String toString() {
		return "MENSAGEM (t6501) [" + "\n\t\tCHAVE SEQUENCIAL PRIMARIA (c1_6501)=" + c1_6501
				+ "\n\t\tHORÁRIO (c6_6501)=" + c6_6501 + "\n\t\tTÍTULO (c7_6501)=" + c7_6501 + "]";
	}

}
