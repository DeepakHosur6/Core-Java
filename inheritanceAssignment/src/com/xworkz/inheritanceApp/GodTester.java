package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.God;
import com.xworkz.inheritanceApp.extendsFiles.GaneshGod;

public class GodTester {
	public static void main(String[] args) {
		
		System.out.println(" Indian Gods Are:");
		
		God gd = new God();
		gd.godName("Lord Shiva");
		
		GaneshGod gg = new GaneshGod();
		gg.godName("Lord Ganesh");
		
	}

}
