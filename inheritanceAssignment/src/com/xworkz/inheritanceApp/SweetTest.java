package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Sweet;
import com.xworkz.inheritanceApp.extendsFiles.Sugar;

public class SweetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Types of Sweet are");
		Sweet st = new Sweet();
		st.sweetName("Laddu");
		st.sweetPrice(20);
		
		Sugar sg =new Sugar();
		sg.sweetName("Laddu");
		sg.sweetPrice(30);
		
	}

}
