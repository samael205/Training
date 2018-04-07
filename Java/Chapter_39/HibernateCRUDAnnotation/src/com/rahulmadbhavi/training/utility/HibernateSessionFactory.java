package com.rahulmadbhavi.training.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory
{
	private static final SessionFactory SESSION_FACTORY;
	
	static
	{
		SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		return SESSION_FACTORY;
	}
	
	public static void closeSessionFactory()
	{
		SESSION_FACTORY.close();
	}
}
