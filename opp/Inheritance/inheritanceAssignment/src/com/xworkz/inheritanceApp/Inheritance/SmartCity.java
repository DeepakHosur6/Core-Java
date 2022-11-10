package com.xworkz.inheritanceApp.Inheritance;

public class SmartCity {
	public String cityName;
	public String stateName;
	
	public void place(String cityName)
	{
		System.out.println("The Smart City is : "+cityName);
		this.cityName=cityName;
	}
	public void state(String stateName)
	{
		System.out.println("The Smart Llace located in State of : "+stateName);
		this.stateName=stateName;
	}

}
