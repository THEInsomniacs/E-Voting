package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PollingAgent extends PollingStationAgent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Elector> electors;
	private Ballot ballot;
	
	
	
	


	public PollingAgent( String firtsName, String lastName, int nIC,
			String address, String email, int phone, String station,
			String password) {
		super( firtsName, lastName, nIC, address, email, phone, station,
				password);
	}

	

	public PollingAgent() {
		super();
	}

	@OneToMany(mappedBy="pollingAgent")
	public List<Elector> getElectors() {
		return electors;
	}

	public void setElectors(List<Elector> electors) {
		this.electors = electors;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne
	public Ballot getBallot() {
		return ballot;
	}

	public void setBallot(Ballot ballot) {
		this.ballot = ballot;
	}
	
	
	

}
