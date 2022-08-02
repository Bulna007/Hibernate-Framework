package com.htx.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.htx.entities.Branch;

public class BranchDao 
{
	public boolean saveBranch(Branch branch, SessionFactory sessionFactory)
	{
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try
		{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			session.save(branch);
			
			flag = true;
		}
		finally {
			try
			{
				if(transaction != null)
				{
					if(flag == true)
					{
						transaction.commit();
					}
					else
					{
						transaction.rollback();
					}
				}
			}
			finally {}
			
			try
			{
				if(session != null)
					session.close();
			}
			finally {}
		}
		return flag;
	}
}
