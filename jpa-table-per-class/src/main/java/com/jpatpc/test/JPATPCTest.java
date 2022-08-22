package com.jpatpc.test;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpatpc.entities.CardPayment;
import com.jpatpc.entities.ChequePayment;
import com.jpatpc.entities.Payment;
import com.jpatpc.helper.EntityManagerFactoryRegistry;

public class JPATPCTest
{
	public static void main(String[] args) 
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
			
			/*Payment payment = new Payment();
			payment.setBankName("hdfc");
			payment.setBranchName("khagaria");
			payment.setDescription("main branch");
			payment.setPaidAmount(2000);
			payment.setPaidDate(LocalDate.of(2021, 12, 22));*/
			
			/*CardPayment payment = new CardPayment();
			payment.setBankName("hdfc");
			payment.setBranchName("khagaria");
			payment.setDescription("main branch");
			payment.setPaidAmount(2000);
			payment.setPaidDate(LocalDate.of(2021, 12, 22));
			payment.setCardNo("683783426761");
			payment.setCardHolderName("Adam");
			payment.setExpiryYear(2027);
			payment.setExpiryMonth(4);
			payment.setIssuedBank("Citibank");*/
			
			/*ChequePayment payment = new ChequePayment();
			payment.setBankName("hdfc");
			payment.setBranchName("khagaria");
			payment.setDescription("main branch");
			payment.setPaidAmount(2000);
			payment.setPaidDate(LocalDate.of(2021, 12, 22));
			payment.setChequeHolderName("steve");
			payment.setPayeeName("Lal Jewellerys");
			payment.setChequeNo("BL38933");
			payment.setIssuedDate(LocalDate.of(2022, 8, 22));
			entityManager.persist(payment);*/
			
			/*int paymentNo = payment.getPaymentNo();
			System.out.println("payment no: "+paymentNo);*/
			
			
			//Payment payment = entityManager.find(Payment.class, 3);
			
			
			Payment payment = entityManager.find(ChequePayment.class, 5);
			System.out.println(payment);
				
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
			EntityManagerFactoryRegistry.closeEmf();
		}
	}
}
