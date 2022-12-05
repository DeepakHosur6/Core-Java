package com.xworkz.variablesapp.variableExamples;

public class LengthString {

	public static void main(String[] args) {
		String str = "sampleStrings";
		int i = 0;
		for (char c : str.toCharArray()) {
			i++;
		}
		System.out.println("Length of the given string ::" + i);
	}

}
