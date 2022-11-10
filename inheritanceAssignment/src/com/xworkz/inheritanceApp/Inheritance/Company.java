package com.xworkz.inheritanceApp.Inheritance;

public class Company {
	public String name ;
	public String address ;
	
	public  String companyName(String name ) //method 
	{
		System.out.println(" Fruit Name is : "+name);
		this.name=name;
		return this.name;
		
	}

}
