package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Student;

public class GetSingleData {

	public void getSingleData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Student s = ss.get(Student.class, id);

		System.out.println(s);

		tr.commit();
		sf.close();

		System.out.println("Fetch Single Data...");

	}

}
