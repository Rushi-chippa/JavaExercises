package com.hibernate.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gadets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer gadetid;
	String gadtype;
	public Gadets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gadets( String gadtype) {
		
		this.gadtype = gadtype;
	}
	public Integer getGadetid() {
		return gadetid;
	}
	public void setGadetid(Integer gadetid) {
		this.gadetid = gadetid;
	}
	public String getGadtype() {
		return gadtype;
	}
	public void setGadtype(String gadtype) {
		this.gadtype = gadtype;
	}
	
	
}
