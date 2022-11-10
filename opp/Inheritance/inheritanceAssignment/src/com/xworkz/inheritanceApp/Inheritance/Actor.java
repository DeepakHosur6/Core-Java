package com.xworkz.inheritanceApp.Inheritance;

public class Actor {
	public String name;
	public String cityName;
	
	public void actorName(String name)
	{
		System.out.println("The Actor Name : "+name);
		this.name=name;
	}
	
	public void place(String cityName)
	{
		System.out.println("The Actor location Place is : "+cityName);
		this.cityName=cityName;
	}
	
}

