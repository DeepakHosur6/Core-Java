package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Flower;
import com.xworkz.inheritanceApp.extendsFiles.Rose;

public class FlowerTest {
	
	public static void main(String[] args) {
		
		System.out.println("Some Flower name are");
		Flower fl = new Flower();
		fl.flowerName("Lotus");
		
		Rose rs = new Rose();
		rs.flowerName("Rose");
	}

}
