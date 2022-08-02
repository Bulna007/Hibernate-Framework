package com.jpamf.test;

import com.jpamf.dao.SubscriberDao;
import com.jpamf.entities.Subscriber;
import com.jpamf.helper.EntityManagerFactoryRegistry;

public class JPAMFTest 
{
	public static void main(String[] args) 
	{
		SubscriberDao subscriberDao = null;
		Subscriber subscriber = null;
		
		try
		{
			subscriberDao = new SubscriberDao();
			subscriber = subscriberDao.getSubscriber(1);
			
			System.out.println(subscriber);
		}
		finally {
			EntityManagerFactoryRegistry.closeEmf();
		}
	}
}
