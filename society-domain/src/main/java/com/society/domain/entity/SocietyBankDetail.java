package com.society.domain.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the society_bank_details database table.
 * 
 */
@Entity
@Table(name="society_bank_details")
@NamedQuery(name="SocietyBankDetail.findAll", query="SELECT s FROM SocietyBankDetail s")
public class SocietyBankDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SOCIETY_BANK_DETAILS_SOCIETYBANKID_GENERATOR", sequenceName="SOCIETYIDGENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SOCIETY_BANK_DETAILS_SOCIETYBANKID_GENERATOR")
	@Column(name="society_bank_id")
	private Integer societyBankId;

	@Column(name="bank_account_number")
	private String bankAccountNumber;

	@Column(name="bank_branch")
	private String bankBranch;

	//bi-directional many-to-one association to SocietyPrimaryDetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="society_id")
	private SocietyPrimaryDetail SocietyDetails;

	public SocietyBankDetail() {
	}

	public Integer getSocietyBankId() {
		return this.societyBankId;
	}

	public void setSocietyBankId(Integer societyBankId) {
		this.societyBankId = societyBankId;
	}

	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankBranch() {
		return this.bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public SocietyPrimaryDetail getSocietyDetails() {
		return this.SocietyDetails;
	}

	public void setSocietyDetails(SocietyPrimaryDetail SocietyDetails) {
		this.SocietyDetails = SocietyDetails;
	}

}