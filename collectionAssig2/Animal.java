package com.xworkz.collectionAssig2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
	
	public static void main(String[] args) {
		String animal1 = "Lion";
		String animal2 = "Tiger";
		String animal3 = "Dog";
		String animal4 = "Goat";
		String animal5 = "Donkey";
		String animal6 = "Monkey";
		String animal7 = "Cow";
		String animal8 = "Fish";
		String animal9 = "Elephant";
		String animal10 = "Deer";
		
		Collection <String> animals = new ArrayList<String>();
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		animals.add(animal7);
		animals.add(animal8);
		animals.add(animal9);
		animals.add(animal10);
		
		System.out.println("---Using for Loop---");
		for(String animal:animals) {
			System.out.println(animal);
		}
		Iterator<String> element= animals.iterator();
		
		System.out.println("---Using While Loop---");
		
		while(element.hasNext()) {
			String ref=element.next();
			System.out.println(ref);
		}

	}
}
