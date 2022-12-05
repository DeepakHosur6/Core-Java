package com.xworkz.variablesapp.variableExamples;

public class Sum {

	public static int add(int number) {
		int sum = 0;
		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;

		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 651;
		System.out.println("sum of all number is " + add(number));
	}

}
