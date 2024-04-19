package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.entity.Student;

public class GetData {
	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory sf=null;
		Session session=null;
		
		
		
		cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		session=sf.openSession();
		Student s = session.get(Student.class,3);
		System.out.println(s);
	}

}
