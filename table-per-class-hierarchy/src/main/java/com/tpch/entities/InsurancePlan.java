package com.tpch.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class InsurancePlan implements Serializable
{
	protected int insurancePlanNo;
	protected String planName;
	protected String description;
	protected boolean taxSaver;
	protected double minInsurredAmount;
	public int getInsurancePlanNo() {
		return insurancePlanNo;
	}
	public void setInsurancePlanNo(int insurancePlanNo) {
		this.insurancePlanNo = insurancePlanNo;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isTaxSaver() {
		return taxSaver;
	}
	public void setTaxSaver(boolean taxSaver) {
		this.taxSaver = taxSaver;
	}
	public double getMinInsurredAmount() {
		return minInsurredAmount;
	}
	public void setMinInsurredAmount(double minInsurredAmount) {
		this.minInsurredAmount = minInsurredAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + insurancePlanNo;
		long temp;
		temp = Double.doubleToLongBits(minInsurredAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((planName == null) ? 0 : planName.hashCode());
		result = prime * result + (taxSaver ? 1231 : 1237);
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
		InsurancePlan other = (InsurancePlan) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (insurancePlanNo != other.insurancePlanNo)
			return false;
		if (Double.doubleToLongBits(minInsurredAmount) != Double.doubleToLongBits(other.minInsurredAmount))
			return false;
		if (planName == null) {
			if (other.planName != null)
				return false;
		} else if (!planName.equals(other.planName))
			return false;
		if (taxSaver != other.taxSaver)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InsurancePlan [insurancePlanNo=" + insurancePlanNo + ", planName=" + planName + ", description="
				+ description + ", taxSaver=" + taxSaver + ", minInsurredAmount=" + minInsurredAmount + "]";
	}
}
