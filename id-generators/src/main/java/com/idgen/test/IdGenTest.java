package com.idgen.test;

import com.idgen.dao.VehicleDao;
import com.idgen.entities.Vehicle;
import com.idgen.helper.SessionFactoryRegistry;

public class IdGenTest 
{
	public static void main(String[] args) 
	{
		VehicleDao vehicleDao = null;
		Vehicle vehicle = null;
		
		try
		{
			vehicle = new Vehicle();
			//vehicle.setVehicleNo(2);
			vehicle.setManufacturer("bajaj");
			vehicle.setModelName("platina");
			vehicle.setColor("blue");
			vehicle.setFuelType("petrol");
			vehicle.setLeaseAmount(25000);
			vehicle.setRegistrationNo("wb30w3456");
			
			vehicleDao = new VehicleDao();
			//int vehhicleNo = vehicleDao.saveVehicle(vehicle);
			String vehhicleNo = vehicleDao.saveVehicle(vehicle);
			System.out.println(vehhicleNo);
			
		}
		finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
