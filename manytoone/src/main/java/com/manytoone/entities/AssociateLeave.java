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
public class AssociateLeave implements Serializable{
	protected int leaveNo;
	protected String description;
	protected String leaveType;
	protected LocalDate startDate;
	protected LocalDate endDate;
	protected String leaveStatus;
	protected Associate associate;
}
