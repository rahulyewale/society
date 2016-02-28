package com.society.domain.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the society_bank_master database table.
 * 
 */
@Entity
@Table(name="society_bank_master")
@NamedQuery(name="SocietyBankMaster.findAll", query="SELECT s FROM SocietyBankMaster s")
public class SocietyBankMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SOCIETY_BANK_MASTER_BANKID_GENERATOR", sequenceName="SOCIETYIDGENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SOCIETY_BANK_MASTER_BANKID_GENERATOR")
	@Column(name="bank_id")
	private Integer bankId;

	@Column(name="bank_description")
	private String bankDescription;

	@Column(name="bank_name")
	private String bankName;

	public SocietyBankMaster() {
	}

	public Integer getBankId() {
		return this.bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankDescription() {
		return this.bankDescription;
	}

	public void setBankDescription(String bankDescription) {
		this.bankDescription = bankDescription;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}