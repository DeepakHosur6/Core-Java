package com.xworkz.variablesapp.variableExamples;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		// variable to store count of digits in number
		int count = 0;

		// count number of digits in num
		while (num != 0) {
			num = num / 10; // removes last digit of num
			count++;
		}

		// print the count
		System.out.println(count+" number of digit are present");
		scan.close();
	}
}
