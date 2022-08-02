package com.hb3bs.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgSessionFactoryRegistry 
{
	private static SessionFactory sessionFactory;
	
	static
	{
		try
		{
			Configuration configuration = new Configuration();
			configuration.setProperty("connection.driver", "oracle.jdbc.OracleDriver");
			configuration.setProperty("connection.url", "jdbc:oracle:thin:@localhost:1521:XE");
			configuration.setProperty("connection.user", "autolease");
			configuration.setProperty("connection.password", "root");
			configuration.setProperty("show_sql", "true");
			configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
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
