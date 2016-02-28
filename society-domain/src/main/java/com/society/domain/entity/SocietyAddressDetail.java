package com.society.domain.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the society_address_details database table.
 * 
 */
@Entity
@Table(name="society_address_details")
@NamedQuery(name="SocietyAddressDetail.findAll", query="SELECT s FROM SocietyAddressDetail s")
public class SocietyAddressDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SOCIETY_ADDRESS_DETAILS_SOCIETYADDRESSID_GENERATOR", sequenceName="SOCIETYIDGENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SOCIETY_ADDRESS_DETAILS_SOCIETYADDRESSID_GENERATOR")
	@Column(name="society_address_id")
	private Integer societyAddressId;

	@Column(name="society_area")
	private String societyArea;

	@Column(name="society_landmark")
	private String societyLandmark;

	@Column(name="society_nearest_station")
	private String societyNearestStation;

	@Column(name="society_road")
	private String societyRoad;

	@Column(name="society_zip")
	private String societyZip;

	//bi-directional many-to-one association to SocietyPrimaryDetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="society_id")
	private SocietyPrimaryDetail SocietyDetails;

	public SocietyAddressDetail() {
	}

	public Integer getSocietyAddressId() {
		return this.societyAddressId;
	}

	public void setSocietyAddressId(Integer societyAddressId) {
		this.societyAddressId = societyAddressId;
	}

	public String getSocietyArea() {
		return this.societyArea;
	}

	public void setSocietyArea(String societyArea) {
		this.societyArea = societyArea;
	}

	public String getSocietyLandmark() {
		return this.societyLandmark;
	}

	public void setSocietyLandmark(String societyLandmark) {
		this.societyLandmark = societyLandmark;
	}

	public String getSocietyNearestStation() {
		return this.societyNearestStation;
	}

	public void setSocietyNearestStation(String societyNearestStation) {
		this.societyNearestStation = societyNearestStation;
	}

	public String getSocietyRoad() {
		return this.societyRoad;
	}

	public void setSocietyRoad(String societyRoad) {
		this.societyRoad = societyRoad;
	}

	public String getSocietyZip() {
		return this.societyZip;
	}

	public void setSocietyZip(String societyZip) {
		this.societyZip = societyZip;
	}

	public SocietyPrimaryDetail getSocietyDetails() {
		return this.SocietyDetails;
	}

	public void setSocietyDetails(SocietyPrimaryDetail SocietyDetails) {
		this.SocietyDetails = SocietyDetails;
	}

}