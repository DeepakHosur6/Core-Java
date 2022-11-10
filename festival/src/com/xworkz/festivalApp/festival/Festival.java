package com.xworkz.festivalApp.festival;

public class Festival {
	
	public String name;
	public String month;
	public String food;
	
	public String festName (String name)
	{
		System.out.println("The Festival is : "+name);
		this.name=name;
		return this.name;
	}
	public String festMonth (String month)
	{
		System.out.println("The Month  : "+month);
		this.month=month;
		return this.month;
	}
	public String festFood (String food)
	{
		System.out.println("The Special Food : "+food);
		this.food=food;
		return this.food;
	}

}
