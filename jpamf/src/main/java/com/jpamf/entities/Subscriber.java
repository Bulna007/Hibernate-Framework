package com.jpamf.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Subscriber implements Serializable
{
	protected int subscriberNo;
	protected String subscriberName;
	protected String emailAddress;
	protected String mobileNo;
	protected String subscriptionType;
	protected LocalDate subscribedDate;
	protected String circle;
	public int getSubscriberNo() {
		return subscriberNo;
	}
	public void setSubscriberNo(int subscriberNo) {
		this.subscriberNo = subscriberNo;
	}
	public String getSubscriberName() {
		return subscriberName;
	}
	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public LocalDate getSubscribedDate() {
		return subscribedDate;
	}
	public void setSubscribedDate(LocalDate subscribedDate) {
		this.subscribedDate = subscribedDate;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((circle == null) ? 0 : circle.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((subscribedDate == null) ? 0 : subscribedDate.hashCode());
		result = prime * result + ((subscriberName == null) ? 0 : subscriberName.hashCode());
		result = prime * result + subscriberNo;
		result = prime * result + ((subscriptionType == null) ? 0 : subscriptionType.hashCode());
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
		Subscriber other = (Subscriber) obj;
		if (circle == null) {
			if (other.circle != null)
				return false;
		} else if (!circle.equals(other.circle))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (subscribedDate == null) {
			if (other.subscribedDate != null)
				return false;
		} else if (!subscribedDate.equals(other.subscribedDate))
			return false;
		if (subscriberName == null) {
			if (other.subscriberName != null)
				return false;
		} else if (!subscriberName.equals(other.subscriberName))
			return false;
		if (subscriberNo != other.subscriberNo)
			return false;
		if (subscriptionType == null) {
			if (other.subscriptionType != null)
				return false;
		} else if (!subscriptionType.equals(other.subscriptionType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Subscriber [subscriberNo=" + subscriberNo + ", subscriberName=" + subscriberName + ", emailAddress="
				+ emailAddress + ", mobileNo=" + mobileNo + ", subscriptionType=" + subscriptionType
				+ ", subscribedDate=" + subscribedDate + ", circle=" + circle + "]";
	}	
}
