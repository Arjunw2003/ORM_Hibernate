package com.qlh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Person;

public class OneToOne {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Laptop.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop lap = new Laptop();
		lap.setLname("HP");

		ss.persist(lap);

		Person p = new Person();
		p.setName("Arjun");
		p.setAge(24);
		p.setCity("Pune");
		p.setGender("Male");
		p.setLaptop(lap);

		ss.persist(p);

		tr.commit();

		System.out.println("Inserted....");

	}

}
