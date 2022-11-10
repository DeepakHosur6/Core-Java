package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.CleanCity;
import com.xworkz.inheritanceApp.extendsFiles.Mysoru;

public class CleanCityTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clean City are ");
		CleanCity city = new CleanCity();
		city.place("Belagavi");
		city.state("Karnataka");
		
		Mysoru my = new Mysoru();
		my.place("Mysoru");
		my.state("Karnataka");

	}

}
