package com.idgen.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idgen.entities.Vehicle;
import com.idgen.helper.SessionFactoryRegistry;

public class VehicleDao 
{
	public String saveVehicle(Vehicle vehicle)
	{
		String vehicleNo = "";
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try
		{
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			vehicleNo = (String) session.save(vehicle);
			
			flag = true;
		}
		finally {
			if(transaction != null)
			{
				if(flag)
					transaction.commit();
				else
					transaction.rollback();
			}
			if(session != null)
				session.close();
			SessionFactoryRegistry.closeSessionFactory();
		}
		return vehicleNo;
	}

		
	/*public int saveVehicle(Vehicle vehicle)
	{
		int vehicleNo = 0;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try
		{
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			vehicleNo = (int)session.save(vehicle);
			
			flag = true;
		}
		finally {
			if(transaction != null)
			{
				if(flag)
					transaction.commit();
				else
					transaction.rollback();
			}
			if(session != null)
				session.close();
			SessionFactoryRegistry.closeSessionFactory();
		}
		return vehicleNo;
	}*/
}
