package com.xworkz.variablesapp.variableExamples;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		int reversed = 0;

		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}

		System.out.println("Reversed Number: " + reversed);
		scan.close();
	}

}
