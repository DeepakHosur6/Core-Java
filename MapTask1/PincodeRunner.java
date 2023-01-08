package com.xworkz.mapApp1.MapTask1;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PincodeRunner {
	
	public static void main(String[] args) {

		Map<Long,String> map = new TreeMap();
		map.put(591102l, "Bailhongal");
		map.put(587313L, "Savadatti");
		map.put(587143L, "Bagalkot");
		map.put(587420L, "Hubli");
		map.put(591156L, "Belgavi");
		map.put(590312L, "Gokak");
		map.put(577226L, "Kittur");
		map.put(567678L, "Dharwad");
		map.put(537987L, "Tumkur");
		map.put(590001L, "BAnglore");

		System.out.println("======= keys ====");
		Set<Long> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println("====== values =====");
		Collection<String> values = map.values();
		values.forEach(e -> System.out.println(e));

		System.out.println("============================");
		System.out.println("Both keys and values...");
		Set<Entry<Long,String>> entries = map.entrySet();

		for(Entry<Long,String> ref : entries) {
			System.out.println("PinCode: "+ref.getKey() + "City: " + ref.getValue());
		}

	}

}
