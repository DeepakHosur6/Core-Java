package com.xworkz.variablesapp.variableExamples;

public class Arraywithoutlength {

	public static void main(String[] args) {
		int a[] = { 1, 1, 4, 5, 5, 7, 5, 6 };
		int i = 0;
		for (int b : a) {
			i++;
			System.out.println(b);
		}
		System.out.println("Length of the given string :" + i);
	}

}
