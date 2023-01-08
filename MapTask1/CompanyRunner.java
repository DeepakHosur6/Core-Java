package com.xworkz.mapApp1.MapTask1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompanyRunner {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap();
		map.put("Alexa", "Systemsoftware");
		map.put("Wipro", "Applicatinsoftware");
		map.put("TCS", "UtilitySoftware");
		map.put("Trinity", "Applicationsoftware");
		map.put("Aptive", "Systemsoftware");
		map.put("FirstAmerica", "Utilitysoftware");
		map.put("Benz", "Applicationsoftware");
		map.put("Apple", "Utilitysoftware");
		map.put("Hp", "System software");
		map.put("DELL", "System software");

		System.out.println("============================");
		System.out.println("======= keys.....");
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println("============================");
		System.out.println("======= values.....");
		Collection<String> values = map.values();
		values.forEach(e -> System.out.println(e));

		System.out.println("============================");
		System.out.println("Both keys and values....");
		Set<Entry<String, String>> entries = map.entrySet();

		for (Entry<String, String> ref : entries) {
			System.out.println("Name:"+ref.getKey() + " Type:" + ref.getValue());
		}

	}

}
