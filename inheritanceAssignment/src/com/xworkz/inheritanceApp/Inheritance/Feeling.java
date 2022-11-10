package com.xworkz.inheritanceApp.Inheritance;

public class Feeling {

	public String name;
	public String address;

	public String bikeName(String name) // method
	{
		System.out.println(" Fruit Name is : " + name);
		this.name = name;
		return this.name;

	}

}
