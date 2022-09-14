package com.otmoto.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmoto.entities.Account;
import com.otmoto.entities.Locker;
import com.otmoto.helper.SessionFactoryRegistry;

public class OTMOTOTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*Account account = new Account();
			account.setAccountHolderName("Steve");
			account.setAccountType("Current");
			account.setBranchCode("HDFC0001");
			account.setOppenedDate(LocalDate.of(2021, 3, 21));
			account.setBalance(2340000);
			
			int accountNo = (int)session.save(account);
			System.out.println("Account No : "+accountNo);*/
			
			/*Locker locker = new Locker();
			locker.setKeyNo("hdfc123");
			locker.setDimensions("10x10");
			locker.setCharges(3000);
			locker.setAccount(session.load(Account.class, 1));
			session.save(locker);*/
			
			/*Locker locker = session.get(Locker.class, 1);
			System.out.println(locker);*/
			
			Account account = session.get(Account.class, 1);
			System.out.println(account);
			
			flag = true;
		}finally {
			if(transaction != null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			if(session != null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
