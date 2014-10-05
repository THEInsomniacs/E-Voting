package com.pi.e_voting.entities;

import java.util.Date;

public class ConnectedUser {
	
	private String surname;
	private String profession;
	private String address;
	private int zipCode;
	private String country;
	private Date dateOfBirht;
	private boolean praticipate;
	private String usefulArea;
	
	public ConnectedUser(String surname, String profession, String address,
			int zipCode, String country, Date dateOfBirht, boolean praticipate,
			String usefulArea) {
		super();
		this.surname = surname;
		this.profession = profession;
		this.address = address;
		this.zipCode = zipCode;
		this.country = country;
		this.dateOfBirht = dateOfBirht;
		this.praticipate = praticipate;
		this.usefulArea = usefulArea;
	}

	public ConnectedUser() {
		super();
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateOfBirht() {
		return dateOfBirht;
	}

	public void setDateOfBirht(Date dateOfBirht) {
		this.dateOfBirht = dateOfBirht;
	}

	public boolean isPraticipate() {
		return praticipate;
	}

	public void setPraticipate(boolean praticipate) {
		this.praticipate = praticipate;
	}

	public String getUsefulArea() {
		return usefulArea;
	}

	public void setUsefulArea(String usefulArea) {
		this.usefulArea = usefulArea;
	}
	
	

}
