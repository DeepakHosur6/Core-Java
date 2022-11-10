package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Organ;
import com.xworkz.inheritanceApp.extendsFiles.Eyes;

public class OrganTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Human Organs Are");
		Organ og = new Organ();
		og.organPart("Heart");
		
		Organ ogg = new Organ();
		ogg.organPart("liver");
		 
		Eyes ey = new Eyes();
		ey.organPart("Eyes");

	}

}
