package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_data")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String stdName;
	private int age;
	private String city;

	@ManyToMany
	private List<Course> courses;

	public Students() {

	}

	public Students(int id, String stdName, int age, String city, List<Course> courses) {
		super();
		this.id = id;
		this.stdName = stdName;
		this.age = age;
		this.city = city;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
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

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", stdName=" + stdName + ", age=" + age + ", city=" + city + ", courses="
				+ courses + "]";
	}

}
