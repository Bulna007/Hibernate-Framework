package com.jpamf.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry 
{
	private static EntityManagerFactory emf;
	
	static
	{
		emf = Persistence.createEntityManagerFactory("subsPU");
	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static void closeEmf()
	{
		if(emf != null)
		{
			emf.close();
			emf = null;
		}
	}
	
}
