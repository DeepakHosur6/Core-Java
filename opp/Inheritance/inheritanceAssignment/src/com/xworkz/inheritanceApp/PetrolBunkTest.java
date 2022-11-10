package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.PetrolBunk;
import com.xworkz.inheritanceApp.extendsFiles.HPPetrolBunk;

public class PetrolBunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("List of PetrolBunk");
		
		PetrolBunk pt =new PetrolBunk();
		pt.bunkName("Shell");
		
		HPPetrolBunk hp = new HPPetrolBunk();
		hp.bunkName("HPPetrolBunk");
	}

}
