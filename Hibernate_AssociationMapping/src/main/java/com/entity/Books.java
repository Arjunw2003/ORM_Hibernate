package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bName;

	@ManyToOne
	private Library library;

	public Books() {

	}

	public Books(int id, String bName, Library library) {
		super();
		this.id = id;
		this.bName = bName;
		this.library = library;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", bName=" + bName + ", library=" + library + "]";
	}

}
