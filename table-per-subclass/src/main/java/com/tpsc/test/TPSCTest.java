package com.tpsc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpsc.entities.AccidentalInsurancePlan;
import com.tpsc.entities.InsurancePlan;
import com.tpsc.entities.MedicalInsurancePlan;
import com.tpsc.helper.SessionFactoryRegistry;

public class TPSCTest 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try
		{
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*InsurancePlan insurancePlan = new InsurancePlan();
			insurancePlan.setPlanName("jeevan Beema");
			insurancePlan.setDescription("All in One");
			insurancePlan.setTaxSaver(true);
			insurancePlan.setMinInsurredAmount(200000);*/
			
			/*MedicalInsurancePlan insurancePlan = new MedicalInsurancePlan();
			insurancePlan.setPlanName("Health Beema");
			insurancePlan.setDescription("Senior Citizen Plan");
			insurancePlan.setTaxSaver(false);
			insurancePlan.setMinInsurredAmount(100000);
			insurancePlan.setCopay(10);
			insurancePlan.setNetworkType("in-network");*/
			
			/*AccidentalInsurancePlan insurancePlan = new AccidentalInsurancePlan();
			insurancePlan.setPlanName("Accident Beema");
			insurancePlan.setDescription("Ride Anywhere");
			insurancePlan.setTaxSaver(false);
			insurancePlan.setMinInsurredAmount(100000);
			insurancePlan.setCoverageType("nominee");
			insurancePlan.setDisabilityCoveragePercentage(15);*/
			
			/*int planNo = (int)session.save(insurancePlan);
			System.out.println("plan no: "+planNo);*/
			
			//AccidentalInsurancePlan insurancePlan = session.get(AccidentalInsurancePlan.class, 3);
			InsurancePlan insurancePlan = session.get(InsurancePlan.class, 3);
			System.out.println(insurancePlan);
			
			
			flag = true;
		}
		finally
		{
			if(transaction != null)
			{
				if(flag)
					transaction.commit();
				else
					transaction.rollback();
			}
			if(session != null)
				session.close();
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
