package com.hb3bs.test;

import com.hb3bs.dao.PolicyDao;
import com.hb3bs.entities.Policy;
import com.hb3bs.helper.ProgSessionFactoryRegistry;
import com.hb3bs.helper.PropsSessionFactoryRegistry;
import com.hb3bs.helper.XmlSessionFactoryRegistry;

public class HB3BSTest 
{
	public static void main(String[] args) 
	{
		PolicyDao policyDao = null;
		Policy policy = null;
		
		try
		{
			policyDao = new PolicyDao();
			policy = policyDao.getPolicy(1);
			
			System.out.println(policy);
		}
		finally {
			//XmlSessionFactoryRegistry.closeSessionFactory();
			
			//PropsSessionFactoryRegistry.closeSessionFactory();
		
			ProgSessionFactoryRegistry.closeSessionFactory();
		}
	}
}
