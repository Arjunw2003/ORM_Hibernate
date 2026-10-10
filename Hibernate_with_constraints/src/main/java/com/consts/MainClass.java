package com.consts;


import java.text.SimpleDateFormat;
import java.util.Date;

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

		try {
			Students s = new Students();

			s.setName("Pratik");
			s.setAge(21);
//			s.setCity("Sambhajinagar");
			s.setEmail("pratik@gmail.com");
			s.setGender("Male");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dob = sdf.parse("2003-05-12");
			s.setDob(dob);

			ss.persist(s);
			tr.commit();

			System.out.println("Insert Successfully....");

		} catch (Exception e) {
			if (tr.isActive()) {
				tr.rollback();
			}
			e.printStackTrace();
		} finally {
			ss.close();
			sf.close();
		}

	}
}
