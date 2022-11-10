package com.xworkz.ecommerceapp.ecommerce;

public class Ecommerce {
	
	public String name;
	public String address;
	public String place;
	public int pinCode;
	
	public String brandName (String name)
	{
		System.out.println(" The Brand Name is : " +name);
		this.name=name;
		return this.name;
	}
	public String landmark (String address)
	{
		System.out.println(" The Brand Name is : " +address);
		this.address=address;
		return this.address;
	}
	public String city (String place)
	{
		System.out.println(" The Brand Name is : " +place);
		this.place=place;
		return this.place;
	}
	public int pnCode (int pinCode)
	{
		System.out.println(" The Pin Code is : " +pinCode);
		this.pinCode=pinCode;
		return this.pinCode;
	}

}
