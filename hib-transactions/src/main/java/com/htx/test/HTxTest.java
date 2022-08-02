package com.htx.test;

import org.hibernate.SessionFactory;

import com.htx.dao.BranchDao;
import com.htx.entities.Branch;
import com.htx.helper.SessionFactoryRegistry;

public class HTxTest 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = null;
		BranchDao branchDao = null;
		Branch branch = null;
		
		try
		{
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			
			branch = new Branch();
			branch.setBranchNo(1);
			branch.setBranchName("hebbal");
			branch.setIfscCode("hdfcxxx");
			branch.setWorkingHours("09:00-16:00");
			branch.setLocation("Bangalore");
			branch.setContactNo("9873022898");
			
			branchDao = new BranchDao();
			boolean isPersisted = branchDao.saveBranch(branch, sessionFactory);
			
			if(isPersisted)
			{
				System.out.println("Branch has been persisted");
			}
			else
			{
				System.out.println("Branch has not been persisted");
			}
		}
		finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
