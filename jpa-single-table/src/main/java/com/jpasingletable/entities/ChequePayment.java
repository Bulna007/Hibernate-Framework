package com.jpasingletable.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="cheque")
public class ChequePayment extends Payment
{
	@Column(name="cheque_no")
	protected String chequeNo;
	@Column(name="cheque_holder_nm")
	protected String chequeHolderName;
	@Column(name="payee_nm")
	protected String payeeName;
	@Column(name="issued_dt")
	protected LocalDate issuedDate;
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequeHolderName() {
		return chequeHolderName;
	}
	public void setChequeHolderName(String chequeHolderName) {
		this.chequeHolderName = chequeHolderName;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chequeHolderName == null) ? 0 : chequeHolderName.hashCode());
		result = prime * result + ((chequeNo == null) ? 0 : chequeNo.hashCode());
		result = prime * result + ((issuedDate == null) ? 0 : issuedDate.hashCode());
		result = prime * result + ((payeeName == null) ? 0 : payeeName.hashCode());
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
		ChequePayment other = (ChequePayment) obj;
		if (chequeHolderName == null) {
			if (other.chequeHolderName != null)
				return false;
		} else if (!chequeHolderName.equals(other.chequeHolderName))
			return false;
		if (chequeNo == null) {
			if (other.chequeNo != null)
				return false;
		} else if (!chequeNo.equals(other.chequeNo))
			return false;
		if (issuedDate == null) {
			if (other.issuedDate != null)
				return false;
		} else if (!issuedDate.equals(other.issuedDate))
			return false;
		if (payeeName == null) {
			if (other.payeeName != null)
				return false;
		} else if (!payeeName.equals(other.payeeName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeHolderName=" + chequeHolderName + ", payeeName="
				+ payeeName + ", issuedDate=" + issuedDate + ", getChequeNo()=" + getChequeNo()
				+ ", getChequeHolderName()=" + getChequeHolderName() + ", getPayeeName()=" + getPayeeName()
				+ ", getIssuedDate()=" + getIssuedDate() + ", hashCode()=" + hashCode() + "]";
	}
}
