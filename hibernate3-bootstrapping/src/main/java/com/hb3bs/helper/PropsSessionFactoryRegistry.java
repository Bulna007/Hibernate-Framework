package com.hb3bs.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropsSessionFactoryRegistry 
{
	private static SessionFactory sessionFactory;
	
	static
	{
		try
		{
			Configuration configuration = new Configuration();
			configuration.addResource("com/hb3bs/entities/Policy.hbm.xml");
			sessionFactory = configuration.buildSessionFactory();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory != null)
		{
			sessionFactory.close();
			sessionFactory = null;
		}
	}
}
