package com.society.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the society_primary_details database table.
 * 
 */
@Entity
@Table(name="society_primary_details")
@NamedQuery(name="SocietyPrimaryDetail.findAll", query="SELECT s FROM SocietyPrimaryDetail s")
public class SocietyPrimaryDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SOCIETY_PRIMARY_DETAILS_SOCIETYID_GENERATOR", sequenceName="SOCIETYIDGENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SOCIETY_PRIMARY_DETAILS_SOCIETYID_GENERATOR")
	@Column(name="society_id")
	private Long societyId;

	@Column(name="society_name")
	private String societyName;

	@Column(name="society_registration_number")
	private String societyRegistrationNumber;

	//bi-directional many-to-one association to SocietyAddressDetail
	@OneToMany(mappedBy="SocietyDetails")
	private List<SocietyAddressDetail> SocietyAddressDetails;

	//bi-directional many-to-one association to SocietyBankDetail
	@OneToMany(mappedBy="SocietyDetails")
	private List<SocietyBankDetail> SocietyBankDetails;

	public SocietyPrimaryDetail() {
	}

	public Long getSocietyId() {
		return this.societyId;
	}

	public void setSocietyId(Long societyId) {
		this.societyId = societyId;
	}

	public String getSocietyName() {
		return this.societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getSocietyRegistrationNumber() {
		return this.societyRegistrationNumber;
	}

	public void setSocietyRegistrationNumber(String societyRegistrationNumber) {
		this.societyRegistrationNumber = societyRegistrationNumber;
	}

	public List<SocietyAddressDetail> getSocietyAddressDetails() {
		return this.SocietyAddressDetails;
	}

	public void setSocietyAddressDetails(List<SocietyAddressDetail> SocietyAddressDetails) {
		this.SocietyAddressDetails = SocietyAddressDetails;
	}

	public SocietyAddressDetail addSocietyAddressDetail(SocietyAddressDetail SocietyAddressDetail) {
		getSocietyAddressDetails().add(SocietyAddressDetail);
		SocietyAddressDetail.setSocietyDetails(this);

		return SocietyAddressDetail;
	}

	public SocietyAddressDetail removeSocietyAddressDetail(SocietyAddressDetail SocietyAddressDetail) {
		getSocietyAddressDetails().remove(SocietyAddressDetail);
		SocietyAddressDetail.setSocietyDetails(null);

		return SocietyAddressDetail;
	}

	public List<SocietyBankDetail> getSocietyBankDetails() {
		return this.SocietyBankDetails;
	}

	public void setSocietyBankDetails(List<SocietyBankDetail> SocietyBankDetails) {
		this.SocietyBankDetails = SocietyBankDetails;
	}

	public SocietyBankDetail addSocietyBankDetail(SocietyBankDetail SocietyBankDetail) {
		getSocietyBankDetails().add(SocietyBankDetail);
		SocietyBankDetail.setSocietyDetails(this);

		return SocietyBankDetail;
	}

	public SocietyBankDetail removeSocietyBankDetail(SocietyBankDetail SocietyBankDetail) {
		getSocietyBankDetails().remove(SocietyBankDetail);
		SocietyBankDetail.setSocietyDetails(null);

		return SocietyBankDetail;
	}

}