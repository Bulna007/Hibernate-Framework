package com.manytomanyset.entities;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player implements Serializable{
	protected int playerNo;
	protected String playerName;
	protected String nationality;
	protected int playerRank;
	protected LocalDate dob;
	protected String gender;
	
}
