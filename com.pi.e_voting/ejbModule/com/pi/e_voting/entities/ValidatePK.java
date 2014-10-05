package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class ValidatePK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idPresidingOfficier;
	private int idRepport;
	private Date date;
	
	
	
	
	public ValidatePK() {
		super();
	}
	public ValidatePK(int idPresidingOfficier, int idRepport, Date date) {
		super();
		this.idPresidingOfficier = idPresidingOfficier;
		this.idRepport = idRepport;
		this.date = date;
	}
	public int getIdPresidingOfficier() {
		return idPresidingOfficier;
	}
	public void setIdPresidingOfficier(int idPresidingOfficier) {
		this.idPresidingOfficier = idPresidingOfficier;
	}
	public int getIdRepport() {
		return idRepport;
	}
	public void setIdRepport(int idRepport) {
		this.idRepport = idRepport;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPresidingOfficier;
		result = prime * result + idRepport;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValidatePK other = (ValidatePK) obj;
		if (idPresidingOfficier != other.idPresidingOfficier)
			return false;
		if (idRepport != other.idRepport)
			return false;
		return true;
	}
	
	

}
