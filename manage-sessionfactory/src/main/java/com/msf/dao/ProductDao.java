package com.msf.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.msf.entities.Product;

public class ProductDao 
{
	public Product getProduct(SessionFactory sessionFactory, int productNo)
	{
		Product product = null;
		Session session = null;
		
		try
		{
			session = sessionFactory.openSession();
			product = session.get(Product.class, productNo);
		}
		finally {
			if(session != null)
				session.close();
		}
		return product;
	}
}
