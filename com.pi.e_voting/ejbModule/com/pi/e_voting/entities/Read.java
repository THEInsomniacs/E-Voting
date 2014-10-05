package com.pi.e_voting.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Read implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ReadPK readPK;
	private ISIEAdministrator administrator;
	private Repport repport;
	private Boolean status;
	public Read(ReadPK readPK, ISIEAdministrator administrator,
			Repport repport, Boolean status) {
		super();
		this.readPK = readPK;
		this.administrator = administrator;
		this.repport = repport;
		this.status = status;
	}
	public Read() {
		super();
	}
	
	@EmbeddedId
	public ReadPK getReadPK() {
		return readPK;
	}
	public void setReadPK(ReadPK readPK) {
		this.readPK = readPK;
	}
	
	@ManyToOne
	@JoinColumn(name="idISIEAdministrator",referencedColumnName="id",insertable=false,updatable=false)
	public ISIEAdministrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(ISIEAdministrator administrator) {
		this.administrator = administrator;
	}
	
	@ManyToOne
	@JoinColumn(name="idRepport",referencedColumnName="id",insertable=false,updatable=false)
	public Repport getRepport() {
		return repport;
	}
	public void setRepport(Repport repport) {
		this.repport = repport;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	

}
