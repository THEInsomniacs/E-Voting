package com.pi.e_voting.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class PollingStationAgent extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String station;

	public PollingStationAgent(int id, String firtsName, String lastName,
			int nIC, String address, String email, int phone, String station) {
		super(id, firtsName, lastName, nIC, address, email, phone);
		this.station = station;
	}

	public PollingStationAgent(int id, String firtsName, String lastName,
			int nIC, String address, String email, int phone) {
		super(id, firtsName, lastName, nIC, address, email, phone);
	}
	
	
	public PollingStationAgent() {
		super();
	}
	
	
	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}
	

}
