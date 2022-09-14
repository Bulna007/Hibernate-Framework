package com.manytoone.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manytoone.entities.Associate;
import com.manytoone.entities.AssociateLeave;
import com.manytoone.helper.SessionFactoryRegistry;

public class ManyToOneTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*Associate associate = new Associate();
			associate.setFullname("mate");
			associate.setDepartment("it");
			associate.setDesignation("se");
			associate.setJoinedDate(LocalDate.of(2021, 11, 22));		
			associate.setEmailAddress("mate@gmail.com");
			associate.setMobileNo("9238749234");		
			session.save(associate);
			
			AssociateLeave associateLeave1 = new AssociateLeave();
			associateLeave1.setLeaveType("Personal Leave");
			associateLeave1.setDescription("Personal Leave");
			associateLeave1.setStartDate(LocalDate.of(2022, 8, 12));
			associateLeave1.setEndDate(LocalDate.of(2022, 8, 15));
			associateLeave1.setLeaveStatus("Pending");
			associateLeave1.setAssociate(associate);
			session.save(associateLeave1);
			
			AssociateLeave associateLeave2 = new AssociateLeave();
			associateLeave2.setLeaveType("Medical Leave");
			associateLeave2.setDescription("Medical Leave");
			associateLeave2.setStartDate(LocalDate.of(2022, 9, 12));
			associateLeave2.setEndDate(LocalDate.of(2022, 9, 15));
			associateLeave2.setLeaveStatus("Pending");
			associateLeave2.setAssociate(associate);
			session.save(associateLeave2);*/
			
			AssociateLeave associateLeave = session.get(AssociateLeave.class, 1);
			System.out.println(associateLeave);
			
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
