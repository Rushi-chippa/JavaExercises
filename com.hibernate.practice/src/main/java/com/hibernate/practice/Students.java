package com.hibernate.practice;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer sid;
	String sname;

	@OneToMany
	List<Gadets> gad;

	public Students(String sname, List<Gadets> gad) {

		this.sname = sname;
		this.gad = gad;
	}

	public Students() {

	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Gadets> getGad() {
		return gad;
	}

	public void setGad(List<Gadets> gad) {
		this.gad = gad;
	}

}
