package com.onetomanyset.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.onetomanyset.entities.Account;
import com.onetomanyset.entities.Address;
import com.onetomanyset.helper.SessionFactoryRegistry;

public class OneToManySetTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Set<Address> addresses = null;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			Address address1 = new Address();
			address1.setAddressLine1("M G Road");
			address1.setAddressLine2("New Market");
			address1.setCity("Bangalore");
			address1.setZip("400078");
			address1.setState("Karnataka");
			session.save(address1);
			
			Address address2 = new Address();
			address2.setAddressLine1("Hebbal");
			address2.setAddressLine2("Nagavara");
			address2.setCity("Bangalore");
			address2.setZip("400078");
			address2.setState("Karnataka");
			session.save(address2);
			
			Account account = new Account();
			account.setAccountHolderName("John");
			account.setAccountType("Savings");
			account.setBalance(230000);
			account.setOppenedDate(LocalDate.of(2021, 7, 30));
			
			addresses = new HashSet<>();
			addresses.add(address1);
			addresses.add(address2);
			
			account.setAddresses(addresses);
			
			session.save(account);
			
			/*Account account = session.get(Account.class, 1);
			System.out.println(account);*/
			
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
