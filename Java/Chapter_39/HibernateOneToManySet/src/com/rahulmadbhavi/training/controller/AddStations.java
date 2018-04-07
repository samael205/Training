package com.rahulmadbhavi.training.controller;

import java.util.HashSet;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rahulmadbhavi.training.beans.MetroLine;
import com.rahulmadbhavi.training.beans.MetroStation;

public class AddStations
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();	
		
		Transaction transaction = session.beginTransaction();
		
		HashSet<MetroStation> purpleLineStations = new HashSet<MetroStation>();
		purpleLineStations.add(new MetroStation("Baiyappanahalli", false, 2));
		purpleLineStations.add(new MetroStation("Swami Vivekananda Road", false, 2));
		purpleLineStations.add(new MetroStation("Indiranagar", false, 2));
		purpleLineStations.add(new MetroStation("Halasuru", false, 2));
		purpleLineStations.add(new MetroStation("Trinity", false, 2));
		purpleLineStations.add(new MetroStation("Mahatma Gandhi Road", false, 2));
		purpleLineStations.add(new MetroStation("Cubbon Park", true, 2));
		purpleLineStations.add(new MetroStation("Vidhana Soudha", true, 2));
		purpleLineStations.add(new MetroStation("Sir M. Visveshwaraya", true, 2));
		purpleLineStations.add(new MetroStation("Majestic (Puple Line Station)", true, 2));
		purpleLineStations.add(new MetroStation("City Railway Station", true, 2));
		purpleLineStations.add(new MetroStation("Magadi Road", false, 2));
		purpleLineStations.add(new MetroStation("Hosahalli", false, 2));
		purpleLineStations.add(new MetroStation("Vijayanagar", false, 2));
		purpleLineStations.add(new MetroStation("Attiguppe", false, 2));
		purpleLineStations.add(new MetroStation("Deepanjali Nagar", false, 2));
		purpleLineStations.add(new MetroStation("Mysore Road", false, 2));
		
		HashSet<MetroStation> greenLineStations = new HashSet<MetroStation>();
		greenLineStations.add(new MetroStation("Nagasandra", false, 2));
		greenLineStations.add(new MetroStation("Dasarahalli", false, 2));
		greenLineStations.add(new MetroStation("Jalahalli", false, 2));
		greenLineStations.add(new MetroStation("Peenya Industry", false, 2));
		greenLineStations.add(new MetroStation("Peenya", false, 2));
		greenLineStations.add(new MetroStation("Yeshwanthpur Industry", false, 2));
		greenLineStations.add(new MetroStation("Yeshwanthpur", false, 2));
		greenLineStations.add(new MetroStation("Sandal Soap Factory", false, 2));
		greenLineStations.add(new MetroStation("Mahalakshmi", false, 2));
		greenLineStations.add(new MetroStation("Rajajinagar", false, 2));
		greenLineStations.add(new MetroStation("Kuvempu Road", false, 2));
		greenLineStations.add(new MetroStation("Srirampura", false, 2));
		greenLineStations.add(new MetroStation("Sampige Road", false, 2));
		greenLineStations.add(new MetroStation("Majestic (Green Line Station)", true, 2));
		greenLineStations.add(new MetroStation("Chickpet", true, 2));
		greenLineStations.add(new MetroStation("Krishna Rajendra Market", true, 2));
		greenLineStations.add(new MetroStation("National College", false, 2));
		greenLineStations.add(new MetroStation("Lalbagh", false, 2));
		greenLineStations.add(new MetroStation("Southend Circle", false, 2));
		greenLineStations.add(new MetroStation("Jayanagar", false, 2));
		greenLineStations.add(new MetroStation("Rashtreeya Vidyalaya Road", false, 2));
		greenLineStations.add(new MetroStation("Banashankari", false, 2));
		greenLineStations.add(new MetroStation("Jayaprakash Nagar", false, 2));
		greenLineStations.add(new MetroStation("Yelachenahalli", false, 2));
		
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
