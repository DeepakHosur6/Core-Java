package com.xworkz.inheritanceApp.Inheritance;

public class CleanCity {
	public String cityName;
	public String stateName;
	
	public void place(String cityName)
	{
		System.out.println("The Clean Place is : "+cityName);
		this.cityName=cityName;
	}
	public void state(String stateName)
	{
		System.out.println("The Clean place located in State of : "+stateName);
		this.stateName=stateName;
	}

}
