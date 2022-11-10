package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.HumanBeing;
import com.xworkz.inheritanceApp.extendsFiles.Dev;

public class HumanBeingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi This is Human");
		HumanBeing being = new HumanBeing();
		being.humanName("Tom");
		being.humanAge(34);
		being.humanPlace("Belagavi");
		
		Dev dv =new Dev();
		dv.humanName("Dev");
		dv.humanAge(30);
		dv.humanPlace("Banglore");
		

	}

}
