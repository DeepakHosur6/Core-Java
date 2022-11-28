package com.xworkz.coffeeshopapp.coffeeshop;

import com.xworkz.coffeeshopapp.coffee.Filter;

public class CoffeeShop {
	
	public Filter filter;   //class name as
	
	public String coffeefilter;
	public boolean filterMethod ( Filter filte)
	{
		boolean isConnected = false;
		System.out.println("Inside coffeeFilter() method:");
		if(coffeefilter != null) {
			
			System.out.println("filter allowed");
			this.filter=filte;
			System.out.println("Details");
			this.filter.displayDetails();
			isConnected = true;
			System.out.println("hi ");
			
		}else {
			System.out.println("Filter Not Connected...please turn ON:");
		}
		
		
		return isConnected;
	}

}
