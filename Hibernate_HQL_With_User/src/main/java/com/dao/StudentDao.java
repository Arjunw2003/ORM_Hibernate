package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Student;

public class StudentDao {

	public void InsertData(Student std) {

		Configuration cfg = new Configuration();

		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Student(id, name, age, city) values(:id, :name, :age, :city)";

		MutationQuery mq = ss.createMutationQuery(hqlQuery);
		mq.setParameter("id", std.getId());
		mq.setParameter("name", std.getName());
		mq.setParameter("age", std.getAge());
		mq.setParameter("city", std.getCity());

		mq.executeUpdate();
		tr.commit();

		System.out.println("Data Inserted...");

	}

	public void UpdateData(Student std) {

		Configuration cfg = new Configuration();

		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Student set name = :name, age = :age, city = :city where id = :id";

		MutationQuery mq = ss.createMutationQuery(hqlQuery);

		mq.setParameter("id", std.getId());
		mq.setParameter("name", std.getName());
		mq.setParameter("age", std.getAge());
		mq.setParameter("city", std.getCity());

		mq.executeUpdate();

		tr.commit();

		System.out.println("Updated Data....");

	}

	public void deleteData(int id) {

		Configuration cfg = new Configuration();

		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "delete Student where id = :id";

		MutationQuery mq = ss.createMutationQuery(hqlQuery);
		mq.setParameter("id", id);

		mq.executeUpdate();

		tr.commit();

		System.out.println("Data Deleted...");

	}

	public void getSingleData(int id) {

		Configuration cfg = new Configuration();

		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Student where id = :id";

		Query<Student> query = ss.createQuery(hqlQuery, Student.class);

		query.setParameter("id", id);
		Student s = query.getSingleResult();

		System.out.println("Id: " + s.getId());
		System.out.println("Name: " + s.getName());
		System.out.println("Age: " + s.getAge());
		System.out.println("City: " + s.getCity());

	}

	public void getAllData() {

		Configuration cfg = new Configuration();

		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Student";

		Query<Student> query = ss.createQuery(hqlQuery, Student.class);

		List<Student> list = query.getResultList();

//		System.out.println(list);
		for (Student s : list) {
			System.out.println("Id: " + s.getId());
			System.out.println("Name: " + s.getName());
			System.out.println("Age: " + s.getAge());
			System.out.println("City: " + s.getCity());
			System.out.println();
		}

	}
}
