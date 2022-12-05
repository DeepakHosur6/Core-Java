package com.xworkz.variablesapp.variableExamples;

public class ReversePattern {

	public static void main(String arg[]) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
