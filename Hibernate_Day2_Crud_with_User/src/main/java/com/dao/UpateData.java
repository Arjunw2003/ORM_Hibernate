package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Student;

public class UpateData {

	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 2;
		Student s = ss.get(Student.class, id);

		s.setName("Pavan");
		s.setAge(26);
		s.setCity("Latur");
		s.setGender("Male");

		ss.merge(s);
		
		tr.commit();

		System.out.println("Data Updated....");

	}
}
