package com.xworkz.variablesapp.variableExamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rev = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("The number is palindrome:");
		} else {
			System.out.println("The number is not-palindrome:");

		}
		sc.close();

	}

}
