package com.rahulmadbhavi.training.controller;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rahulmadbhavi.training.beans.Student;

public class Demo
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		Student student = new Student();
		
		student.setId(1001);
		student.setName("Test Name");
		student.setFees(123456.78);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(student);
		
		transaction.commit();
		
		System.out.println("Successfully saved.");
		
		session.flush();
		session.close();
		sessionFactory.close();
	}
}
