package com.jpajoined.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="card_payment")
@PrimaryKeyJoinColumn
public class CardPayment extends Payment
{
	@Column(name="card_no")
	protected String cardNo;
	@Column(name="card_nm")
	protected String cardName;
	@Column(name="expiry_month")
	protected int expiryMonth;
	@Column(name="expiry_yr")
	protected int expiryYear;
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + ((cardNo == null) ? 0 : cardNo.hashCode());
		result = prime * result + expiryMonth;
		result = prime * result + expiryYear;
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
		CardPayment other = (CardPayment) obj;
		if (cardName == null) {
			if (other.cardName != null)
				return false;
		} else if (!cardName.equals(other.cardName))
			return false;
		if (cardNo == null) {
			if (other.cardNo != null)
				return false;
		} else if (!cardNo.equals(other.cardNo))
			return false;
		if (expiryMonth != other.expiryMonth)
			return false;
		if (expiryYear != other.expiryYear)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", cardName=" + cardName + ", expiryMonth=" + expiryMonth
				+ ", expiryYear=" + expiryYear + ", paymentNo=" + paymentNo + ", bankName=" + bankName + ", branchName="
				+ branchName + ", description=" + description + ", paidAmount=" + paidAmount + ", paidDate=" + paidDate
				+ "]";
	}
}
