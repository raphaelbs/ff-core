package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t6202")
public class CIDADE_BAIRRO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_6202")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_6202_6201", foreignKey = @ForeignKey(name = "r2_6202_6201"))
	@JsonManagedReference
	private CIDADE CIDADE;

	@Column(name = "c3_6202")
	@Size(max = 40, message = "DESCRICAO deve possuir no máximo {max} caracteres.")
	private String DESCRICAO;

	@OneToMany(mappedBy = "BAIRRO")
	@JsonBackReference
	private Set<ENDERECO> BAIRRO_ENDERECOs;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public CIDADE getCIDADE() {
		return this.CIDADE;
	}

	public void setCIDADE(CIDADE CIDADE) {
		this.CIDADE = CIDADE;
	}

	@JsonIgnore
	public String getDESCRICAO() {
		return this.DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	@JsonIgnore
	public Set<ENDERECO> getBAIRRO_ENDERECOs() {
		return this.BAIRRO_ENDERECOs;
	}

	public void setBAIRRO_ENDERECOs(Set<ENDERECO> BAIRRO_ENDERECOs) {
		this.BAIRRO_ENDERECOs = BAIRRO_ENDERECOs;
	}

}
