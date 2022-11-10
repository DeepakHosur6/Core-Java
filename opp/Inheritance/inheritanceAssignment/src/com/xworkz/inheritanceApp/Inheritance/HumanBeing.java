package com.xworkz.inheritanceApp.Inheritance;

public class HumanBeing {
	
	public String name;
	public int age;
	public String city;
	
	public void humanName(String name)
	{
		System.out.println(" The Name of Human Being is : "+name);
		this.name=name;
	}

	public void humanAge(int age)
	{
		System.out.println(" The Age is : "+age);
		this.age=age;
	}
	public void humanPlace(String city)
	{
		System.out.println(" The Place is : "+city);
		this.city=city;
	}
}
