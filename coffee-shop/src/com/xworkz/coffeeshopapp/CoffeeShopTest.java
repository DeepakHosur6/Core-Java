package com.xworkz.coffeeshopapp;

import com.xworkz.coffeeshopapp.coffee.Filter;
import com.xworkz.coffeeshopapp.coffeeshop.CoffeeShop;
//HAS A RELATIONSHIP EXAMPLE
public class CoffeeShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Filter filter = new Filter ("Bru", 55);
		
		CoffeeShop cop = new CoffeeShop();
		//cop.coffeefilter();
		cop.filterMethod(filter);

	}

}
