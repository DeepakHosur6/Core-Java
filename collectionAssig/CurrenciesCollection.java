package com.xworkz.collectionAssig;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CurrenciesCollection {

	public static void main(String[] args) {

		String currencies1 = "Indian Rupee";
		String currencies2 = "Australian Dollar";
		String currencies3 = "Convertible Mark";
		String currencies4 = "Bahamian Dollar";
		String currencies5 = "Brazilian Real";
		String currencies6 = "Cuban Peso";
		String currencies7 = "Egyptian Pound";
		String currencies8 = "Euro";
		String currencies9 = "Pound Sterling ";
		String currencies10 = "Quetzal";
		String currencies11 = "Guyana Dollar";
		String currencies12 = "Hong Kong Dollar";
		String currencies13 = "Iranian Rial ";
		String currencies14 = "Jordanian Dinar ";
		String currencies15 = "Kenyan Shilling";
		String currencies16 = "North Korean Won";
		String currencies17 = "Sri Lanka Rupee";
		String currencies18 = "Kyat";
		String currencies19 = "Mexican Peso";
		String currencies20 = "New Zealand Dollar";
		String currencies21 = "Nepalese Rupee";
		String currencies22 = "Saudi Riyal ";
		String currencies23 = "Russian Ruble ";
		String currencies24 = "Singapore Dollar";
		String currencies25 = "Turkish Lira ";
		String currencies26 = "US Dollar";
		
		Collection<String> collect = new ArrayList<>();
		
		collect.add(currencies1);
		collect.add(currencies2);
		collect.add(currencies3);
		collect.add(currencies4);
		collect.add(currencies5);
		collect.add(currencies6);
		collect.add(currencies7);
		collect.add(currencies8);
		collect.add(currencies9);
		collect.add(currencies10);
		collect.add(currencies11);
		collect.add(currencies12);
		collect.add(currencies13);
		collect.add(currencies14);
		collect.add(currencies15);
		collect.add(currencies16);
		collect.add(currencies17);
		collect.add(currencies18);
		collect.add(currencies19);
		collect.add(currencies20);
		collect.add(currencies21);
		collect.add(currencies22);
		collect.add(currencies23);
		collect.add(currencies24);
		collect.add(currencies25);
		collect.add(currencies26);
		
		System.out.println("The Size is :"+collect.size());
		collect.clear();
		System.out.println("After Invoking clear() size : "+collect.size());
	}

}
