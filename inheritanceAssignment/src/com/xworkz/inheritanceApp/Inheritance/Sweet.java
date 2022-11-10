package com.xworkz.inheritanceApp.Inheritance;

public class Sweet {
	
	public String sname;
	public int sprice;
	
	public void sweetName(String sname)
	{
		System.out.println("The Sweet Name is : "+sname);
		this.sname=sname;
	}
	
	public void sweetPrice(int sprice)
	{
		System.out.println("The Price of Sweet is : "+sprice);
		this.sprice=sprice;
	}
}
