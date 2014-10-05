package com.pi.e_voting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PartyAdministrator implements Serializable {
	
	private int id ;

	public PartyAdministrator(int id) {
		super();
		this.id = id;
	}

	public PartyAdministrator() {
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
	
	
	
	
	
	

}
