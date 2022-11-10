package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Biscuit;
import com.xworkz.inheritanceApp.extendsFiles.Oreo;

public class BiscuitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("list of Biscuit");
		Biscuit bt = new Biscuit();
		bt.biscuitName("Good Day");
		
		Oreo or = new Oreo();
		or.biscuitName("Oreo");

	}

}
