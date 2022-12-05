package com.xworkz.variablesapp.variableExamples;

import java.util.Scanner;

public class Pyramid {

	public static void main(String args[]) {
		int i, j, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines");
		n = sc.nextInt();
		for (i = 0; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}

			System.out.println("");
		}
	}

}
