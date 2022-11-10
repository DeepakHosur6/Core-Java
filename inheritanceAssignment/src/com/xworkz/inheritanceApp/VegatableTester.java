package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Vegatable;
import com.xworkz.inheritanceApp.extendsFiles.Onion;

public class VegatableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select the Vegatables ");
		Vegatable vg = new Vegatable();
		vg.vegtName("Carrot");
		vg.validitDay(10);
		
		
		Onion on = new Onion();
		on.vegtName("Carrot");
		on.validitDay(30);

	}

}
