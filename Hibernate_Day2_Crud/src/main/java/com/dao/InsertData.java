package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Student;

public class InsertData {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();

		s.setId(2);
		s.setName("Kiran");
		s.setAge(22);
		s.setCity("Jalna");
		s.setGender("Male");

		ss.persist(s);

		tr.commit();
		sf.close();

		System.out.println("Data Inserted....");

	}
}
