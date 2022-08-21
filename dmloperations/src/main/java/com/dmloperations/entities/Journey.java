package com.dmloperations.entities;

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
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class Journey implements Serializable
{
	private int journeyNo;
	private String source;
	private String destination;
	private LocalDate journeyDate;
	private String commuteMode;
	private int hours;
	private double amount;
}
