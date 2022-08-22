package com.jpatpc.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="payment")
@GenericGenerator(name="incrementgen", strategy="increment")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Payment implements Serializable
{
	@Id
	@GeneratedValue(generator="incrementgen")
	@Column(name="payment_no")
	protected int paymentNo;
	@Column(name="bank_nm")
	protected String bankName;
	@Column(name="branch_nm")
	protected String branchName;
	protected String description;
	@Column(name="paid_amount")
	protected double paidAmount;
	@Column(name="paid_dt")
	protected LocalDate paidDate;
	public int getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public LocalDate getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		long temp;
		temp = Double.doubleToLongBits(paidAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((paidDate == null) ? 0 : paidDate.hashCode());
		result = prime * result + paymentNo;
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
		Payment other = (Payment) obj;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Double.doubleToLongBits(paidAmount) != Double.doubleToLongBits(other.paidAmount))
			return false;
		if (paidDate == null) {
			if (other.paidDate != null)
				return false;
		} else if (!paidDate.equals(other.paidDate))
			return false;
		if (paymentNo != other.paymentNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Payment [paymentNo=" + paymentNo + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", description=" + description + ", paidAmount=" + paidAmount + ", paidDate=" + paidDate + "]";
	}
}
