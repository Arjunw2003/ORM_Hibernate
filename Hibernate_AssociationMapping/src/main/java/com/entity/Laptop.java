package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Lid;
	String Lname;

	public Laptop() {

	}

	public Laptop(int lid, String lname) {
		super();
		Lid = lid;
		Lname = lname;
	}

	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + "]";
	}
}
