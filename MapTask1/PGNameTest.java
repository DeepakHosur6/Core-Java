package com.xworkz.mapApp1.MapTask1;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PGNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Kushi Pg", 65000.00);
		map.put("Alex Pg", 45600.00);
		map.put("Tom Pg", 51200.00);
		map.put("Krishna Pg", 73200.00);
		map.put("Raj Pg", 68500.00);
		map.put("OM Pg", 69000.00);
		map.put("Vinay Pg", 71500.00);
		map.put("Maruti Pg", 88000.00);
		map.put("Pavan Pg", 79000.00);
		map.put("Navya Pg", 99000.00);
		
		if(map.isEmpty()) {
			System.out.println("it`s Empty");
		}else {
			System.out.println("Map contains some data...");
		}
		System.out.println("The Pg Name List are");
		Set<String> key =map.keySet();
		key.forEach(e->{System.out.println("Key(Pg Name) is : "+e);});
		System.out.println("Using Lambda expression");
		System.out.println("============================");

		System.out.println("The Pg's Fees are");
		Collection<Double> value = map.values();
		value.forEach((v)->System.out.println("Fees is : "+v));
		System.out.println("Using Lambda expression");
		System.out.println("============================");
		
		System.out.println("Using Lambda expression");
		System.out.println("The Pg's Names & Fees are");
		Set<Entry<String, Double>> enty = map.entrySet();
		enty.forEach(e-> System.out.println("Pg Data :"+e));
		
		System.out.println("============================");
		System.out.println("Using For-each loop ");
		for(Entry<String,Double> ref : enty) {
			System.out.println(ref.getKey() + " " + ref.getValue());
		}

	}

}
