package com.xworkz.coffeeshopapp.coffee;

public class Filter {
	
	private String coffeeBrand;
	private int amount;
//	private String isSugarAdded;
	
	
	public Filter(String coffeeBrand,int amount ) {
		
		System.out.println("");
		this.coffeeBrand=coffeeBrand;
		this.amount=amount;
		//this.isSugarAdded=isSugarAdded;
		
	}
	
	public void displayDetails() {
		
		System.out.println("The Powder info : "+coffeeBrand);
		System.out.println("Sugar info : "+amount);
		//System.out.println("Water info : "+isSugarAdded);
		
		
		
	}
}
