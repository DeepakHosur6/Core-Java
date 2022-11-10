package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.MetroCity;
import com.xworkz.inheritanceApp.extendsFiles.Chamrajnagar;

public class MetroCityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The Metro City in India are");
		MetroCity mc = new MetroCity();
		mc.metroPlace("Delhi");
		mc.metroState("Captial City of India");

		Chamrajnagar cm = new Chamrajnagar();
		cm.metroPlace("Chamrajnagar");
		cm.metroState("Karnataka");

	}

}
