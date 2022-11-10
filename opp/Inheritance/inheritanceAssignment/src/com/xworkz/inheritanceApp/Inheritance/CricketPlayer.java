package com.xworkz.inheritanceApp.Inheritance;

public class CricketPlayer {
	public String name;
	public String team;
	

	public String playerName(String name) // method
	{
		System.out.println(" Cricket Player Name is : " + name);
		this.name = name;
		return this.name;

	}
	
	public String playerTeam(String team) // method
	{
		System.out.println(" Cricket Player team  : " + team);
		this.team = team;
		return this.team;

	}

}
