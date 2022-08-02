package com.jpaannon.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpaannon.entities.MobileBill;
import com.jpaannon.helper.EntityManagerFactoryRegistry;

public class MobileBillDao 
{
	public boolean saveMobileBill(MobileBill mobileBill)
	{
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		boolean flag = false;
		
		try
		{
			entityManagerFactory = EntityManagerFactoryRegistry.getEmf();
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(mobileBill);
			flag = true;
		}
		finally {
			if(entityTransaction != null)
			{
				if(flag)
					entityTransaction.commit();
				else
					entityTransaction.rollback();
			}
			if(entityManager != null)
				entityManager.close();
		}
		return flag;
	}
}
