package com.xworkz.inheritanceApp.Inheritance;

public class Chocolate {
	
	public String name ;
	public String taste ;
	
	public  String brandName(String name ) //method 
	{
		System.out.println(" Fruit Name is : "+name);
		this.name=name;
		return this.name;
		
	}
	
	public String flavour(String taste)
	{
		System.out.println("The Fruit Taste is : "+taste);
		this.taste=taste;
		return this.taste;
	}

}
