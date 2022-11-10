package com.xworkz.unionTerritoryapp.unionTerritory;

public class UnionTerritory {
	public String capital;
	public String place;
	public int pinCode;
	public long population;
	
	public String territoryCapital (String capital)
	{
		System.out.println(" The Captial is : " +capital);
		return this.capital=capital;
		
	}
	public String territoryName( String place) //method 1 we can use void also
	{
		System.out.println("The place is : " +place);
		this.place = place;
		return place;	
	}
	
	public int pnCode (int pinCode) 
	{
		System.out.println("The Pin Code is : " +pinCode);
		this.pinCode = pinCode;
		return this.pinCode;
	}
	public long totalPopulation (long population)
	{
		System.out.println("The Population is : " +population);
		this.population=population;
		return this.population;
	}

}
