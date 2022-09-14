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
@EqualsAndHashCode(exclude="account")
@ToString
public class Locker implements Serializable{
	protected int lockerNo;
	protected String keyNo;
	protected String dimensions;
	protected int charges;
	protected Account account;
}
