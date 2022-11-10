package com.xworkz.inheritanceApp.Inheritance;

public class WildLife {
	
	public String name;
	public String address;

	public String wildName(String name) // method
	{
		System.out.println(" WildLife Animals are  : " + name);
		this.name = name;
		return this.name;

	}

}
