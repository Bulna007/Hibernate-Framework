package com.jpasingletable.test;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpasingletable.entities.CardPayment;
import com.jpasingletable.entities.ChequePayment;
import com.jpasingletable.entities.Payment;
import com.jpasingletable.helper.EntityManagerFactoryRegistry;

public class JPASTTest 
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
			payment.setPaidAmount(5000);
			payment.setPaidDate(LocalDate.of(2022, 9, 22));*/
			
			/*CardPayment payment = new CardPayment();
			payment.setBankName("hdfc");
			payment.setBranchName("khagaria");
			payment.setDescription("main branch");
			payment.setPaidAmount(7000);
			payment.setPaidDate(LocalDate.of(2022, 8, 22));
			payment.setCardNo("8758 3894 3943");
			payment.setCardName("rupay");
			payment.setExpiryMonth(6);
			payment.setExpiryYear(25);*/
			
			/*ChequePayment payment = new ChequePayment();
			payment.setBankName("hdfc");
			payment.setBranchName("khagaria");
			payment.setDescription("main branch");
			payment.setPaidAmount(3000);
			payment.setPaidDate(LocalDate.of(2022, 9, 22));
			payment.setChequeNo("hdfc0983843");
			payment.setChequeHolderName("Joseph");
			payment.setPayeeName("Steve");
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
