package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ISIEAdministrator extends User implements Serializable {
	

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Ballot ballot;
	private Resultat resultat;
	List<Read>reads;








public ISIEAdministrator(int id, String firtsName, String lastName,
			int nIC, String address, String email, int phone, Ballot ballot,
			Resultat resultat, List<Read> reads) {
		super(id, firtsName, lastName, nIC, address, email, phone);
		this.ballot = ballot;
		this.resultat = resultat;
		this.reads = reads;
	}

public ISIEAdministrator() {
	super();
}

@ManyToOne
public Ballot getBallot() {
	return ballot;
}

public void setBallot(Ballot ballot) {
	this.ballot = ballot;
}

@ManyToOne
public Resultat getResultat() {
	return resultat;
}

public void setResultat(Resultat resultat) {
	this.resultat = resultat;
}

@OneToMany(mappedBy="administrator")
public List<Read> getReads() {
	return reads;
}

public void setReads(List<Read> reads) {
	this.reads = reads;
}




 

}
