package com.pi.e_voting.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Validate implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ValidatePK validatePK;
	private PresidingOfficer presidingOfficier;
	private Repport repport;
	
	private Boolean status;

	public Validate(ValidatePK validatePK, PresidingOfficer presidingOfficier,
			Repport repport, Boolean status) {
		super();
		this.validatePK = validatePK;
		this.presidingOfficier = presidingOfficier;
		this.repport = repport;
		this.status = status;
	}

	public Validate() {
		super();
	}

	@EmbeddedId
	public ValidatePK getValidatePK() {
		return validatePK;
	}

	public void setValidatePK(ValidatePK validatePK) {
		this.validatePK = validatePK;
	}

	@ManyToOne
	@JoinColumn(name="idPresidingOfficier",referencedColumnName="id",insertable=false,updatable=false)
	public PresidingOfficer getPresidingOfficier() {
		return presidingOfficier;
	}

	public void setPresidingOfficier(PresidingOfficer presidingOfficier) {
		this.presidingOfficier = presidingOfficier;
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
