package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class PresidingOfficier extends PollingStationAgent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	List<Validate>	validates;

	public PresidingOfficier(int id, String firtsName, String lastName,
			int nIC, String address, String email, int phone, String station,
			List<Validate> validates) {
		super(id, firtsName, lastName, nIC, address, email, phone, station);
		this.validates = validates;
	}

	public PresidingOfficier(int id, String firtsName, String lastName,
			int nIC, String address, String email, int phone, String station) {
		super(id, firtsName, lastName, nIC, address, email, phone, station);
	}

	public PresidingOfficier() {
		super();
	}

	@OneToMany(mappedBy="presidingOfficier")
	public List<Validate> getValidates() {
		return validates;
	}

	public void setValidates(List<Validate> validates) {
		this.validates = validates;
	}
	
	

}
