package com.idgen.entities;

import java.io.Serializable;

public class Vehicle implements Serializable
{
	//protected int vehicleNo;
	protected String vehicleNo;
	protected String modelName;
	protected String manufacturer;
	protected String registrationNo;
	protected String color;
	protected String fuelType;
	protected double leaseAmount;
	/*public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getModelName() {
		return modelName;
	}*/
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getLeaseAmount() {
		return leaseAmount;
	}
	public void setLeaseAmount(double leaseAmount) {
		this.leaseAmount = leaseAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(leaseAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + ((registrationNo == null) ? 0 : registrationNo.hashCode());
		result = prime * result + ((vehicleNo == null) ? 0 : vehicleNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (fuelType == null) {
			if (other.fuelType != null)
				return false;
		} else if (!fuelType.equals(other.fuelType))
			return false;
		if (Double.doubleToLongBits(leaseAmount) != Double.doubleToLongBits(other.leaseAmount))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (registrationNo == null) {
			if (other.registrationNo != null)
				return false;
		} else if (!registrationNo.equals(other.registrationNo))
			return false;
		if (vehicleNo == null) {
			if (other.vehicleNo != null)
				return false;
		} else if (!vehicleNo.equals(other.vehicleNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", modelName=" + modelName + ", manufacturer=" + manufacturer
				+ ", registrationNo=" + registrationNo + ", color=" + color + ", fuelType=" + fuelType
				+ ", leaseAmount=" + leaseAmount + "]";
	}
}
