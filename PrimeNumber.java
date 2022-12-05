package com.xworkz.variablesapp.variableExamples;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		boolean value = false;
		for (int i = 2; i <= num / 2; i++) {
			// condition for nonprime number
			if (num % i == 0) {
				value = true;
				break;
			}
		}

		if (!value)
			System.out.println(num + ": is a prime number.");
		else
			System.out.println(num + ": is not a prime number.");
		scan.close();
	}

}
