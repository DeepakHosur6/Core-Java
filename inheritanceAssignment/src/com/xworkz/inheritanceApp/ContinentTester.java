package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Continent;
import com.xworkz.inheritanceApp.extendsFiles.Asia;

public class ContinentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Continent are ");
		Continent ct = new Continent();
		ct.contientName("Africa");
		ct.contientPopulation(3456789);
		
		Asia as = new Asia();
		as.contientName("Asia");
		as.contientPopulation(12343);

	}

}
