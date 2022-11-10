package com.xworkz.inheritanceApp.Inheritance;

public class ElectrialDevice {
	
	public String name;
	public String color;
	
	public void brandName( String name)
	{
		System.out.println("Brand Product is : "+name);
		this.name=name;
	}
	public void brandColor( String color)
	{
		System.out.println("Brand color is : "+color);
		this.color=color;
	}

}
