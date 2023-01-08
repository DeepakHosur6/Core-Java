package com.xworkz.mapApp1.MapTask1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolateRunner {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap();
		map.put("Dairymilk", 50.25);
		map.put("Kitkat", 25.09);
		map.put("Munch", 30.35);
		map.put("Bubly", 60.6);
		map.put("Milkybar", 10.5);
		map.put("Imali", 45.7);
		map.put("Coconut", 20.54);
		map.put("Perk", 5.6);
		map.put("Chocobar", 20.54);
		map.put("Snikers", 5.6);

		System.out.println("============================");
		System.out.println("==keys means Brand....");
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println("============================");
		System.out.println("==values mean Price....");
		Collection<Double> value = map.values();
		value.forEach(e -> System.out.println(e));

		System.out.println("============================");
		System.out.println("Both values and keys...");
		Set<Entry<String, Double>> entries = map.entrySet();

		for (Entry<String, Double> ref : entries) {
			System.out.println(ref.getKey() + " " + ref.getValue());
		}

	}

}
