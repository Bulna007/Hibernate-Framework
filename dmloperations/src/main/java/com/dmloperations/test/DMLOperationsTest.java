package com.dmloperations.test;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dmloperations.entities.Journey;
import com.dmloperations.helper.SessionFactoryRegistry;

public class DMLOperationsTest 
{
	public static void main(String[] args) 
	{
		Journey journey = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try
		{
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			
			/*journey = Journey.builder().journeyNo(1).source("Bangalore").destination("Hyderabad").hours(2)
					.commuteMode("air").amount(4000).journeyDate(LocalDate.of(2022, 10, 15)).build();
			
			// save(entityObject) method
			int journeyNo = (int)session.save(journey);
			int jno = journey.getJourneyNo();
			System.out.println(journeyNo);
			System.out.println("Entity Journey No : "+jno);*/
			
			// void persist(entityObject) method
			/*session.persist(journey);
			int journeyNo = journey.getJourneyNo();
			System.out.println(journeyNo);*/
			
			
			// void update(entityObject) method
			
			// 1. Partial Update : fetch the object from db and update some attribute
			
			/*journey = session.get(Journey.class, 1);
			journey.setCommuteMode("train");
			journey.setJourneyDate(LocalDate.of(2022, 9, 2));
			
			session.update(journey);*/
			
			// 2. Full Update : Create new object by populating existing id(primary key) and populate all the attribute
			
			/*journey = new Journey();
			journey.setJourneyNo(1);
			journey.setSource("Darbhanga");
			journey.setDestination("Hyderabad");
			journey.setCommuteMode("air");
			journey.setHours(3);
			journey.setJourneyDate(LocalDate.of(2022, 9, 15));
			journey.setAmount(6000);
			
			session.update(journey);*/
			
			// merge(entityObject) method
			
			/*Journey journey1 = session.get(Journey.class, 1);
			journey = new Journey();
			journey.setJourneyNo(1);
			journey.setSource("Darbhanga");
			journey.setDestination("Hyderabad");
			journey.setCommuteMode("air");
			journey.setHours(3);
			journey.setJourneyDate(LocalDate.of(2022, 9, 15));
			journey.setAmount(6500);
			
			Journey j = (Journey)session.merge(journey);
			System.out.println(j);*/
			
			// void delete(entityObject) method
			// 1. Get the object from db and pass it to delete() method
			
			/*journey = session.get(Journey.class, 2);
			session.delete(journey);*/
			
			// 2. Create an entity object by population primary key into that object and pass it to delete() method
			
			/*journey = Journey.builder().journeyNo(1).build();
			session.delete(journey);*/
			
			
			flag = true;
		}
		finally {
			if(transaction != null)
			{
				if(flag)
				{
					transaction.commit();
				}
				else
				{
					transaction.rollback();
				}
			}
			if(session != null)
				session.close();
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
