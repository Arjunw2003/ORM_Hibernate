package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	int age;
	String city;
	String gender;

	@OneToOne
	@JoinColumn(name = "Laptop_id")
	Laptop laptop;

	public Person() {

	}

	public Person(int id, String name, int age, String city, String gender, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
		this.laptop = laptop;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender
				+ ", laptop=" + laptop + "]";
	}

}
