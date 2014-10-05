package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Resultat implements Serializable {
	
	private int id;
	private int total_candidate_vote;
	private int total_party_vote;
	private List<Candidat>candidats;
	private List<Party>parties;
	private List<ISIEAdministrator>administrators;
	
	
	public Resultat(int id, int total_candidate_vote, int total_party_vote,
			List<Candidat> candidats, List<Party> parties,
			List<ISIEAdministrator> administrators) {
		super();
		this.id = id;
		this.total_candidate_vote = total_candidate_vote;
		this.total_party_vote = total_party_vote;
		this.candidats = candidats;
		this.parties = parties;
		this.administrators = administrators;
	}

	public Resultat() {
		super();
	}
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotal_candidate_vote() {
		return total_candidate_vote;
	}
	public void setTotal_candidate_vote(int total_candidate_vote) {
		this.total_candidate_vote = total_candidate_vote;
	}
	public int getTotal_party_vote() {
		return total_party_vote;
	}
	public void setTotal_party_vote(int total_party_vote) {
		this.total_party_vote = total_party_vote;
	}
	
	@OneToMany(mappedBy="resultat")
	public List<Candidat> getCandidats() {
		return candidats;
	}
	public void setCandidats(List<Candidat> candidats) {
		this.candidats = candidats;
	}
	
	@OneToMany(mappedBy="resultat")
	public List<Party> getParties() {
		return parties;
	}
	public void setParties(List<Party> parties) {
		this.parties = parties;
	}

	@OneToMany(mappedBy="resultat")
	public List<ISIEAdministrator> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(List<ISIEAdministrator> administrators) {
		this.administrators = administrators;
	}
	
	
	
	
}
