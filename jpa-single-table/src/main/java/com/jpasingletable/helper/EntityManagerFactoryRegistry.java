package com.jpasingletable.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry 
{
	private static EntityManagerFactory emf;
	static
	{
		try
		{
			emf = Persistence.createEntityManagerFactory("jpastpu");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
