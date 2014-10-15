package com.pi.e_voting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PollingStationAgent extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String station;
	private  boolean activated ;
	
	public PollingStationAgent(String firtsName, String lastName,
			int nIC, String address, String email, int phone, String station,String password) {
		super( firtsName, lastName, nIC, address, email, phone,password);
		this.station = station;
		this.activated=true;
	}
	
	

	public PollingStationAgent(int id, String firtsName, String lastName,
			int nIC, String address, String email, int phone, String station,String password) {
		super(id, firtsName, lastName, nIC, address, email, phone,password);
		this.station = station;
	}

	public PollingStationAgent(int id, String firtsName, String lastName,
			int nIC, String address, String email, int phone) {
		super(id, firtsName, lastName, nIC, address, email, phone);
	}

	public PollingStationAgent(String firtsName, String lastName,
			int nIC, String address, String email, int phone, String station) {
		super( firtsName, lastName, nIC, address, email, phone);
		this.station = station;
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



	public boolean isActivated() {
		return activated;
	}



	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	

}
