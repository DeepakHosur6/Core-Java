package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Coluor;
import com.xworkz.inheritanceApp.extendsFiles.White;

public class ColuorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Select the below Colour :");
		Coluor cl = new Coluor();
		cl.colourName("Blue");
		
		Coluor cl1 = new Coluor();
		cl1.colourName("Silver");
		
		White wt = new White();
		wt.colourName("White");

	}

}
