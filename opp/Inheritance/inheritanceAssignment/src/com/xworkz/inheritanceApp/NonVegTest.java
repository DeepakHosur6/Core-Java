package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.NonVeg;
import com.xworkz.inheritanceApp.extendsFiles.Chicken;

public class NonVegTest {
	public static void main(String[] args) {
		
		NonVeg nv = new NonVeg();
		nv.foodtype("Fish");
		
		Chicken ck = new Chicken();
		ck.foodtype("Chicken");
	}

}
