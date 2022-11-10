package com.xworkz.inheritanceApp.Inheritance;

public class Continent {
	public String name;
	public int population;
	
	public void contientName (String name)
	{
		System.out.println("Name is : "+name);
		this.name=name;	
	}
	public void contientPopulation(int population)
	{
		System.out.println("population is : "+population);
		this.population=population;	
	}

}
