package com.jpaannon.test;

import java.time.LocalDate;

import com.jpaannon.dao.MobileBillDao;
import com.jpaannon.entities.MobileBill;
import com.jpaannon.helper.EntityManagerFactoryRegistry;

public class JPAAnnonTest 
{
	public static void main(String[] args) 
	{
		MobileBill mobileBill = null;
		MobileBillDao mobileBillDao = null;
		
		try
		{
			mobileBillDao = new MobileBillDao();
			
			mobileBill = new MobileBill();
			mobileBill.setBillNo(1);
			mobileBill.setSubscriberName("Peter");
			mobileBill.setSubscriptionType("postpaid");
			mobileBill.setBillDate(LocalDate.of(2022, 8, 04));
			mobileBill.setDueDate(LocalDate.of(2022, 8, 20));
			mobileBill.setBillAmount(515);
			mobileBill.setMobileNo("9048357834");
			
			boolean isInserted = mobileBillDao.saveMobileBill(mobileBill);
			
			if(isInserted)
				System.out.println("Mobile Bill has been saved");
			else
				System.out.println("Mobile Bill has not been saved");
		}
		finally {
			EntityManagerFactoryRegistry.closeEmf();
		}
	}
}
