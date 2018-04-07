package com.rahulmadbhavi.training.controller;

import java.util.TreeMap;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rahulmadbhavi.training.beans.MetroLine;
import com.rahulmadbhavi.training.beans.MetroStation;

public class AddLines
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		MetroStation stationSampigeRoad = new MetroStation("Sampige Road", 2, "Elevated"); 
		MetroStation stationChickpet = new MetroStation("Chickpet", 2, "Underground");
		
		MetroStation stationMajestic = new MetroStation("Majestic", 4, "Underground");

		MetroStation stationSirMVisveshwaraya = new MetroStation("Sir M. Visveshwaraya", 2, "Underground");
		MetroStation stationKSR = new MetroStation("City Railway Station", 2, "Underground");
		
		TreeMap<String, MetroStation> stations;
		MetroLine metroLine;
		
		stations = new TreeMap<String, MetroStation>();
		stations.put(stationSampigeRoad.getName(), stationSampigeRoad);
		stations.put(stationMajestic.getName(), stationMajestic);
		stations.put(stationChickpet.getName(), stationChickpet);
		
		metroLine = new MetroLine("Purple", stations);
		session.persist(metroLine);
		
		stations = new TreeMap<String, MetroStation>();
		stations.put(stationSirMVisveshwaraya.getName(), stationSirMVisveshwaraya);
		stations.put(stationMajestic.getName(), stationMajestic);
		stations.put(stationKSR.getName(), stationKSR);
		
		metroLine = new MetroLine("Green", stations);
		session.persist(metroLine);
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();		
	}
}
