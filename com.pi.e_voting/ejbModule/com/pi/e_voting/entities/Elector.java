package com.pi.e_voting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Elector extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String Identifier;
	private String Authentificator;
	PollingAgent pollingAgent ;
	
	
	
	public Elector(int id, String firtsName, String lastName, int nIC,
			String address, String email, int phone, String identifier,
			String authentificator, PollingAgent pollingAgent) {
		super(id, firtsName, lastName, nIC, address, email, phone);
		Identifier = identifier;
		Authentificator = authentificator;
		this.pollingAgent = pollingAgent;
	}

	public Elector(String identifier, String authentificator) {
		super();
		Identifier = identifier;
		Authentificator = authentificator;
	}

	public Elector() {
		super();
	}

	



	public String getIdentifier() {
		return Identifier;
	}

	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}

	public String getAuthentificator() {
		return Authentificator;
	}

	public void setAuthentificator(String authentificator) {
		Authentificator = authentificator;
	}

	@ManyToOne
	public PollingAgent getPollingAgent() {
		return pollingAgent;
	}

	public void setPollingAgent(PollingAgent pollingAgent) {
		this.pollingAgent = pollingAgent;
	}
	
	
	

}
