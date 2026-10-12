package com.qlh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class InsertData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Student (name, age, city, gender) values(:name, :age, :city, :gender)";

		MutationQuery query = ss.createMutationQuery(hqlQuery);

		query.setParameter("name", "Monika");
		query.setParameter("age", 23);
		query.setParameter("city", "Latur");
		query.setParameter("gender", "Female");

		query.executeUpdate();

		tr.commit();

		System.out.println("Inserted...");
	}

}
