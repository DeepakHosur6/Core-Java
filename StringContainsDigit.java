package com.xworkz.variablesapp.variableExamples;

public class StringContainsDigit {

	public static void main(String[] args) {
		String str = "879121645";
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String : " + str);
		System.out.println("Does string contain only Digits? : " + result);
	}

}
