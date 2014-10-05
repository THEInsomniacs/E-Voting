package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ballot implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Date startDate;
	private Date endDate;
	private String electionType;
	
	List<PollingAgent>pollingAgents;
	List<ISIEAdministrator>administrators;
	

	
	
	

	public Ballot(int id, String name, Date startDate, Date endDate,
			String electionType, List<PollingAgent> pollingAgents,
			List<ISIEAdministrator> administrators) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.electionType = electionType;
		this.pollingAgents = pollingAgents;
		this.administrators = administrators;
	}

	public Ballot() {
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getElectionType() {
		return electionType;
	}
	public void setElectionType(String electionType) {
		this.electionType = electionType;
	}
	
	@OneToMany(mappedBy="ballot")
	public List<PollingAgent> getPollingAgents() {
		return pollingAgents;
	}
	public void setPollingAgents(List<PollingAgent> pollingAgents) {
		this.pollingAgents = pollingAgents;
	}

	@OneToMany(mappedBy="ballot")
	public List<ISIEAdministrator> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(List<ISIEAdministrator> administrators) {
		this.administrators = administrators;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
