package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.entity.Student;

public class UpdateData {

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
		Student s = session.get(Student.class,2);
		s.setName("AB");
		s.setMarks(67);
		tx.commit();
	}

}
