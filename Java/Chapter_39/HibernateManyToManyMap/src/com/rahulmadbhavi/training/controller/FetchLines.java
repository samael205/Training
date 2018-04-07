package com.rahulmadbhavi.training.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rahulmadbhavi.training.beans.MetroLine;
import com.rahulmadbhavi.training.beans.MetroStation;

public class FetchLines
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from MetroLine");
		@SuppressWarnings("unchecked")
		List<MetroLine> listOfLines = query.list();
		
		Iterator<MetroLine> iterator = listOfLines.iterator();
		MetroLine metroLine;
		Map<String, MetroStation> stationMap;
		MetroStation metroStation;
		String station;
		
		while(iterator.hasNext())
		{
			metroLine = iterator.next();
			stationMap = metroLine.getStations();

			System.out.println(metroLine.getName() + " (" + metroLine.getId() + ")");
			
			for(Map.Entry<String, MetroStation> entry : stationMap.entrySet())
			{
				station = entry.getKey();
				metroStation = entry.getValue();
				
				System.out.println(station + "(ID : " + metroStation.getId() + ")(Platforms : " + metroStation.getPlatforms() + ")(Type : " + metroStation.getType() + ")");
			}
			
			System.out.println();
			
		}
		
		session.close();
		sessionFactory.close();		
	}
}
