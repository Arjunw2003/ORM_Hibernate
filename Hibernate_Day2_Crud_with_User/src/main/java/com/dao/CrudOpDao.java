package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Student;

public class CrudOpDao {

	public void insertData(Student std) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();

		s.setId(std.getId());
		s.setName(std.getName());
		s.setAge(std.getAge());
		s.setCity(std.getCity());
		s.setGender(std.getGender());

		ss.persist(s);

		tr.commit();
		sf.close();

		System.out.println("Data Inserted....");

	}

	public void updateData(Student std) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, std.getId());

		s.setName(std.getName());
		s.setAge(std.getAge());
		s.setCity(std.getCity());
		s.setGender(std.getGender());

		ss.merge(s);

		tr.commit();

		System.out.println("Data Updated....");

	}

	public void deleteData(int did) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, did);

		ss.remove(s);

		tr.commit();
		sf.close();

		System.out.println("Data Deleted...");
	}

	public void getSingleData(int sid) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, sid);

		System.out.println(s);

		tr.commit();
		sf.close();

		System.out.println("Fetch Single Data...");

	}

	public void getAllData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		for (Student s : ss.createQuery("from Student", Student.class).getResultList()) {

			System.out.println(s);
		}

		tr.commit();
		sf.close();

		System.out.println("Fetch All Data...");

	}

}
