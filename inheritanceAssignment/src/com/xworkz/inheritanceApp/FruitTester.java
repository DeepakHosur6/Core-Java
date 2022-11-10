package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Fruit;
import com.xworkz.inheritanceApp.extendsFiles.Mango;


public class FruitTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Wel-Come Fruit Section");
		Fruit ft = new Fruit();
		ft.fruitName("Apple");
		ft.flavour("Medium Sweet");
		
		Mango mg = new Mango();
		mg.fruitName("Mango");
		mg.flavour("Super Sweet");
	}

}
