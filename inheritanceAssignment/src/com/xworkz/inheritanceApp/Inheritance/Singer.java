package com.xworkz.inheritanceApp.Inheritance;

public class Singer {
	
	public String name;
	public String cityName;
	
	public void singerName(String name)
	{
		System.out.println("The Singer Name : "+name);
		this.name=name;
	}
	
	public void singerplace(String cityName)
	{
		System.out.println("The Clean Place is : "+cityName);
		this.cityName=cityName;
	}
	

}
