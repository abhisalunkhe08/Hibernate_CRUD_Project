package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.entity.Student;

public class Client {
     public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		
		
		cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		session=sf.openSession();
		tx=session.beginTransaction();
		Student s = new Student();
		s.setName("Abhi");
		s.setMarks(99);
		s.setRollNo(8);
		session.save(s);
		tx.commit();
		
		
	}
}
