package com.xworkz.inheritanceApp.Inheritance;

public class PetrolBunk {
	
	public String name;
	public String address;

	public String bunkName(String name) // method
	{
		System.out.println(" Fruit Name is : " + name);
		this.name = name;
		return this.name;

	}

}
