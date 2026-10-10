package com.qlh;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Books;
import com.entity.Course;
import com.entity.Library;
import com.entity.Students;

public class ManyToMany {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		cfg.addAnnotatedClass(Course.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Course c1 = new Course();
		c1.setCourseName("Java");

		Course c2 = new Course();
		c2.setCourseName("Python");

		Students s1 = new Students();
		s1.setStdName("Arjun");
		s1.setAge(21);
		s1.setCity("Pune");

		Students s2 = new Students();
		s2.setStdName("Arjun");
		s2.setAge(21);
		s2.setCity("Pune");

		List<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);

		List<Students> students = new ArrayList<Students>();
		students.add(s1);
		students.add(s2);

		s1.setCourses(courses);
		s2.setCourses(courses);

		c1.setStudents(students);
		c2.setStudents(students);

		ss.persist(c1);
		ss.persist(c2);

		ss.persist(s1);
		ss.persist(s2);

		tr.commit();

		System.out.println("Inserted Data.....");

	}
}
