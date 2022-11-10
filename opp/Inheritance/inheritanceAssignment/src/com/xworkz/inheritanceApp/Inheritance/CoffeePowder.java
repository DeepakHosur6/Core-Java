package com.xworkz.inheritanceApp.Inheritance;

public class CoffeePowder {
	public String name;
	public String address;

	public String coffeeName(String name) // method
	{
		System.out.println(" Brand Name is : " + name);
		this.name = name;
		return this.name;

	}


}
