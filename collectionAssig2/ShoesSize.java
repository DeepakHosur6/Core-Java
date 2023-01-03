package com.xworkz.collectionAssig2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesSize {

	public static void main(String[] args) {

		int size1 = 10;
		int size2 = 11;
		int size3 = 12;
		int size4 = 13;
		int size5 = 14;
		int size6 = 15;
		int size7 = 16;
		int size8 = 17;
		int size9 = 18;
		int size10 = 19;
		int size11 = 20;
		int size12 = 21;
		int size13 = 22;
		int size14 = 23;
		int size15 = 24;

		Collection<Integer> sizes = new ArrayList<Integer>();
		sizes.add(size1);
		sizes.add(size2);
		sizes.add(size3);
		sizes.add(size4);
		sizes.add(size5);
		sizes.add(size6);
		sizes.add(size7);
		sizes.add(size8);
		sizes.add(size9);
		sizes.add(size10);
		sizes.add(size11);
		sizes.add(size12);
		sizes.add(size13);
		sizes.add(size14);
		sizes.add(size15);

		System.out.println("Using for loop....");
		for (int size : sizes) {
			System.out.println("The Size is :" +size);
		}

		Iterator<Integer> ref1 = sizes.iterator();

		System.out.println("---Using While Loop---");

		while (ref1.hasNext()) {
			int sizeNumber = ref1.next();
			System.out.println("The Size are :" + sizeNumber);
		}

	}

}
