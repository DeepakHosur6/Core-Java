package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Singer;
import com.xworkz.inheritanceApp.extendsFiles.ArjitSingh;

public class SingerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The list of singers");
		Singer sg=new Singer();
		sg.singerName("Shreya");
		
		ArjitSingh ag =new ArjitSingh();
		ag.singerName("Arjit Singh");
		

	}

}
