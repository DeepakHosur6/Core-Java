package com.xworkz.inheritanceApp.Inheritance;

public class AwsomePark {
	
	public String name;
	public String place;
	
	public void parkName(String name)
	{
		System.out.println("The Park Name is : "+name);
		this.name=name;
	}
	
	public void parkPlace(String place)
	{
		System.out.println("The location of Paark is : "+place);
		this.place=place;
	}

}
