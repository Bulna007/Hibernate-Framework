package com.getvsload.entities;

import java.io.Serializable;
import java.time.LocalDate;

public interface ICustomer extends Serializable
{
	int getCustomerNo();
	void setCustomerNo(int customerNo);
	String getCustomerName();
	void setCustomerName(String customerName);
	LocalDate getDob();
	void setDob(LocalDate dob);
	String getGender();
	void setGender(String gender);
	String getMobileNo();
	void setMobileNo(String mobileNo);
	String getEmailAddress();
	void setEmailAddress(String emailAddress);
}
