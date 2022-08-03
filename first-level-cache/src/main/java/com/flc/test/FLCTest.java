package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.flc.entities.Ride;
import com.flc.helper.SessionFactoryRegistry;

public class FLCTest 
{
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = null;
		Session session = null;
		Ride ride1 = null;
		Ride ride2 = null;
		
		try
		{
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			
			// since we are fetching the record first time so it will go to the db and cache the record
			ride1 = session.get(Ride.class, 1);
			System.out.println(ride1);
			
			ride2 = session.get(Ride.class, 2);
			System.out.println(ride2);
			
			// since the object with pk 1 is already there in cache, so it will not hit the db, directly from cache it will return the object
			Ride ride = session.get(Ride.class, 1);
			System.out.println(ride);
			
		}
		finally {
			if(session != null)
				session.close();
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
