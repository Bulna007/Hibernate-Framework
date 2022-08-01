package com.msf.test;

import org.hibernate.SessionFactory;

import com.msf.dao.ProductDao;
import com.msf.entities.Product;
import com.msf.helper.SessionFactoryRegistry;

public class ManageSessionFactoryTest 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = null;
		ProductDao productDao = null;
		Product product = null;
		
		try
		{
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			productDao = new ProductDao();
			
			product = productDao.getProduct(sessionFactory, 1);
			
			System.out.println(product);
		}
		finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
