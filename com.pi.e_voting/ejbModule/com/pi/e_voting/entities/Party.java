package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Party  implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id ;
	private String name;
	//founding members
	private String value;
	private String description;
	private String creatorMail;
	private String password;
	private String politicalAffiliation;
	private Resultat resultat;
	List<Candidat>candidats;
	
	
	
	
	public Party(int id, String name, String value, String description,
			String creatorMail, String password, String politicalAffiliation,
			Resultat resultat, List<Candidat> candidats) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.description = description;
		this.creatorMail = creatorMail;
		this.password = password;
		this.politicalAffiliation = politicalAffiliation;
		this.resultat = resultat;
		this.candidats = candidats;
	}

	public Party() {
		super();
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatorMail() {
		return creatorMail;
	}
	public void setCreatorMail(String creatorMail) {
		this.creatorMail = creatorMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPoliticalAffiliation() {
		return politicalAffiliation;
	}
	public void setPoliticalAffiliation(String politicalAffiliation) {
		this.politicalAffiliation = politicalAffiliation;
	}

	@ManyToOne
	public Resultat getResultat() {
		return resultat;
	}

	public void setResultat(Resultat resultat) {
		this.resultat = resultat;
	}

	@OneToMany(mappedBy="party")
	public List<Candidat> getCandidats() {
		return candidats;
	}

	public void setCandidats(List<Candidat> candidats) {
		this.candidats = candidats;
	}
	
	


	
	
}
