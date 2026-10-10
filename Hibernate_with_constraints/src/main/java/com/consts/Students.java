package com.consts;

import java.util.Date;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name = "sdt_info")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "std_name", nullable = false, length = 50)
	String name;

	@Check(constraints = "age >= 18")
	int age;

//	@ColumnDefault(value = "'pune'")
	String city = "pune";
	@Column(length = 300, nullable = false)
	String email;
	String gender;
	Date dob;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String name, int age, String city, String email, String gender, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", email=" + email
				+ ", gender=" + gender + ", dob=" + dob + "]";
	}

}
