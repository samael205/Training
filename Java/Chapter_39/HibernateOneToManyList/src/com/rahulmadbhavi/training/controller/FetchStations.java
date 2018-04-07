package com.rahulmadbhavi.training.controller;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rahulmadbhavi.training.beans.MetroLine;
import com.rahulmadbhavi.training.beans.MetroStation;

public class FetchStations
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from MetroLine");
		@SuppressWarnings("unchecked")
		List<MetroLine> listOfStations = query.list();
		
		Iterator<MetroLine> iterator = listOfStations.iterator();
		MetroLine metroLine;
		
		while(iterator.hasNext())
		{
			metroLine = iterator.next();
			
			System.out.println(metroLine.getColor() + " Metro Line");
			System.out.println("Line ID : " + metroLine.getId());
			System.out.println("Stations : ");
			
			Iterator<MetroStation> localIterator = metroLine.getStations().iterator();
			int counter = 1;
			MetroStation metroStation;
			while(localIterator.hasNext())
			{
				metroStation = localIterator.next();
				System.out.println(String.format("%-2d. ", counter++) + metroStation.getName() + "(" + metroStation.getId() + ")(" + metroStation.getUnderground() + ")(" + metroStation.getPlatforms() + ")");
			}
			
			System.out.println();
		}
		
		session.close();
		sessionFactory.close();		
	}
}
