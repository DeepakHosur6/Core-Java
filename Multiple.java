package com.xworkz.variablesapp.variableExamples;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int m = 3;
		int n = 6;

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			int mul3 = a[i] * m;

			System.out.println("multiples of 3 " + mul3);
		}

		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");

		for (int i = 0; i < a.length; i++) {
			int mul6 = a[i] * n;

			System.out.println("multiples of 6 " + mul6);
		}
		s.close();
	}

}
