package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.WildLife;
import com.xworkz.inheritanceApp.extendsFiles.Zoo;

public class WildLifeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Wel come to WildLife");
		
		WildLife wl =new WildLife();
		wl.wildName("Tiger");
		
		Zoo zo = new Zoo();
		zo.wildName("Lion is in Zoo");

	}

}
