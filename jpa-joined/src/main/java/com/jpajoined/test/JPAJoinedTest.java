package com.jpajoined.test;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpajoined.entities.CardPayment;
import com.jpajoined.entities.ChequePayment;
import com.jpajoined.entities.Payment;
import com.jpajoined.helper.EntityManagerFactoryRegistry;

public class JPAJoinedTest 
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
			payment.setPaidDate(LocalDate.of(2022, 2, 22));*/
			
			/*CardPayment payment = new CardPayment();
			payment.setBankName("hdfc");
			payment.setBranchName("khagaria");
			payment.setDescription("main branch");
			payment.setPaidAmount(3000);
			payment.setPaidDate(LocalDate.of(2022, 11, 22));
			payment.setCardNo("2873 3278 3278");
			payment.setCardName("rupay");
			payment.setExpiryMonth(3);
			payment.setExpiryYear(2026);*/
			
			/*ChequePayment payment = new ChequePayment();
			payment.setBankName("hdfc");
			payment.setBranchName("khagaria");
			payment.setDescription("main branch");
			payment.setPaidAmount(5000);
			payment.setPaidDate(LocalDate.of(2022, 12, 22));
			payment.setChequeNo("hdfc871349");
			payment.setChequeHolderName("joseph");
			payment.setPayeeName("steve");
			payment.setIssuedDate(LocalDate.of(2022, 8, 22));*/
			
			/*entityManager.persist(payment);
			int paymentNo = payment.getPaymentNo();
			System.out.println("payment no : "+paymentNo);*/
			
			
			//CardPayment payment = entityManager.find(CardPayment.class, 2);
			Payment payment = entityManager.find(Payment.class, 1);
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
