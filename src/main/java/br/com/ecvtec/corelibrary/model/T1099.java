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
 * Classe ENTIDADE_USUARIO_PERFIL.<br>
 * Representa a tabela t1099 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1099")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1099 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Campo ID - CHAVE SEQUENCIAL (c1_1099) da tabela ENTIDADE_USUARIO_PERFIL
	 * (t1099)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1099;

	/** Campo PESSOA (c2_1099_1001) da tabela ENTIDADE_USUARIO_PERFIL (t1099) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c2_1099_1001", foreignKey = @ForeignKey(name = "r2_1099_1001"))
	private T1001 c2_1099_1001;

	/**
	 * Campo ENTIDADE RELACIONAMENTO (c3_1099_1007) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c3_1099_1007", foreignKey = @ForeignKey(name = "r3_1099_1007"))
	private T1007 c3_1099_1007;

	/** Campo PERFIL (c4_1099_9803) da tabela ENTIDADE_USUARIO_PERFIL (t1099) */
	@NotNull
	@ManyToOne
	@JoinColumn(name = "c4_1099_9803", foreignKey = @ForeignKey(name = "r4_1099_9803"))
	private T9803 c4_1099_9803;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1099) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public int getC1_1099() {
		return this.c1_1099;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1099) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public void setC1_1099(int c1_1099) {
		this.c1_1099 = c1_1099;
	}

	/**
	 * Busca valor do campo PESSOA (c2_1099_1001) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public T1001 getC2_1099_1001() {
		return this.c2_1099_1001;
	}

	/**
	 * Define valor do campo PESSOA (c2_1099_1001) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public void setC2_1099_1001(T1001 c2_1099_1001) {
		this.c2_1099_1001 = c2_1099_1001;
	}

	/**
	 * Busca valor do campo ENTIDADE RELACIONAMENTO (c3_1099_1007) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public T1007 getC3_1099_1007() {
		return this.c3_1099_1007;
	}

	/**
	 * Define valor do campo ENTIDADE RELACIONAMENTO (c3_1099_1007) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public void setC3_1099_1007(T1007 c3_1099_1007) {
		this.c3_1099_1007 = c3_1099_1007;
	}

	/**
	 * Busca valor do campo PERFIL (c4_1099_9803) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public T9803 getC4_1099_9803() {
		return this.c4_1099_9803;
	}

	/**
	 * Define valor do campo PERFIL (c4_1099_9803) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public void setC4_1099_9803(T9803 c4_1099_9803) {
		this.c4_1099_9803 = c4_1099_9803;
	}

	@Override
	public String toString() {
		return "ENTIDADE_USUARIO_PERFIL (t1099) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1099)=" + c1_1099 + "]";
	}

}
