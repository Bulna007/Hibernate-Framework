package com.getvsload.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.getvsload.entities.Customer;
import com.getvsload.entities.ICustomer;
import com.getvsload.helper.SessionFactoryRegistry;

public class GetVsLoadTest 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = null;
		Session session = null;
		Customer customer = null;
		
		try
		{
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			
			//customer = session.get(Customer.class, 1);
			//customer = session.load(Customer.class, 1);
			//session.close();
			ICustomer iCustomer = session.load(Customer.class, 1);
			System.out.println(iCustomer.getCustomerNo());
			//System.out.println(customer.getCustomerName());
		}
		finally {
			if(session != null)
				session.close();
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
