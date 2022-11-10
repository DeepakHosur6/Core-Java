package com.xworkz.inheritanceApp.Inheritance;


public class TripPlace {
	
	public String name;
	public String address;

	public String tripPlace(String name) // method
	{
		System.out.println(" Trip Place is : " + name);
		this.name = name;
		return this.name;

	}

}
