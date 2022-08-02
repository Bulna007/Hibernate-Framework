package com.hb3bs.entities;

import java.io.Serializable;

public class Policy implements Serializable
{
	protected int policyNo;
	protected String policyHolderName;
	protected String policyName;
	protected double premiumAmount;
	protected double insurredAmount;
	protected int tenure;
	public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public double getInsurredAmount() {
		return insurredAmount;
	}
	public void setInsurredAmount(double insurredAmount) {
		this.insurredAmount = insurredAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(insurredAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((policyHolderName == null) ? 0 : policyHolderName.hashCode());
		result = prime * result + ((policyName == null) ? 0 : policyName.hashCode());
		result = prime * result + policyNo;
		temp = Double.doubleToLongBits(premiumAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tenure;
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
		Policy other = (Policy) obj;
		if (Double.doubleToLongBits(insurredAmount) != Double.doubleToLongBits(other.insurredAmount))
			return false;
		if (policyHolderName == null) {
			if (other.policyHolderName != null)
				return false;
		} else if (!policyHolderName.equals(other.policyHolderName))
			return false;
		if (policyName == null) {
			if (other.policyName != null)
				return false;
		} else if (!policyName.equals(other.policyName))
			return false;
		if (policyNo != other.policyNo)
			return false;
		if (Double.doubleToLongBits(premiumAmount) != Double.doubleToLongBits(other.premiumAmount))
			return false;
		if (tenure != other.tenure)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", policyHolderName=" + policyHolderName + ", policyName=" + policyName
				+ ", premiumAmount=" + premiumAmount + ", insurredAmount=" + insurredAmount + ", tenure=" + tenure
				+ "]";
	}
}
