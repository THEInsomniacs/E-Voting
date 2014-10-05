package com.pi.e_voting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class News implements Serializable{
	
	private int id ;
	private String name;
	private String inforamation;
	public News(int id, String name, String inforamation) {
		super();
		this.id = id;
		this.name = name;
		this.inforamation = inforamation;
	}
	public News() {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInforamation() {
		return inforamation;
	}
	public void setInforamation(String inforamation) {
		this.inforamation = inforamation;
	}
	
	

}
