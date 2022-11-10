package com.xworkz.inheritanceApp.Inheritance;

public class Writer {
	public String bookName;
	public String cityName;
	
	public void place(String cityName)
	{
		System.out.println("The Clean Place is : "+cityName);
		this.cityName=cityName;
	}
	public void storyBookName(String bookName)
	{
		System.out.println("The Book Name : "+bookName);
		this.bookName=bookName;
	}
}
