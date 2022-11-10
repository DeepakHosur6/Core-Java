package com.xworkz.inheritanceApp.Inheritance;

public class MetroCity {
	public String cityName;
	public String stateName;
	
	public void metroPlace(String cityName)
	{
		System.out.println("The Metro Place is : "+cityName);
		this.cityName=cityName;
	}
	public void metroState(String stateName)
	{
		System.out.println("The Metro place located in State of : "+stateName);
		this.stateName=stateName;
	}

}
