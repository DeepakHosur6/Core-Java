package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.SmartCity;
import com.xworkz.inheritanceApp.extendsFiles.Belagavi;

public class SmartCityTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Smart City are ");
		SmartCity city = new SmartCity();
		city.place("Hubli");
		city.state("Karnataka");
		
		Belagavi my = new Belagavi();
		my.place("Belagavi");
		my.state("Karnataka");

	}

}
