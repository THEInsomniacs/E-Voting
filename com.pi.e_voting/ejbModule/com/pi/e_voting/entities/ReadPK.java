package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;


@Embeddable
public class ReadPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idISIEAdministrator;
	private int idRepport;
	private Date date;
	
	
	public ReadPK(int idISIEAdministrator, int idRepport, Date date) {
		super();
		this.idISIEAdministrator = idISIEAdministrator;
		this.idRepport = idRepport;
		this.date = date;
	}
	public ReadPK() {
		super();
	}
	public int getIdISIEAdministrator() {
		return idISIEAdministrator;
	}
	public void setIdISIEAdministrator(int idISIEAdministrator) {
		this.idISIEAdministrator = idISIEAdministrator;
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
		result = prime * result + idISIEAdministrator;
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
		ReadPK other = (ReadPK) obj;
		if (idISIEAdministrator != other.idISIEAdministrator)
			return false;
		if (idRepport != other.idRepport)
			return false;
		return true;
	}
	
	

}
