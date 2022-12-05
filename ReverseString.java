package com.xworkz.variablesapp.variableExamples;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Alexa";

		char[] chArr = name.toCharArray();
		for (int i = chArr.length - 1; i >= 0; i--) {

			System.out.print(chArr[i]);
		}
	}
}
