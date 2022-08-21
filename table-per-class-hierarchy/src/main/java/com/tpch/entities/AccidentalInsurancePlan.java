package com.tpch.entities;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class AccidentalInsurancePlan extends InsurancePlan
{
	protected String coverageType;
	protected double disabilityCoveragePercentage;
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public double getDisabilityCoveragePercentage() {
		return disabilityCoveragePercentage;
	}
	public void setDisabilityCoveragePercentage(double disabilityCoveragePercentage) {
		this.disabilityCoveragePercentage = disabilityCoveragePercentage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((coverageType == null) ? 0 : coverageType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(disabilityCoveragePercentage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		AccidentalInsurancePlan other = (AccidentalInsurancePlan) obj;
		if (coverageType == null) {
			if (other.coverageType != null)
				return false;
		} else if (!coverageType.equals(other.coverageType))
			return false;
		if (Double.doubleToLongBits(disabilityCoveragePercentage) != Double
				.doubleToLongBits(other.disabilityCoveragePercentage))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AccidentalInsurancePlan [coverageType=" + coverageType + ", disabilityCoveragePercentage="
				+ disabilityCoveragePercentage + ", insurancePlanNo=" + insurancePlanNo + ", planName=" + planName
				+ ", description=" + description + ", taxSaver=" + taxSaver + ", minInsurredAmount=" + minInsurredAmount
				+ "]";
	}
}
