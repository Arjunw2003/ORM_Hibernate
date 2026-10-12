package com.qlh;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class GetAllData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "From Student";

		Query<Student> query = ss.createQuery(hqlQuery, Student.class);

		List<Student> list = query.getResultList();

		for (Student s : list) {

			System.out.println("Id: " + s.getId());
			System.out.println("Name: " + s.getName());
			System.out.println("Age: " + s.getAge());
			System.out.println("City: " + s.getCity());
			System.out.println("Gender: " + s.getGender());
			System.out.println();
		}

//		System.out.println(list);
	}
}
