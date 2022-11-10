package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.CricketPlayer;
import com.xworkz.inheritanceApp.extendsFiles.Dhoni;

public class CricketPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Cricket Game Player");
		CricketPlayer cp =new CricketPlayer();
		cp.playerName("Sachin");
		cp.playerTeam("India");
		
		Dhoni cp1 =new Dhoni();
		cp1.playerName("Dhoni");
		cp1.playerTeam("India");

	}

}
