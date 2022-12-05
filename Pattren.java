package com.xworkz.variablesapp.variableExamples;

import java.util.Iterator;

public class Pattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Words and number;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(i);
				// System.out.print("Hello World");
			}
			System.out.println("Alexa");
		}
		/* ========================================================== */
		System.out.println("===============================");
		// another way for words and num
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (j == 3) {
					System.out.print("d");
				} else {
					System.out.print(i);
				}
			}
			System.out.println("");
		}
		/* ========================================================== */
		System.out.println("===============================");
		// num & words & num
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i == 2) {
					System.out.print("Alexa ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println("");
		}
		/* ========================================================== */
		System.out.println("===============================");
		// Pyramid
		/*
		 * # ## ### ####
		 */
		for (int i = 0; i <= 3; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(" " + "#");
			}
			System.out.println("");
		}
		/* ========================================================== */
		System.out.println("===============================");
		/*
		 * 0 11 222 3333
		 */
		for (int i = 0; i <= 3; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(" " + "" + i);
			}
			System.out.println("");
		}
		/* ========================================================== */
		System.out.println("===============================");

		for (int i = 0; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

		System.out.println("===============================");
		// ===================================================
		int n = 4;
		// printing the dollars in rectangle triangle
		// main loop
		for (int i = 1; i <= n; i++) {
			// printting sapce
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$");
			}
			System.out.println("");
		}
		System.out.println("===============================");
		// ===================================================
		int a = 4;
		// printing the dollars in triangle
		// main loop
		for (int i = 1; i <= a; i++) {
			// printting sapce
			for (int j = a - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$ ");
			}
			System.out.println("");
		}
		System.out.println("===============================");
		// ===================================================

		int b = 4;
		// printing the dollars in triangle
		// main loop
		for (int i = 1; i <= b; i++) {
			// printting sapce
			for (int j = a - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		System.out.println("===============================");
		// ===================================================
		int c = 4;
		// printing the num in triangle
		// main loop
		for (int i = 1; i <= c; i++) {
			// printting sapce
			for (int j = c - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		System.out.println("===============================");
		// ===================================================
		int d = 4;
		// printing the num in triangle
		// main loop
		for (int i = 1; i <= d; i++) {
			// printting sapce
			for (int j = d - 1; j >= i; j--) {
				System.out.print(j);
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		System.out.println("===============================");
		// ===================================================
		int e = 4;
		// printing the num in triangle
		// main loop
		for (int i = 1; i <= e; i++) {
			// printting sapce
			for (int j = c - 1; j >= i; j--) {
				if (j == 2) {
					System.out.print("Alexa");
				} else {
					System.out.print(j);
				}
			}
			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print(" " + "Alexa" + " ");
				} else {
					System.out.print(k);
				}
			}
			System.out.println("");
		}
		System.out.println("===============================");
		// ===================================================

		int g = 4;

		for (int i = g; i >= 1; i--) {

			for (int j = g - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("& ");
			}
			System.out.println("");
		}

		// ===================================================
		System.out.println("===============================");

		int h = 4;
		// printing the num in triangle
		// main loop
		for (int i = 1; i <= h; i++) {
			// printting sapce
			for (int j = h - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("% ");
			}
			System.out.println("");
		}

		System.out.println("______________");

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == 1 && col == 5) {
					System.out.print("Xworkz");
				} else {
					System.out.print(col);
				}
			}
			System.out.println();
		}

		System.out.println("================================");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 1 && j == 1) {
					System.out.println(" ");
				} else {
					System.out.print(" ");
				}
				System.out.print(" " + "#");
			}
			System.out.println("");
		}
		System.out.println("================================");

	}
	System.out.println("================================"){
		
	
	int i,j;
	int e=7;//size
	
	for(i=0; i<n; i++)
	{
		for(j=0; j<e; j++)
		{
			if(i == 0 || i==j ||i==e-1||j==e-1 || i+j==e-1)
			{
				System.out.println("*");
			}
		}
	}
	
	}
	
}}