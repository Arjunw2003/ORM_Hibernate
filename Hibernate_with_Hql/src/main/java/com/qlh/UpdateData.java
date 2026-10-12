package com.qlh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class UpdateData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Student set name = :name, age = :age, city = :city, gender = :gender where id = :id";

		MutationQuery mq = ss.createMutationQuery(hqlQuery);

		int id = 1;
		mq.setParameter("id", id);
		mq.setParameter("name", "Kiran");
		mq.setParameter("age", 25);
		mq.setParameter("city", "jalna");
		mq.setParameter("gender", "Male");

		mq.executeUpdate();

		tr.commit();
		System.out.println("Updated...");

	}
}
