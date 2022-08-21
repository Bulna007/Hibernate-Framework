package com.tpch.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class MedicalInsurancePlan extends InsurancePlan
{
	protected int coPay;
	protected String networkType;
	public int getCoPay() {
		return coPay;
	}
	public void setCoPay(int coPay) {
		this.coPay = coPay;
	}
	public String getNetworkType() {
		return networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + coPay;
		result = prime * result + ((networkType == null) ? 0 : networkType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicalInsurancePlan other = (MedicalInsurancePlan) obj;
		if (coPay != other.coPay)
			return false;
		if (networkType == null) {
			if (other.networkType != null)
				return false;
		} else if (!networkType.equals(other.networkType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MedicalInsurancePlan [coPay=" + coPay + ", networkType=" + networkType + ", insurancePlanNo="
				+ insurancePlanNo + ", planName=" + planName + ", description=" + description + ", taxSaver=" + taxSaver
				+ ", minInsurredAmount=" + minInsurredAmount + "]";
	}
}
