package com.ormh;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "StudentInfo")
@Entity
public class Students {

	@Id
	int id;
	String name;
	int age;
	String city;
	String gender;

	public Students() {

	}

	public Students(int id, String name, int age, String city, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender + "]";
	}

}
