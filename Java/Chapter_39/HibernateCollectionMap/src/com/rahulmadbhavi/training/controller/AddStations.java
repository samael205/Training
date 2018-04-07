
package com.rahulmadbhavi.training.controller;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rahulmadbhavi.training.beans.MetroStation;

public class AddStations
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		MetroStation metroStation;
		Map<String, String> stationDetails = new TreeMap<String, String>();
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Baiyappanahalli", stationDetails);
		session.persist(metroStation);

		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Swami Vivekananda Road", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Indiranagar", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Halasuru", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Trinity", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Mahatma Gandhi Road", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Underground");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Cubbon Park", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Underground");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Vidhana Soudha", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Underground");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Sir M. Visveshwaraya", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Underground");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Majestic", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Underground");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("City Railway Station", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Magadi Road", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Hosahalli", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Vijayanagar", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Attiguppe", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Deepanjali Nagar", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Purple");
		metroStation = new MetroStation("Mysore Road", stationDetails);
		session.persist(metroStation);

		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Nagasandra", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Dasarahalli", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Jalahalli", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Peenya Industry", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Peenya", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Yeshwanthpur Industry", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Yeshwanthpur", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Sandal Soap Factory", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Mahalakshmi", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Rajajinagar", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Kuvempu Road", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Srirampura", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Sampige Road", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Underground");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Majestic", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Underground");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Chickpet", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Underground");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Krishna Rajendra Market", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("National College", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Lalbagh", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Southend Circle", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Jayanagar", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Rashtreeya Vidyalaya Road", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Banashankari", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Jayaprakash Nagar", stationDetails);
		session.persist(metroStation);
		
		stationDetails= new TreeMap<String, String>();
		stationDetails.put("Platforms", "2");
		stationDetails.put("Type", "Elevated");
		stationDetails.put("Line", "Green");
		metroStation = new MetroStation("Yelachenahalli", stationDetails);
		session.persist(metroStation);
		
		transaction.commit();

		session.close();
		sessionFactory.close();
	}
}
