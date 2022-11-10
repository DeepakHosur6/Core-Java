package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.CoffeePowder;
import com.xworkz.inheritanceApp.extendsFiles.Bru;

public class CoffeePowderTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select the Brand Coffee Powder");
		
		CoffeePowder cp =new CoffeePowder();
		cp.coffeeName("Red Label");
		
		Bru br = new Bru();
		br.coffeeName("Bru");

	}

}
