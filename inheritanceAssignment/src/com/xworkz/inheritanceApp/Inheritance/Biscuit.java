package com.xworkz.inheritanceApp.Inheritance;

public class Biscuit {
	
	public String name;
	public String address;

	public String biscuitName(String name) // method
	{
		System.out.println(" Biscuit Brand Name is : " + name);
		this.name = name;
		return this.name;

	}

}
