package com.otmoto.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(exclude="lockers")
@ToString(exclude="lockers")
public class Account implements Serializable{
	protected int accountNo;
	protected String accountHolderName;
	protected String accountType;
	protected String branchCode;
	protected LocalDate oppenedDate;
	protected double balance;
	protected Set<Locker> lockers;
}
