package com.ck.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class LoanApplication implements Serializable
{
	protected LoanApplicationNo loanApplicationNo;
	protected String applicantName;
	protected String loanType;
	protected double loanAmount;
	protected LocalDate appliedDate;
	protected LocalDate dob;
	protected String gender;
	public LoanApplicationNo getLoanApplicationNo() {
		return loanApplicationNo;
	}
	public void setLoanApplicationNo(LoanApplicationNo loanApplicationNo) {
		this.loanApplicationNo = loanApplicationNo;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public LocalDate getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicantName == null) ? 0 : applicantName.hashCode());
		result = prime * result + ((appliedDate == null) ? 0 : appliedDate.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		long temp;
		temp = Double.doubleToLongBits(loanAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((loanApplicationNo == null) ? 0 : loanApplicationNo.hashCode());
		result = prime * result + ((loanType == null) ? 0 : loanType.hashCode());
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
		LoanApplication other = (LoanApplication) obj;
		if (applicantName == null) {
			if (other.applicantName != null)
				return false;
		} else if (!applicantName.equals(other.applicantName))
			return false;
		if (appliedDate == null) {
			if (other.appliedDate != null)
				return false;
		} else if (!appliedDate.equals(other.appliedDate))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (Double.doubleToLongBits(loanAmount) != Double.doubleToLongBits(other.loanAmount))
			return false;
		if (loanApplicationNo == null) {
			if (other.loanApplicationNo != null)
				return false;
		} else if (!loanApplicationNo.equals(other.loanApplicationNo))
			return false;
		if (loanType == null) {
			if (other.loanType != null)
				return false;
		} else if (!loanType.equals(other.loanType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LoanApplication [loanApplicationNo=" + loanApplicationNo + ", applicantName=" + applicantName
				+ ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", appliedDate=" + appliedDate + ", dob="
				+ dob + ", gender=" + gender + "]";
	}
}
