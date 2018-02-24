package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t2098")
public class INSUMO_GRUPO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_2098")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_2098_2001", foreignKey = @ForeignKey(name = "r2_2098_2001"))
	@JsonManagedReference
	private INSUMO TABELA_DE_INSUMO;

	@OneToOne
	@JoinColumn(name = "c3_2098_5002", foreignKey = @ForeignKey(name = "r3_2098_5002"))
	@JsonManagedReference
	private TIPO_VALOR GRUPO_QUE_O_INSUMO_PERTENCE_VEICULO_TELEFONE_IMPOSTO_PROVENTO_DESCONTO_COM;

	@JsonIgnore
	public Integer getID__CHAVE_SEQUENCIAL() {
		return this.ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer ID__CHAVE_SEQUENCIAL) {
		this.ID__CHAVE_SEQUENCIAL = ID__CHAVE_SEQUENCIAL;
	}

	@JsonIgnore
	public INSUMO getTABELA_DE_INSUMO() {
		return this.TABELA_DE_INSUMO;
	}

	public void setTABELA_DE_INSUMO(INSUMO TABELA_DE_INSUMO) {
		this.TABELA_DE_INSUMO = TABELA_DE_INSUMO;
	}

	@JsonIgnore
	public TIPO_VALOR getGRUPO_QUE_O_INSUMO_PERTENCE_VEICULO_TELEFONE_IMPOSTO_PROVENTO_DESCONTO_COM() {
		return this.GRUPO_QUE_O_INSUMO_PERTENCE_VEICULO_TELEFONE_IMPOSTO_PROVENTO_DESCONTO_COM;
	}

	public void setGRUPO_QUE_O_INSUMO_PERTENCE_VEICULO_TELEFONE_IMPOSTO_PROVENTO_DESCONTO_COM(
			TIPO_VALOR GRUPO_QUE_O_INSUMO_PERTENCE_VEICULO_TELEFONE_IMPOSTO_PROVENTO_DESCONTO_COM) {
		this.GRUPO_QUE_O_INSUMO_PERTENCE_VEICULO_TELEFONE_IMPOSTO_PROVENTO_DESCONTO_COM = GRUPO_QUE_O_INSUMO_PERTENCE_VEICULO_TELEFONE_IMPOSTO_PROVENTO_DESCONTO_COM;
	}

}
