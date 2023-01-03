package com.xworkz.collectionAssig2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String watch1 = "Casio"; 
		String watch2 = "Timex";
		String watch3 = "Richard_Mille";
		String watch4 = "Titan";
		String watch5 = "Royal_Rolex";

		Collection<String> watchs = new ArrayList<String>();

		watchs.add(watch5);
		watchs.add(watch4);
		watchs.add(watch3);
		watchs.add(watch2);
		watchs.add(watch1);

		System.out.println("Using for loop....");
		for (String watch : watchs) {
			System.out.println("The Name is :" +watch);
		}

		Iterator<String> element = watchs.iterator();

		System.out.println("---Using While Loop---");
		while (element.hasNext()) {
			String ref = element.next();
			System.out.println("The Brand name :" +ref);
		}
	}

}
