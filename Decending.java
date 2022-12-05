package com.xworkz.variablesapp.variableExamples;

public class Decending {

	public static void main(String args[]) {

		int a[] = { 5, 8, 9, 4, 2, 3, 1 };

		int i, j, temp;

		for (i = 0; i < a.length; i++) {

			for (j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		for (int k = 0; k <= a.length; k++) {

			System.out.print(a[k]);
		}
	}

}
