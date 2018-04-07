
package com.rahulmadbhavi.training.daos;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.rahulmadbhavi.training.beans.Candidate;
import com.rahulmadbhavi.training.utility.CommonScanner;

public class SchoolDAO
{
	public void insert()
	{
		int rollno;
		String name;
		String jDate;
		Date jdt;
		String std;
		double fees;

		System.out.print("Roll Number : ");
		rollno = CommonScanner.getScanner().nextInt();

		System.out.print("Candidate Name : ");
		name = CommonScanner.getScanner().nextLine();

		System.out.print("Joining Date (yyyy-mm-dd format only) : ");
		jDate = CommonScanner.getScanner().next();
		jdt = Date.valueOf(jDate);

		System.out.print("Class : ");
		std = CommonScanner.getScanner().next();

		System.out.print("Fees : ");
		fees = CommonScanner.getScanner().nextDouble();

		Candidate candidate = new Candidate();

		candidate.setRollno(rollno);
		candidate.setName(name);
		candidate.setJdt(jdt);
		candidate.setStd(std);
		candidate.setFees(fees);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(candidate);
		session.getTransaction().commit();

		session.close();
		sessionFactory.close();
	}

	public int update()
	{
		int rollno;
		Candidate candidate;

		System.out.print("Roll Number : ");
		rollno = CommonScanner.getScanner().nextInt();

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		candidate = (Candidate) session.get(Candidate.class, rollno);

		System.out.println("Roll Number : " + candidate.getRollno());
		System.out.println("Name : " + candidate.getName());
		System.out.println("Joining Date : " + candidate.getJdt());
		System.out.println("Class : " + candidate.getStd());
		System.out.println("Fees : " + candidate.getFees());

		System.out.println();

		System.out.print("Enter new fees : ");
		float fees = CommonScanner.getScanner().nextFloat();
		
		String hql = "update Candidate set fees=:newfees where rollno=:varrollno";

		Query query = session.createQuery(hql);
		query.setFloat("newfees", fees);
		query.setInteger("varrollno", rollno);

		int status = query.executeUpdate();

		if(status == 1)
		{
			System.out.println("Record Updated.");
		}
		else
		{
			System.out.println("Record not found.");
		}

		session.getTransaction().commit();

		session.close();
		sessionFactory.close();

		return status;
	}

	public int delete()
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		int rollno;

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		System.out.print("Roll Number : ");
		rollno = CommonScanner.getScanner().nextInt();

		String hql = "delete from Candidate where rollno=" + rollno;

		Query query = session.createQuery(hql);

		int status = query.executeUpdate();

		if(status == 1)
		{
			System.out.println("Record deleted.");
		}
		else
		{
			System.out.println("Record not found.");
		}

		tx.commit();

		session.close();
		sessionFactory.close();

		return status;
	}

	public List<Candidate> selectOne()
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		System.out.print("Roll Number : ");
		int rollno = CommonScanner.getScanner().nextInt();

		Query query = session.createQuery("from Candidate where rollno = :rollno");

		query.setInteger("rollno", rollno);

		@SuppressWarnings("unchecked")
		List<Candidate> list = query.list();

		for(Iterator<Candidate> iterator = list.iterator(); iterator.hasNext();)
		{
			Candidate candidate = (Candidate) iterator.next();

			System.out.println("------------------------------");
			System.out.println("RollNo :" + candidate.getRollno());
			System.out.println("Candidate Name :" + candidate.getName());
			System.out.println("Joining Date :" + candidate.getJdt());
			System.out.println("Class :" + candidate.getStd());
			System.out.println("Fees :" + candidate.getFees());
			System.out.println("*******************************");
		}

		session.close();
		sessionFactory.close();
		
		return list;
	}

	public List<Candidate> selectAll()
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Candidate");
		
		@SuppressWarnings("unchecked")
		List<Candidate> list = query.list();
		
		for(Iterator<Candidate> iterator = list.iterator(); iterator.hasNext();)
		{
			Candidate candidate = (Candidate) iterator.next();
			System.out.println("------------------------------");
			System.out.println("Roll No :" + candidate.getRollno());
			System.out.println("Candidate Name :" + candidate.getName());
			System.out.println("Joining Date :" + candidate.getJdt());
			System.out.println("Class :" + candidate.getStd());
			System.out.println("Fees :" + candidate.getFees());
			System.out.println("******************************");
		}
		
		session.close();
		sessionFactory.close();
		
		return list;
	}
}
