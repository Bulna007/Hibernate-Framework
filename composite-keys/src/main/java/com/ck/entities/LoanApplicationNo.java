package com.ck.entities;

import java.io.Serializable;

public class LoanApplicationNo implements Serializable
{
	protected int applicationNo;
	protected String branchCode;
	public int getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(int applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + applicationNo;
		result = prime * result + ((branchCode == null) ? 0 : branchCode.hashCode());
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
		LoanApplicationNo other = (LoanApplicationNo) obj;
		if (applicationNo != other.applicationNo)
			return false;
		if (branchCode == null) {
			if (other.branchCode != null)
				return false;
		} else if (!branchCode.equals(other.branchCode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LoanApplicationNo [applicationNo=" + applicationNo + ", branchCode=" + branchCode + "]";
	}
}
