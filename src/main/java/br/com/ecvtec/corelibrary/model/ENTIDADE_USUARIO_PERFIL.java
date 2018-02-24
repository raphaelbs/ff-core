package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t1099")
public class ENTIDADE_USUARIO_PERFIL implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_1099")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@OneToOne
	@JoinColumn(name = "c2_1099_1001", foreignKey = @ForeignKey(name = "r2_1099_1001"))
	@JsonManagedReference
	private ENTIDADE PESSOA;

	@ManyToOne
	@JoinColumn(name = "c3_1099_1007", foreignKey = @ForeignKey(name = "r3_1099_1007"))
	@JsonManagedReference
	private ENTIDADE_RELACIONAMENTO RELACIONAMENTO;

	@ManyToOne
	@JoinColumn(name = "c4_1099_9803", foreignKey = @ForeignKey(name = "r4_1099_9803"))
	@JsonManagedReference
	private MENU_PERFIL PERFIL;

	public Integer getID__CHAVE_SEQUENCIAL() {
		return ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer iD__CHAVE_SEQUENCIAL) {
		ID__CHAVE_SEQUENCIAL = iD__CHAVE_SEQUENCIAL;
	}

	public ENTIDADE getPESSOA() {
		return PESSOA;
	}

	public void setPESSOA(ENTIDADE pESSOA) {
		PESSOA = pESSOA;
	}

	public ENTIDADE_RELACIONAMENTO getRELACIONAMENTO() {
		return RELACIONAMENTO;
	}

	public void setRELACIONAMENTO(ENTIDADE_RELACIONAMENTO rELACIONAMENTO) {
		RELACIONAMENTO = rELACIONAMENTO;
	}

	public MENU_PERFIL getPERFIL() {
		return PERFIL;
	}

	public void setPERFIL(MENU_PERFIL pERFIL) {
		PERFIL = pERFIL;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
