package com.rahulmadbhavi.training.controller;

import java.util.HashSet;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rahulmadbhavi.training.beans.MetroLine;

public class AddStations
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		HashSet<String> purpleLineStations = new HashSet<String>();
		purpleLineStations.add("Baiyappanahalli");
		purpleLineStations.add("Swami Vivekananda Road");
		purpleLineStations.add("Indiranagar");
		purpleLineStations.add("Halasuru");
		purpleLineStations.add("Trinity");
		purpleLineStations.add("Mahatma Gandhi Road");
		purpleLineStations.add("Cubbon Park");
		purpleLineStations.add("Vidhana Soudha");
		purpleLineStations.add("Sir M. Visveshwaraya");
		purpleLineStations.add("Majestic");
		purpleLineStations.add("City Railway Station");
		purpleLineStations.add("Magadi Road");
		purpleLineStations.add("Hosahalli");
		purpleLineStations.add("Vijayanagar");
		purpleLineStations.add("Attiguppe");
		purpleLineStations.add("Deepanjali Nagar");
		purpleLineStations.add("Mysore Road");
		
		HashSet<String> greenLineStations = new HashSet<String>();
		greenLineStations.add("Nagasandra");
		greenLineStations.add("Dasarahalli");
		greenLineStations.add("Jalahalli");
		greenLineStations.add("Peenya Industry");
		greenLineStations.add("Peenya");
		greenLineStations.add("Yeshwanthpur Industry");
		greenLineStations.add("Yeshwanthpur");
		greenLineStations.add("Sandal Soap Factory");
		greenLineStations.add("Mahalakshmi");
		greenLineStations.add("Rajajinagar");
		greenLineStations.add("Kuvempu Road");
		greenLineStations.add("Srirampura");
		greenLineStations.add("Sampige Road");
		greenLineStations.add("Majestic");
		greenLineStations.add("Chickpet");
		greenLineStations.add("Krishna Rajendra Market");
		greenLineStations.add("National College");
		greenLineStations.add("Lalbagh");
		greenLineStations.add("Southend Circle");
		greenLineStations.add("Jayanagar");
		greenLineStations.add("Rashtreeya Vidyalaya Road");
		greenLineStations.add("Banashankari");
		greenLineStations.add("Jayaprakash Nagar");
		greenLineStations.add("Yelachenahalli");
		
		MetroLine purpleLine = new MetroLine();
		purpleLine.setColor("Purple");
		purpleLine.setStations(purpleLineStations);
		
		MetroLine greenLine = new MetroLine();
		greenLine.setColor("Green");
		greenLine.setStations(greenLineStations);
		
		session.persist(purpleLine);
		session.persist(greenLine);
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
	}
}
