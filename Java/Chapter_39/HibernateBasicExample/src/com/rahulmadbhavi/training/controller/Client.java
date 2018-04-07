
package com.rahulmadbhavi.training.controller;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rahulmadbhavi.training.beans.Student;
import com.rahulmadbhavi.training.utility.HibernateUtil;

public class Client
{
	public static void main(String[] args)
	{
		BasicConfigurator.configure();
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = null;
		
		try
		{
			tx = session.beginTransaction();
			
			Student student = new Student();
			student.setId(33);
			student.setName("Test");
			session.save(student);
			
			tx.commit();
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			HibernateUtil.closeSessionFactory();
		}
	}
}
