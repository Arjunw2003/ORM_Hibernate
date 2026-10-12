package com.qlh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class DeleteData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "delete from Student where id = : id";

		MutationQuery mq = ss.createMutationQuery(hqlQuery);

		int id = 2;
		mq.setParameter("id", id);

		mq.executeUpdate();

		tr.commit();

		System.out.println("Deleted....");
	}
}
