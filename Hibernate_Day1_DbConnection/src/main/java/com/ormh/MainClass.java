package com.ormh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Students s = new Students();

		s.setId(1);
		s.setName("Arjun");
		s.setAge(24);
		s.setCity("Pune");
		s.setGender("Male");

		ss.persist(s);
		
		tr.commit();
		ss.close();

		System.out.println("Inserted");

	}
}
