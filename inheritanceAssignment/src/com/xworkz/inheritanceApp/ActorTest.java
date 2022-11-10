package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Actor;
import com.xworkz.inheritanceApp.extendsFiles.PuneethRajKumar;

public class ActorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The list of Actors are");
		Actor act = new Actor();
		act.actorName("Yash");
		act.place("Belagavi");
		
		PuneethRajKumar pk = new PuneethRajKumar();
		pk.actorName("PuneethRajKumar");
		pk.place("Banglore");

	}

}
