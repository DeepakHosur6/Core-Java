package com.xworkz.mapApp1.MapTask1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityTempreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Banglore", 24.7);
		map.put("Belagavi", 18.1);
		map.put("Hubli", 29.9);
		map.put("Tumkur", 24.4);
		map.put("Shivmogga", 18.2);
		map.put("Hassan", 28.8);
		map.put("Baglkot", 39.6);

		System.out.println("The Size of map is : " + map.size());
		if (map.isEmpty()) {
			System.out.println("Map is empty........");
		} else {
			System.out.println("Map contains some data...");
		}

		System.out.println("Seting the values-----");
		Set<String> keys = map.keySet();

		System.out.println("Using For-each loop ");
		for (String ref : keys) {
			System.out.println("The City : " + ref);
		}

		System.out.println("============================");

		System.out.println("Using Lambda expression");
		keys.forEach(e -> System.out.println("City : " + e)); // Lambda expression

		System.out.println("---Fetching only by VAlues---");
		Collection<Double> values = map.values();
		values.forEach(v -> System.out.println("Degree Celsius is : " + v));

		System.out.println("============================");
		System.out.println("Both keys and values...");
		Set<Entry<String, Double>> entries = map.entrySet();

		for (Entry<String, Double> ref : entries) {
			System.out.println(ref.getKey() + " city & temp " + ref.getValue());
		}

	}

}
