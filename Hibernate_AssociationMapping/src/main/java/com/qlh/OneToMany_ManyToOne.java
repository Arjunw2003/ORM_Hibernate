package com.qlh;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Books;
import com.entity.Library;

public class OneToMany_ManyToOne {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);
		cfg.addAnnotatedClass(Books.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Library l = new Library();
		l.setLibName("SSL");

		Books b1 = new Books();
		b1.setbName("java");
		b1.setLibrary(l);

		Books b2 = new Books();
		b2.setbName("Python");
		b2.setLibrary(l);

		List<Books> books = new ArrayList<Books>();
		books.add(b1);
		books.add(b2);

		l.setBooks(books);

		ss.persist(b1);
		ss.persist(b2);
		ss.persist(l);

		tr.commit();

		System.out.println("Inserted....");

	}


}
