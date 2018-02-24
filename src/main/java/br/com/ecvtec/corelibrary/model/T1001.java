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
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.ecvtec.corelibrary.jackson.SerializadorT1003;
import br.com.ecvtec.corelibrary.jackson.SerializadorT1004;
import br.com.ecvtec.corelibrary.jackson.SerializadorT1005;

/**
 * Classe ENTIDADE.<br>
 * Representa a tabela t1001 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * 
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */
@Entity
@Table(name = "t1001")
@JsonAutoDetect(getterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T1001 implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_1001) da tabela ENTIDADE (t1001) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_1001;

	/** Campo DESCRIÇÃO (c2_1001) da tabela ENTIDADE (t1001) */
	@Size(max = 160, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	private String c2_1001;

	/** Campo NOME FANTASIA OU APELIDO (c3_1001) da tabela ENTIDADE (t1001) */
	@Size(max = 40, message = "NOME FANTASIA OU APELIDO deve possuir no máximo {max} caracteres.")
	private String c3_1001;

	/**
	 * Campo TIPO DE PESSOA (FÍSICA OU JURÍDICA) (c4_1001_5002) da tabela
	 * ENTIDADE (t1001)
	 */
	@ManyToOne
	@JoinColumn(name = "c4_1001_5002", foreignKey = @ForeignKey(name = "r4_1001_5002"))
	private T5002 c4_1001_5002;

	/**
	 * Referencia ao campo PESSOA (c2_1002_1001) da tabela ENTIDADE_ENDEREÇO
	 * (t1002)
	 */
	@OneToMany(mappedBy = "c2_1002_1001", cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER, orphanRemoval=true)
	@JsonManagedReference("c2_1002_1001")
	private Set<T1002> t1002C2;

	/**
	 * Referencia ao campo PESSOA (c2_1003_1001) da tabela ENTIDADE_DOCUMENTO
	 * (t1003)
	 */
	@OneToMany(mappedBy = "c2_1003_1001", cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER, orphanRemoval=true)
	@JsonSerialize(using=SerializadorT1003.class)
	private Set<T1003> t1003C2;

	/**
	 * Referencia ao campo ORGÃO EMISSOR (c6_1003_1001) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	@OneToMany(mappedBy = "c6_1003_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference("c2_1003_1001")
	private Set<T1003> t1003C6;

	/**
	 * Referencia ao campo TABELA (c2_1004_1001) da tabela ENTIDADE_CONTATO
	 * (t1004)
	 */
	@OneToMany(mappedBy = "c2_1004_1001", cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER, orphanRemoval=true)
	@JsonSerialize(using=SerializadorT1004.class)
	private Set<T1004> t1004C2;

	/**
	 * Referencia ao campo TABELA (c2_1005_1001) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	@OneToMany(mappedBy = "c2_1005_1001", cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER, orphanRemoval=true)
	@JsonSerialize(using=SerializadorT1005.class)
	private Set<T1005> t1005C2;

	/**
	 * Referencia ao campo OPERADORA (c6_1005_1001) da tabela ENTIDADE_AGENDA
	 * (t1005)
	 */
	@JsonBackReference("c2_1005_1001")
	@OneToMany(mappedBy = "c6_1005_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1005> t1005C6;

	/**
	 * Referencia ao campo PESSOA (c2_1006_1001) da tabela ENTIDADE_DETALHE
	 * (t1006)
	 */
	@OneToMany(mappedBy = "c2_1006_1001", cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER, orphanRemoval=true)
	@JsonManagedReference("c2_1006_1001")
	private Set<T1006> t1006C2;

	/**
	 * Referencia ao campo PESSOA (c2_1007_1001) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	@OneToMany(mappedBy = "c2_1007_1001", cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER, orphanRemoval=true)
	@JsonManagedReference("c2_1007_1001")
	private Set<T1007> t1007C2;

	/**
	 * Referencia ao campo PESSOA RELACIONADA (c4_1007_1001) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	@JsonBackReference("c4_1007_1001")
	@OneToMany(mappedBy = "c4_1007_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1007> t1007C4;

	/**
	 * Referencia ao campo PESSOA (c2_1008_1001) da tabela ENTIDADE_IMAGEM
	 * (t1008)
	 */
	@OneToMany(mappedBy = "c2_1008_1001", cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER, orphanRemoval=true)
	@JsonManagedReference("c2_1008_1001")
	private Set<T1008> t1008C2;

	/**
	 * Referencia ao campo ENTIDADE (c2_1095_1001) da tabela ENTIDADE_CIDADE
	 * (t1095)
	 */
	@JsonBackReference("c2_1095_1001")
	@OneToMany(mappedBy = "c2_1095_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1095> t1095C2;

	/**
	 * Referencia ao campo ENTIDADE (c2_1096_1001) da tabela ENTIDADE_COORDENADA
	 * (t1096)
	 */
	@JsonBackReference(value = "c2_1096_1001")
	@OneToMany(mappedBy = "c2_1096_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1096> t1096C2;

	/**
	 * Referencia ao campo PESSOA (c2_1099_1001) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	@JsonBackReference(value = "c2_1099_1001")
	@OneToMany(mappedBy = "c2_1099_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T1099> t1099C2;

	/**
	 * Referencia ao campo ÓRGÃO EMISSOR (c6_2003_1001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	@JsonBackReference(value = "c6_2003_1001")
	@OneToMany(mappedBy = "c6_2003_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2003> t2003C6;

	/**
	 * Referencia ao campo INSTITUIÇÃO FINANCEIRA (c3_2501_1001) da tabela CONTA
	 * (t2501)
	 */
	@JsonBackReference(value = "c3_2501_1001")
	@OneToMany(mappedBy = "c3_2501_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2501> t2501C3;

	/**
	 * Referencia ao campo CORRENTISTA (c4_2507_1001) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	@JsonBackReference(value = "c4_2507_1001")
	@OneToMany(mappedBy = "c4_2507_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T2507> t2507C4;

	/** Referencia ao campo COLIGADA (c2_3001_1001) da tabela RECEITA (t3001) */
	@JsonBackReference(value = "c2_3001_1001")
	@OneToMany(mappedBy = "c2_3001_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3001> t3001C2;

	/** Referencia ao campo CLIENTE (c8_3001_1001) da tabela RECEITA (t3001) */
	@JsonBackReference(value = "c8_3001_1001")
	@OneToMany(mappedBy = "c8_3001_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T3001> t3001C8;

	/**
	 * Referencia ao campo COLIGADA (c2_6501_1001) da tabela MENSAGEM (t6501)
	 */
	@JsonBackReference(value = "c2_6501_1001")
	@OneToMany(mappedBy = "c2_6501_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6501> t6501C2;

	/**
	 * Referencia ao campo REMETENTE (c3_6501_1001) da tabela MENSAGEM (t6501)
	 */
	@JsonBackReference(value = "c3_6501_1001")
	@OneToMany(mappedBy = "c3_6501_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T6501> t6501C3;

	/**
	 * Referencia ao campo COLIGADA (c2_7001_1001) da tabela HISTÓRICO_FUNCIONA
	 * L (t7001)
	 */
	@JsonBackReference(value = "c2_7001_1001")
	@OneToMany(mappedBy = "c2_7001_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T7001> t7001C2;

	/**
	 * Referencia ao campo FUNCIONÁRIO (c3_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	@JsonBackReference(value = "c3_7001_1001")
	@OneToMany(mappedBy = "c3_7001_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T7001> t7001C3;

	/**
	 * Referencia ao campo SINDICATO (c6_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	@JsonBackReference(value = "c6_7001_1001")
	@OneToMany(mappedBy = "c6_7001_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T7001> t7001C6;

	/**
	 * Referencia ao campo PROCEDIMENTO (c2_8906_1001) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	@JsonBackReference(value = "c2_8906_1001")
	@OneToMany(mappedBy = "c2_8906_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T8906> t8906C2;

	/** Referencia ao campo COLIGADA (c2_9401_1001) da tabela CARGA (t9401) */
	@JsonBackReference(value = "c2_9401_1001")
	@OneToMany(mappedBy = "c2_9401_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9401> t9401C2;

	/** Referencia ao campo REMETENTE (c4_9401_1001) da tabela CARGA (t9401) */
	@JsonBackReference(value = "c4_9401_1001")
	@OneToMany(mappedBy = "c4_9401_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9401> t9401C4;

	/**
	 * Referencia ao campo DESTINATÁRIO (c8_9401_1001) da tabela CARGA (t9401)
	 */
	@JsonBackReference(value = "c8_9401_1001")
	@OneToMany(mappedBy = "c8_9401_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9401> t9401C8;

	/** Referencia ao campo COLIGADA (c2_9501_1001) da tabela VIAGEM (t9501) */
	@JsonBackReference(value = "c2_9501_1001")
	@OneToMany(mappedBy = "c2_9501_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9501> t9501C2;

	/**
	 * Referencia ao campo CONTRATADO (c9_9501_1001) da tabela VIAGEM (t9501)
	 */
	@JsonBackReference(value = "c9_9501_1001")
	@OneToMany(mappedBy = "c9_9501_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9501> t9501C9;

	/** Referencia ao campo USUÁRIO (c5_9901_1001) da tabela LOG (t9901) */
	@JsonBackReference(value = "c5_9901_1001")
	@OneToMany(mappedBy = "c5_9901_1001", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<T9901> t9901C5;

	/**
	 * Busca valor do campo ID - CHAVE SEQUENCIAL (c1_1001) da tabela ENTIDADE
	 * (t1001)
	 */
	public int getC1_1001() {
		return this.c1_1001;
	}

	/**
	 * Define valor do campo ID - CHAVE SEQUENCIAL (c1_1001) da tabela ENTIDADE
	 * (t1001)
	 */
	public void setC1_1001(int c1_1001) {
		this.c1_1001 = c1_1001;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_1001) da tabela ENTIDADE (t1001) */
	public String getC2_1001() {
		return this.c2_1001;
	}

	/** Define valor do campo DESCRIÇÃO (c2_1001) da tabela ENTIDADE (t1001) */
	public void setC2_1001(String c2_1001) {
		this.c2_1001 = c2_1001;
	}

	/**
	 * Busca valor do campo NOME FANTASIA OU APELIDO (c3_1001) da tabela
	 * ENTIDADE (t1001)
	 */
	public String getC3_1001() {
		return this.c3_1001;
	}

	/**
	 * Define valor do campo NOME FANTASIA OU APELIDO (c3_1001) da tabela
	 * ENTIDADE (t1001)
	 */
	public void setC3_1001(String c3_1001) {
		this.c3_1001 = c3_1001;
	}

	/**
	 * Busca valor do campo TIPO DE PESSOA (FÍSICA OU JURÍDICA) (c4_1001_5002)
	 * da tabela ENTIDADE (t1001)
	 */
	public T5002 getC4_1001_5002() {
		return this.c4_1001_5002;
	}

	/**
	 * Define valor do campo TIPO DE PESSOA (FÍSICA OU JURÍDICA) (c4_1001_5002)
	 * da tabela ENTIDADE (t1001)
	 */
	public void setC4_1001_5002(T5002 c4_1001_5002) {
		this.c4_1001_5002 = c4_1001_5002;
	}

	/**
	 * Busca valor do campo referencia PESSOA (c2_1002_1001) da tabela
	 * ENTIDADE_ENDEREÇO (t1002)
	 */
	public Set<T1002> getT1002C2() {
		return this.t1002C2;
	}

	/**
	 * Define valor do campo referencia PESSOA (c2_1002_1001) da tabela
	 * ENTIDADE_ENDEREÇO (t1002)
	 */
	public void setT1002C2(Set<T1002> t1002C2) {
		this.t1002C2 = t1002C2;
	}

	/**
	 * Busca valor do campo referencia PESSOA (c2_1003_1001) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public Set<T1003> getT1003C2() {
		return this.t1003C2;
	}

	/**
	 * Define valor do campo referencia PESSOA (c2_1003_1001) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setT1003C2(Set<T1003> t1003C2) {
		this.t1003C2 = t1003C2;
	}

	/**
	 * Busca valor do campo referencia ORGÃO EMISSOR (c6_1003_1001) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public Set<T1003> getT1003C6() {
		return this.t1003C6;
	}

	/**
	 * Define valor do campo referencia ORGÃO EMISSOR (c6_1003_1001) da tabela
	 * ENTIDADE_DOCUMENTO (t1003)
	 */
	public void setT1003C6(Set<T1003> t1003C6) {
		this.t1003C6 = t1003C6;
	}

	/**
	 * Busca valor do campo referencia TABELA (c2_1004_1001) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public Set<T1004> getT1004C2() {
		return this.t1004C2;
	}

	/**
	 * Define valor do campo referencia TABELA (c2_1004_1001) da tabela
	 * ENTIDADE_CONTATO (t1004)
	 */
	public void setT1004C2(Set<T1004> t1004C2) {
		this.t1004C2 = t1004C2;
	}

	/**
	 * Busca valor do campo referencia TABELA (c2_1005_1001) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public Set<T1005> getT1005C2() {
		return this.t1005C2;
	}

	/**
	 * Define valor do campo referencia TABELA (c2_1005_1001) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public void setT1005C2(Set<T1005> t1005C2) {
		this.t1005C2 = t1005C2;
	}

	/**
	 * Busca valor do campo referencia OPERADORA (c6_1005_1001) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public Set<T1005> getT1005C6() {
		return this.t1005C6;
	}

	/**
	 * Define valor do campo referencia OPERADORA (c6_1005_1001) da tabela
	 * ENTIDADE_AGENDA (t1005)
	 */
	public void setT1005C6(Set<T1005> t1005C6) {
		this.t1005C6 = t1005C6;
	}

	/**
	 * Busca valor do campo referencia PESSOA (c2_1006_1001) da tabela
	 * ENTIDADE_DETALHE (t1006)
	 */
	public Set<T1006> getT1006C2() {
		return this.t1006C2;
	}

	/**
	 * Define valor do campo referencia PESSOA (c2_1006_1001) da tabela
	 * ENTIDADE_DETALHE (t1006)
	 */
	public void setT1006C2(Set<T1006> t1006C2) {
		this.t1006C2 = t1006C2;
	}

	/**
	 * Busca valor do campo referencia PESSOA (c2_1007_1001) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public Set<T1007> getT1007C2() {
		return this.t1007C2;
	}

	/**
	 * Define valor do campo referencia PESSOA (c2_1007_1001) da tabela
	 * ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public void setT1007C2(Set<T1007> t1007C2) {
		this.t1007C2 = t1007C2;
	}

	/**
	 * Busca valor do campo referencia PESSOA RELACIONADA (c4_1007_1001) da
	 * tabela ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public Set<T1007> getT1007C4() {
		return this.t1007C4;
	}

	/**
	 * Define valor do campo referencia PESSOA RELACIONADA (c4_1007_1001) da
	 * tabela ENTIDADE_RELACIONAMENTO (t1007)
	 */
	public void setT1007C4(Set<T1007> t1007C4) {
		this.t1007C4 = t1007C4;
	}

	/**
	 * Busca valor do campo referencia PESSOA (c2_1008_1001) da tabela
	 * ENTIDADE_IMAGEM (t1008)
	 */
	public Set<T1008> getT1008C2() {
		return this.t1008C2;
	}

	/**
	 * Define valor do campo referencia PESSOA (c2_1008_1001) da tabela
	 * ENTIDADE_IMAGEM (t1008)
	 */
	public void setT1008C2(Set<T1008> t1008C2) {
		this.t1008C2 = t1008C2;
	}

	/**
	 * Busca valor do campo referencia ENTIDADE (c2_1095_1001) da tabela
	 * ENTIDADE_CIDADE (t1095)
	 */
	public Set<T1095> getT1095C2() {
		return this.t1095C2;
	}

	/**
	 * Define valor do campo referencia ENTIDADE (c2_1095_1001) da tabela
	 * ENTIDADE_CIDADE (t1095)
	 */
	public void setT1095C2(Set<T1095> t1095C2) {
		this.t1095C2 = t1095C2;
	}

	/**
	 * Busca valor do campo referencia ENTIDADE (c2_1096_1001) da tabela
	 * ENTIDADE_COORDENADA (t1096)
	 */
	public Set<T1096> getT1096C2() {
		return this.t1096C2;
	}

	/**
	 * Define valor do campo referencia ENTIDADE (c2_1096_1001) da tabela
	 * ENTIDADE_COORDENADA (t1096)
	 */
	public void setT1096C2(Set<T1096> t1096C2) {
		this.t1096C2 = t1096C2;
	}

	/**
	 * Busca valor do campo referencia PESSOA (c2_1099_1001) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public Set<T1099> getT1099C2() {
		return this.t1099C2;
	}

	/**
	 * Define valor do campo referencia PESSOA (c2_1099_1001) da tabela
	 * ENTIDADE_USUARIO_PERFIL (t1099)
	 */
	public void setT1099C2(Set<T1099> t1099C2) {
		this.t1099C2 = t1099C2;
	}

	/**
	 * Busca valor do campo referencia ÓRGÃO EMISSOR (c6_2003_1001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public Set<T2003> getT2003C6() {
		return this.t2003C6;
	}

	/**
	 * Define valor do campo referencia ÓRGÃO EMISSOR (c6_2003_1001) da tabela
	 * INSUMO_DOCUMENTO (t2003)
	 */
	public void setT2003C6(Set<T2003> t2003C6) {
		this.t2003C6 = t2003C6;
	}

	/**
	 * Busca valor do campo referencia INSTITUIÇÃO FINANCEIRA (c3_2501_1001) da
	 * tabela CONTA (t2501)
	 */
	public Set<T2501> getT2501C3() {
		return this.t2501C3;
	}

	/**
	 * Define valor do campo referencia INSTITUIÇÃO FINANCEIRA (c3_2501_1001) da
	 * tabela CONTA (t2501)
	 */
	public void setT2501C3(Set<T2501> t2501C3) {
		this.t2501C3 = t2501C3;
	}

	/**
	 * Busca valor do campo referencia CORRENTISTA (c4_2507_1001) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public Set<T2507> getT2507C4() {
		return this.t2507C4;
	}

	/**
	 * Define valor do campo referencia CORRENTISTA (c4_2507_1001) da tabela
	 * CONTA_CORRENTISTA (t2507)
	 */
	public void setT2507C4(Set<T2507> t2507C4) {
		this.t2507C4 = t2507C4;
	}

	/**
	 * Busca valor do campo referencia COLIGADA (c2_3001_1001) da tabela RECEITA
	 * (t3001)
	 */
	public Set<T3001> getT3001C2() {
		return this.t3001C2;
	}

	/**
	 * Define valor do campo referencia COLIGADA (c2_3001_1001) da tabela
	 * RECEITA (t3001)
	 */
	public void setT3001C2(Set<T3001> t3001C2) {
		this.t3001C2 = t3001C2;
	}

	/**
	 * Busca valor do campo referencia CLIENTE (c8_3001_1001) da tabela RECEITA
	 * (t3001)
	 */
	public Set<T3001> getT3001C8() {
		return this.t3001C8;
	}

	/**
	 * Define valor do campo referencia CLIENTE (c8_3001_1001) da tabela RECEITA
	 * (t3001)
	 */
	public void setT3001C8(Set<T3001> t3001C8) {
		this.t3001C8 = t3001C8;
	}

	/**
	 * Busca valor do campo referencia COLIGADA (c2_6501_1001) da tabela
	 * MENSAGEM (t6501)
	 */
	public Set<T6501> getT6501C2() {
		return this.t6501C2;
	}

	/**
	 * Define valor do campo referencia COLIGADA (c2_6501_1001) da tabela
	 * MENSAGEM (t6501)
	 */
	public void setT6501C2(Set<T6501> t6501C2) {
		this.t6501C2 = t6501C2;
	}

	/**
	 * Busca valor do campo referencia REMETENTE (c3_6501_1001) da tabela
	 * MENSAGEM (t6501)
	 */
	public Set<T6501> getT6501C3() {
		return this.t6501C3;
	}

	/**
	 * Define valor do campo referencia REMETENTE (c3_6501_1001) da tabela
	 * MENSAGEM (t6501)
	 */
	public void setT6501C3(Set<T6501> t6501C3) {
		this.t6501C3 = t6501C3;
	}

	/**
	 * Busca valor do campo referencia COLIGADA (c2_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public Set<T7001> getT7001C2() {
		return this.t7001C2;
	}

	/**
	 * Define valor do campo referencia COLIGADA (c2_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setT7001C2(Set<T7001> t7001C2) {
		this.t7001C2 = t7001C2;
	}

	/**
	 * Busca valor do campo referencia FUNCIONÁRIO (c3_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public Set<T7001> getT7001C3() {
		return this.t7001C3;
	}

	/**
	 * Define valor do campo referencia FUNCIONÁRIO (c3_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setT7001C3(Set<T7001> t7001C3) {
		this.t7001C3 = t7001C3;
	}

	/**
	 * Busca valor do campo referencia SINDICATO (c6_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public Set<T7001> getT7001C6() {
		return this.t7001C6;
	}

	/**
	 * Define valor do campo referencia SINDICATO (c6_7001_1001) da tabela
	 * HISTÓRICO_FUNCIONAL (t7001)
	 */
	public void setT7001C6(Set<T7001> t7001C6) {
		this.t7001C6 = t7001C6;
	}

	/**
	 * Busca valor do campo referencia PROCEDIMENTO (c2_8906_1001) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public Set<T8906> getT8906C2() {
		return this.t8906C2;
	}

	/**
	 * Define valor do campo referencia PROCEDIMENTO (c2_8906_1001) da tabela
	 * PROCEDIMENTO_DETALHE (t8906)
	 */
	public void setT8906C2(Set<T8906> t8906C2) {
		this.t8906C2 = t8906C2;
	}

	/**
	 * Busca valor do campo referencia COLIGADA (c2_9401_1001) da tabela CARGA
	 * (t9401)
	 */
	public Set<T9401> getT9401C2() {
		return this.t9401C2;
	}

	/**
	 * Define valor do campo referencia COLIGADA (c2_9401_1001) da tabela CARGA
	 * (t9401)
	 */
	public void setT9401C2(Set<T9401> t9401C2) {
		this.t9401C2 = t9401C2;
	}

	/**
	 * Busca valor do campo referencia REMETENTE (c4_9401_1001) da tabela CARGA
	 * (t9401)
	 */
	public Set<T9401> getT9401C4() {
		return this.t9401C4;
	}

	/**
	 * Define valor do campo referencia REMETENTE (c4_9401_1001) da tabela CARGA
	 * (t9401)
	 */
	public void setT9401C4(Set<T9401> t9401C4) {
		this.t9401C4 = t9401C4;
	}

	/**
	 * Busca valor do campo referencia DESTINATÁRIO (c8_9401_1001) da tabela
	 * CARGA (t9401)
	 */
	public Set<T9401> getT9401C8() {
		return this.t9401C8;
	}

	/**
	 * Define valor do campo referencia DESTINATÁRIO (c8_9401_1001) da tabela
	 * CARGA (t9401)
	 */
	public void setT9401C8(Set<T9401> t9401C8) {
		this.t9401C8 = t9401C8;
	}

	/**
	 * Busca valor do campo referencia COLIGADA (c2_9501_1001) da tabela VIAGEM
	 * (t9501)
	 */
	public Set<T9501> getT9501C2() {
		return this.t9501C2;
	}

	/**
	 * Define valor do campo referencia COLIGADA (c2_9501_1001) da tabela VIAGEM
	 * (t9501)
	 */
	public void setT9501C2(Set<T9501> t9501C2) {
		this.t9501C2 = t9501C2;
	}

	/**
	 * Busca valor do campo referencia CONTRATADO (c9_9501_1001) da tabela
	 * VIAGEM (t9501)
	 */
	public Set<T9501> getT9501C9() {
		return this.t9501C9;
	}

	/**
	 * Define valor do campo referencia CONTRATADO (c9_9501_1001) da tabela
	 * VIAGEM (t9501)
	 */
	public void setT9501C9(Set<T9501> t9501C9) {
		this.t9501C9 = t9501C9;
	}

	/**
	 * Busca valor do campo referencia USUÁRIO (c5_9901_1001) da tabela LOG
	 * (t9901)
	 */
	public Set<T9901> getT9901C5() {
		return this.t9901C5;
	}

	/**
	 * Define valor do campo referencia USUÁRIO (c5_9901_1001) da tabela LOG
	 * (t9901)
	 */
	public void setT9901C5(Set<T9901> t9901C5) {
		this.t9901C5 = t9901C5;
	}

	@Override
	public String toString() {
		return "ENTIDADE (t1001) [" + "\n\t\tID - CHAVE SEQUENCIAL (c1_1001)=" + c1_1001 + "\n\t\tDESCRIÇÃO (c2_1001)="
				+ c2_1001 + "\n\t\tNOME FANTASIA OU APELIDO (c3_1001)=" + c3_1001 + "]";
	}

}
