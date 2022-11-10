package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Chocolate;
import com.xworkz.inheritanceApp.extendsFiles.DairyMilk;

public class ChocolateTester {
	public static void main(String[] args) {
		System.out.println(" Wel-Come to Chocolate Section");
		Chocolate ft = new Chocolate();
		ft.brandName("Kitkat");
		ft.flavour("lite Sweet");
		
		DairyMilk mg = new DairyMilk();
		mg.brandName("DairyMilk");
		mg.flavour("Super Sweet");
	
	}

}
