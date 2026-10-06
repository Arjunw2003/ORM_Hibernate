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

	public void deleteData(Student std) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, std.getId());

		ss.remove(s);

		tr.commit();
		sf.close();

		System.out.println("Data Deleted...");
	}

	public void getSingleData(Student std) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, std.getId());

		System.out.println(s);

		tr.commit();
		sf.close();

		System.out.println("Fetch Single Data...");

	}

}
