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
 * Classe ENTIDADE_RELACIONAMENTO.<br>
 * Representa a tabela t1007 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1007")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1007 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_1007) da tabela ENTIDADE_RELACIONAMENTO
	 * (t1007)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1007;

	/** Campo PESSOA (c2_1007_1001) da tabela ENTIDADE_RELACIONAMENTO (t1007) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_1007_1001", foreignKey = @ForeignKey(name = "r2_1007_1001"))
	@JsonBackReference("c2_1007_1001")
	private T1001 c2_1007_1001;

	/**
	 * Campo TIPO DE ENTIDADE (c3_1007_5002) da tabela ENTIDADE_RELACIONAMENTO
	 * (t1007)
	 */
	@ManyToOne
	@JoinColumn(name = "c3_1007_5002", foreignKey = @ForeignKey(name = "r3_1007_5002"))
	private T5002 c3_1007_5002;

	/**
	 * Campo PESSOA RELACIONADA (c4_1007_1001) da tabela ENTIDADE_RELACIONAMENTO
	 * (t1007)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_1007_1001", foreignKey = @ForeignKey(name = "r4_1007_1001"))
	@JsonBackReference("c4_1007_1001")
	private T1001 c4_1007_1001;

	/** Campo STATUS (c5_1007_5002) da tabela ENTIDADE_RELACIONAMENTO (t1007) */
	@ManyToOne
	@JoinColumn(name = "c5_1007_5002", foreignKey = @ForeignKey(name = "r5_1007_5002"))
	private T5002 c5_1007_5002;

	/**
	 * Referencia ao campo ENTIDADE RELACIONAMENTO (c3_1099_1007) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	@JsonBackReference(value = "c3_1099_1007")
	@OneToMany(mappedBy = "c3_1099_1007", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1099> t1099C3;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1007) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public int getC1_1007() {
		return this.c1_1007;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1007) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public void setC1_1007(int c1_1007) {
		this.c1_1007 = c1_1007;
	}

	/**
	 * Busca valor do campo PESSOA (c2_1007_1001) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public T1001 getC2_1007_1001() {
		return this.c2_1007_1001;
	}

	/**
	 * Define valor do campo PESSOA (c2_1007_1001) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public void setC2_1007_1001(T1001 c2_1007_1001) {
		this.c2_1007_1001 = c2_1007_1001;
	}

	/**
	 * Busca valor do campo TIPO DE ENTIDADE (c3_1007_5002) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public T5002 getC3_1007_5002() {
		return this.c3_1007_5002;
	}

	/**
	 * Define valor do campo TIPO DE ENTIDADE (c3_1007_5002) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public void setC3_1007_5002(T5002 c3_1007_5002) {
		this.c3_1007_5002 = c3_1007_5002;
	}

	/**
	 * Busca valor do campo PESSOA RELACIONADA (c4_1007_1001) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public T1001 getC4_1007_1001() {
		return this.c4_1007_1001;
	}

	/**
	 * Define valor do campo PESSOA RELACIONADA (c4_1007_1001) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public void setC4_1007_1001(T1001 c4_1007_1001) {
		this.c4_1007_1001 = c4_1007_1001;
	}

	/**
	 * Busca valor do campo STATUS (c5_1007_5002) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public T5002 getC5_1007_5002() {
		return this.c5_1007_5002;
	}

	/**
	 * Define valor do campo STATUS (c5_1007_5002) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public void setC5_1007_5002(T5002 c5_1007_5002) {
		this.c5_1007_5002 = c5_1007_5002;
	}

	/**
	 * Busca valor do campo referencia ENTIDADE RELACIONAMENTO (c3_1099_1007) da
	 * tabela ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public Set<T1099> getT1099C3() {
		return this.t1099C3;
	}

	/**
	 * Define valor do campo referencia ENTIDADE RELACIONAMENTO (c3_1099_1007)
	 * da tabela ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public void setT1099C3(Set<T1099> t1099C3) {
		this.t1099C3 = t1099C3;
	}

	@Override
	public String toString() {
		return "ENTIDADE_RELACIONAMENTO (t1007) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1007)=" + c1_1007 + "]";
	}

}
