package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Observer extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	private List<Repport> repports;



	public Observer(int id, String firtsName, String lastName, int nIC,
			String address, String email, int phone, List<Repport> repports) {
		super(id, firtsName, lastName, nIC, address, email, phone);
		this.repports = repports;
	}
	
	public Observer() {
		super();
		this.repports = repports;
	}



	@OneToMany(mappedBy="observer")
	public List<Repport> getRepports() {
		return repports;
	}



	
	public void setRepports(List<Repport> repports) {
		this.repports = repports;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
