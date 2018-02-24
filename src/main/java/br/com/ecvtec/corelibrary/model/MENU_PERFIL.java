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

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t9803")
public class MENU_PERFIL implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c1_9803")
	@JsonProperty("ID__CHAVE_SEQUENCIAL")
	private Integer ID__CHAVE_SEQUENCIAL;

	@ManyToOne
	@JoinColumn(name = "c2_9803_9801", foreignKey = @ForeignKey(name = "r2_9803_9801"))
	@JsonManagedReference
	private MENU MENU;

	@Column(name = "c3_9803")
	@JsonProperty("DESCRICAO")
	private String DESCRICAO;

	@OneToMany(mappedBy = "MENU_PERFIL")
	@JsonManagedReference
	@JsonProperty("MENU_PERFIL_ITEM")
	private Set<MENU_PERFIL_ITEM> MENU_PERFIL_ITEM;

	public Integer getID__CHAVE_SEQUENCIAL() {
		return ID__CHAVE_SEQUENCIAL;
	}

	public void setID__CHAVE_SEQUENCIAL(Integer iD__CHAVE_SEQUENCIAL) {
		ID__CHAVE_SEQUENCIAL = iD__CHAVE_SEQUENCIAL;
	}

	public MENU getMENU() {
		return MENU;
	}

	public void setMENU(MENU mENU) {
		MENU = mENU;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
