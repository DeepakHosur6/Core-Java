package com.xworkz.variablesapp.variableExamples;

public class Largestnumber {

	public static void largest(int a[]) {
		int small = a[0];
		int largest = a[0];
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			} else if (a[i] <= small) {
				small = a[i];
			}

		}
		System.out.println("the largest number " + largest);
		System.out.println("the smallest number " + small);
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					// largest=a[i];
				}
			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 2, 14, 7, 81, 1, 2, -6 };
		largest(a);
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
