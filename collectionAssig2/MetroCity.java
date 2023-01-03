package com.xworkz.collectionAssig2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCity {

	public static void main(String[] args) {

		String city1 = "Bangalore";
		String city2 = "Dehli";
		String city3 = "Pune";
		String city4 = "Mumbai";
		String city5 = "Chennai";

		Collection<String> cities = new ArrayList<String>();
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);

		System.out.println("Using for loop....");
		for (String ref : cities) {

			System.out.println("City Name is: "+ref);
		}
		Iterator<String>  element = cities.iterator();
		
		System.out.println("---Using While Loop---");
		
		while(element.hasNext()) {
			String cityNames=element.next();
			System.out.println("City Name is: "+cityNames);
		}

	}

}
