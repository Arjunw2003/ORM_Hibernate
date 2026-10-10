package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String libName;

	@OneToMany
	private List<Books> books;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int id, String libName, List<Books> books) {
		super();
		this.id = id;
		this.libName = libName;
		this.books = books;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", libName=" + libName + ", books=" + books + "]";
	}

}