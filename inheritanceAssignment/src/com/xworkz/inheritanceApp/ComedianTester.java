package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Comedian;
import com.xworkz.inheritanceApp.extendsFiles.Joker;

public class ComedianTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Comedian are");
		Comedian cd = new Comedian();
		cd.comedianName("Raju");
		
		Joker jk = new Joker();
		jk.comedianName("Joker");

	}

}
