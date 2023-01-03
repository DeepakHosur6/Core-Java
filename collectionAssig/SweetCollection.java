package com.xworkz.collectionAssig;

import java.util.ArrayList;
import java.util.Collection;

public class SweetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Sweet1 = "Badam Ka Halwa";
		String Sweet2= "Basundi";
		String Sweet3 = "Mysore Pak";
		String Sweet4= "Bebinca";
		String Sweet5 = "Kulfi";
		String Sweet6 = "Ladoo";
		String Sweet7 = "Malpua";
		String Sweet8 = "Rasmalai";
		String Sweet9 = "Jalebi";
		String Sweet10 = "Modak";
		String Sweet11 = "Rasgulla";
		String Sweet12 = "Barfi";
		String Sweet13 = "Jalebi";
		
		Collection<String> 	sweet = new ArrayList();
		sweet.add(Sweet1); //Invoking the add() i.e, collection Inbuilt method
		sweet.add(Sweet2);
		sweet.add(Sweet3);
		sweet.add(Sweet4);
		sweet.add(Sweet5);
		sweet.add(Sweet6);
		sweet.add(Sweet7);
		sweet.add(Sweet8);
		sweet.add(Sweet9);
		sweet.add(Sweet10);
		sweet.add(Sweet11);
		sweet.add(Sweet12);
		sweet.add(Sweet13);
		System.out.println("The total number of sweets are: ");
		System.out.println(sweet.size()); //Invoking the size()i.e, collection Inbuilt method
		System.out.println("End of Size size() Method");
		System.out.println("---------------------------------");
		System.out.println("Invoking the clear() method:");
		System.out.println("---------------------------------");
		sweet.clear(); //Invoking the clear() i.e, collection Inbuilt method
		System.out.println("The Size is :"+sweet.size()); 

	}

}
