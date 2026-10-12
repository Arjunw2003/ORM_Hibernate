package com.qlh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class GetSingleData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Student where id = :id";

		Query<Student> query = ss.createQuery(hqlQuery, Student.class);

		int id = 3;
		query.setParameter("id", id);

		Student std = query.getSingleResult();

		System.out.println("Id: " + std.getId());
		System.out.println("Name: " + std.getName());
		System.out.println("Age: " + std.getAge());
		System.out.println("City: " + std.getCity());
		System.out.println("Gender: " + std.getGender());

		System.out.println("Single Data Fetch....");
	}
}
