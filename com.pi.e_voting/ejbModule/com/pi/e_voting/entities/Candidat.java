package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Candidat extends User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fatherFirstName;
	private String fatherLastName;
	private String motherFirsName;
	private String motherLastName;
	private Date dateOfBirth;
	private String placeOfBirth;
	private String occupation;
	private Date NICIssuance;
	private String NICplaceIssance;
	private int fatherNIC;
	private Date fatherNICIssance;
	private String fatherNICplaceIssance;
	private int motherNIC;
	private Date motherNICIssance;
	private String motherNICplaceIssance;
	private String typeCandidate;
	private Resultat resultat;
	private Party party;
	
	
	
	
	
	

	public Candidat(int id, String firtsName, String lastName, int nIC,
			String address, String email, int phone, String fatherFirstName,
			String fatherLastName, String motherFirsName,
			String motherLastName, Date dateOfBirth, String placeOfBirth,
			String occupation, Date nICIssuance, String nICplaceIssance,
			int fatherNIC, Date fatherNICIssance, String fatherNICplaceIssance,
			int motherNIC, Date motherNICIssance, String motherNICplaceIssance,
			String typeCandidate, Resultat resultat, Party party) {
		super(id, firtsName, lastName, nIC, address, email, phone);
		this.fatherFirstName = fatherFirstName;
		this.fatherLastName = fatherLastName;
		this.motherFirsName = motherFirsName;
		this.motherLastName = motherLastName;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.occupation = occupation;
		NICIssuance = nICIssuance;
		NICplaceIssance = nICplaceIssance;
		this.fatherNIC = fatherNIC;
		this.fatherNICIssance = fatherNICIssance;
		this.fatherNICplaceIssance = fatherNICplaceIssance;
		this.motherNIC = motherNIC;
		this.motherNICIssance = motherNICIssance;
		this.motherNICplaceIssance = motherNICplaceIssance;
		this.typeCandidate = typeCandidate;
		this.resultat = resultat;
		this.party = party;
	}



	public Candidat() {
		super();
	}
	

	
	public String getFatherFirstName() {
		return fatherFirstName;
	}
	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}
	public String getFatherLastName() {
		return fatherLastName;
	}
	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}
	public String getMotherFirsName() {
		return motherFirsName;
	}
	public void setMotherFirsName(String motherFirsName) {
		this.motherFirsName = motherFirsName;
	}
	public String getMotherLastName() {
		return motherLastName;
	}
	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getNICIssuance() {
		return NICIssuance;
	}
	public void setNICIssuance(Date nICIssuance) {
		NICIssuance = nICIssuance;
	}
	public String getNICplaceIssance() {
		return NICplaceIssance;
	}
	public void setNICplaceIssance(String nICplaceIssance) {
		NICplaceIssance = nICplaceIssance;
	}
	public int getFatherNIC() {
		return fatherNIC;
	}
	public void setFatherNIC(int fatherNIC) {
		this.fatherNIC = fatherNIC;
	}
	public Date getFatherNICIssance() {
		return fatherNICIssance;
	}
	public void setFatherNICIssance(Date fatherNICIssance) {
		this.fatherNICIssance = fatherNICIssance;
	}
	public String getFatherNICplaceIssance() {
		return fatherNICplaceIssance;
	}
	public void setFatherNICplaceIssance(String fatherNICplaceIssance) {
		this.fatherNICplaceIssance = fatherNICplaceIssance;
	}
	public int getMotherNIC() {
		return motherNIC;
	}
	public void setMotherNIC(int motherNIC) {
		this.motherNIC = motherNIC;
	}
	public Date getMotherNICIssance() {
		return motherNICIssance;
	}
	public void setMotherNICIssance(Date motherNICIssance) {
		this.motherNICIssance = motherNICIssance;
	}
	public String getMotherNICplaceIssance() {
		return motherNICplaceIssance;
	}
	public void setMotherNICplaceIssance(String motherNICplaceIssance) {
		this.motherNICplaceIssance = motherNICplaceIssance;
	}
	public String getTypeCandidate() {
		return typeCandidate;
	}
	public void setTypeCandidate(String typeCandidate) {
		this.typeCandidate = typeCandidate;
	}
	
	@ManyToOne
	public Resultat getResultat() {
		return resultat;
	}
	public void setResultat(Resultat resultat) {
		this.resultat = resultat;
	}



	@ManyToOne
	public Party getParty() {
		return party;
	}



	public void setParty(Party party) {
		this.party = party;
	}
	
	
}
