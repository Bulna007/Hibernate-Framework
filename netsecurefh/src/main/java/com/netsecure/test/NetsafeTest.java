package com.netsecure.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.netsecure.entities.Account;

public class NetsafeTest 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = null;
		Configuration configuration = null;
		Session session = null;
		Account account = null;
		
		try
		{
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			
			account = session.get(Account.class, 1);
			System.out.println(account);
			
		}
		finally
		{
			if(session != null)
			{
				session.close();
			}
			if(sessionFactory != null)
			{
				sessionFactory.close();
			}
		}
	}
}
