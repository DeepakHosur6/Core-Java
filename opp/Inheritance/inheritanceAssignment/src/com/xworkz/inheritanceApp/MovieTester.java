package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Movie;
import com.xworkz.inheritanceApp.extendsFiles.Kgf;

public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" IndiaN film are ");
		Movie mv = new Movie();
		mv.toWatch("Kantara");
		
		Kgf kg = new Kgf();
		kg.toWatch("Kgf");

	}

}
