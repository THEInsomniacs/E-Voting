package com.pi.e_voting.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Repport implements Serializable{

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id ;
 private String description;
 private Observer observer;
 private Type type;
 private List<Validate>validates;
 
 private List<Read>reads;






public Repport(int id, String description, Observer observer, Type type,
		List<Validate> validates, List<Read> reads) {
	super();
	this.id = id;
	this.description = description;
	this.observer = observer;
	this.type = type;
	this.validates = validates;
	this.reads = reads;
}

public Repport(int id, String description, Observer observer, Type type,
		List<Validate> validates) {
	super();
	this.id = id;
	this.description = description;
	this.observer = observer;
	this.type = type;
	this.validates = validates;
}

public Repport() {
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

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

@ManyToOne
public Observer getObserver() {
	return observer;
}
public void setObserver(Observer observer) {
	this.observer = observer;
}
@ManyToOne
public Type getType() {
	return type;
}

public void setType(Type type) {
	this.type = type;
}



@OneToMany(mappedBy="repport")
public List<Validate> getValidates() {
	return validates;
}

public void setValidates(List<Validate> validates) {
	this.validates = validates;
}

@OneToMany(mappedBy="repport")
public List<Read> getReads() {
	return reads;
}

public void setReads(List<Read> reads) {
	this.reads = reads;
}
 
 
	
	
}
