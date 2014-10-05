package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String type;
	private List<Repport>repports;
	
	
	
	public Type(int id, String type, List<Repport> repports) {
		super();
		this.id = id;
		this.type = type;
		this.repports = repports;
	}

	public Type() {
		super();
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(mappedBy="type")
	public List<Repport> getRepports() {
		return repports;
	}

	public void setRepports(List<Repport> repports) {
		this.repports = repports;
	}
	

}
