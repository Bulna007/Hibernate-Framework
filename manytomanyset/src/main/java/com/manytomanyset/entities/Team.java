package com.manytomanyset.entities;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(exclude="players")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {
	protected int teamNo;
	protected String teamName;
	protected String representationCountry;
	protected String captain;
	protected String coach;
	protected Set<Player> players;
}
