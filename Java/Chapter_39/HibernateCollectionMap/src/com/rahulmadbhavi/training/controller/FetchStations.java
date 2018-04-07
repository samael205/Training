package com.rahulmadbhavi.training.controller;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rahulmadbhavi.training.beans.MetroStation;

public class FetchStations
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from MetroStation");
		@SuppressWarnings("unchecked")
		List<MetroStation> listOfStations = query.list();
		
		Iterator<MetroStation> iterator = listOfStations.iterator();
		MetroStation metroStation;
		
		while(iterator.hasNext())
		{
			metroStation = iterator.next();

			System.out.println(metroStation.getName() + " Metro Station (" + metroStation.getId() + ")");
			System.out.println(metroStation.getDetails());			
			System.out.println();
		}
		
		session.close();
		sessionFactory.close();		
	}
}
