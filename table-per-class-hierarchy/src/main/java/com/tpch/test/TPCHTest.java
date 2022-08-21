package com.tpch.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpch.entities.AccidentalInsurancePlan;
import com.tpch.entities.InsurancePlan;
import com.tpch.entities.MedicalInsurancePlan;
import com.tpch.helper.SessionFactoryRegistry;

public class TPCHTest
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
			insurancePlan.setDescription("Jeevan");
			insurancePlan.setTaxSaver(true);
			insurancePlan.setMinInsurredAmount(300000);*/
			
			/*MedicalInsurancePlan insurancePlan = new MedicalInsurancePlan();
			insurancePlan.setPlanName("Health Insurance");
			insurancePlan.setDescription("Health is Wealth");
			insurancePlan.setTaxSaver(true);
			insurancePlan.setMinInsurredAmount(200000);
			insurancePlan.setCoPay(2);
			insurancePlan.setNetworkType("in-network");*/
			
			/*AccidentalInsurancePlan insurancePlan = new AccidentalInsurancePlan();
			insurancePlan.setPlanName("Accidental Beema");
			insurancePlan.setDescription("Accident Plan");
			insurancePlan.setTaxSaver(false);
			insurancePlan.setMinInsurredAmount(100000);
			insurancePlan.setCoverageType("partial");
			insurancePlan.setDisabilityCoveragePercentage(50);*/
			
			/*int planNo = (int)session.save(insurancePlan);
			System.out.println("Plan no: "+planNo);*/
			
			//AccidentalInsurancePlan insurancePlan = session.get(AccidentalInsurancePlan.class, 3);
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
