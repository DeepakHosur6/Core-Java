package com.xworkz.variablesapp.variableExamples;

public class Sub {

	static int sub(int a, int b) {

		for (int i = 1; i <= b; i++)
			a--;
		return a;
	}

	public static void main(String[] args) {

		int a = sub(10, 9);
		System.out.print(a);
	}
}
