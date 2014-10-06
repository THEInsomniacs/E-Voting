package com.pi.e_voting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@MappedSuperclass on ajoute abstract aussi dans la classe et on enleve la @entity
@MappedSuperclass
public abstract class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String firtsName;
	private String lastName;
	private int NIC;
	private String address;
	private String email;
	private int phone;
	
	public User(int id, String firtsName, String lastName, int nIC,
			String address, String email, int phone) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		NIC = nIC;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	public User() {
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
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNIC() {
		return NIC;
	}
	public void setNIC(int nIC) {
		NIC = nIC;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	

}
