package com.manytoone.entities;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Associate implements Serializable{
	protected int associateNo;
	protected String fullname;
	protected String emailAddress;
	protected String department;
	protected String designation;
	protected LocalDate joinedDate;
	protected String mobileNo;
}
