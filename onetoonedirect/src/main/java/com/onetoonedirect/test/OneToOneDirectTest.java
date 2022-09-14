package com.onetoonedirect.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.onetoonedirect.entities.InspectionReport;
import com.onetoonedirect.entities.VehicleInspection;
import com.onetoonedirect.helper.SessionFactoryRegistry;

public class OneToOneDirectTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			VehicleInspection vehicleInspection = new VehicleInspection();
			vehicleInspection.setRtaRegistrationNo("WB40W2666");
			vehicleInspection.setChasisNo("CH12345");
			vehicleInspection.setEngineNo("EN789123");
			vehicleInspection.setManufacturer("Bajaj");
			vehicleInspection.setModelName("Pulsar 180");
			vehicleInspection.setPurchaseDate(LocalDate.of(2017, 5, 30));
			vehicleInspection.setVehicleType("Two-Vheeler");
			session.save(vehicleInspection);
			
			InspectionReport inspectionReport = new InspectionReport();
			inspectionReport.setAgentName("John");
			inspectionReport.setDescription("Full Conditioned");
			inspectionReport.setObservations("Very Old Model");
			inspectionReport.setRating(4);
			inspectionReport.setReportDate(LocalDate.of(2021, 3, 24));
			inspectionReport.setReportExpiryDate(LocalDate.of(2021, 6, 30));
			inspectionReport.setValuation(25000);
			inspectionReport.setVehicleInspection(vehicleInspection);
			session.save(inspectionReport);
			
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
