package com.tpcc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpcc.entities.AccidentalInsurancePlan;
import com.tpcc.entities.InsurancePlan;
import com.tpcc.entities.MedicalInsurancePlan;
import com.tpcc.helper.SessionFactoryRegistry;

public class TPCCTest 
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
			insurancePlan.setPlanName("Jeevan Beema");
			insurancePlan.setDescription("All In One");
			insurancePlan.setTaxSaver(false);
			insurancePlan.setMinInsurredAmount(100000);*/
			
			/*MedicalInsurancePlan insurancePlan = new MedicalInsurancePlan();
			insurancePlan.setPlanName("Health Beema");
			insurancePlan.setDescription("Health Plan");
			insurancePlan.setTaxSaver(true);
			insurancePlan.setMinInsurredAmount(200000);
			insurancePlan.setCopay(3);
			insurancePlan.setNetworkType("in-network");*/
			
			/*AccidentalInsurancePlan insurancePlan = new AccidentalInsurancePlan();
			insurancePlan.setPlanName("Accident Beema");
			insurancePlan.setDescription("Accident Plan");
			insurancePlan.setTaxSaver(false);
			insurancePlan.setMinInsurredAmount(150000);
			insurancePlan.setDisabilityCoveragePercentage(20);
			insurancePlan.setCoverageType("nominee");*/
			
			/*int planNo = (int)session.save(insurancePlan);
			System.out.println("plan no: "+planNo);*/
			
			//MedicalInsurancePlan insurancePlan = session.get(MedicalInsurancePlan.class, 2);
			InsurancePlan insurancePlan = session.get(InsurancePlan.class, 1);
			
			System.out.println(insurancePlan);
			
			flag = true;
		}
		finally {
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
