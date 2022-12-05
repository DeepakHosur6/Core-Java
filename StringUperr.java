package com.xworkz.variablesapp.variableExamples;

public class StringUperr {

	static String captialzeword(String str) {
		String word[] = str.split("\\s");
		String captial = "";
		for (String w : word) {
			String a = w.substring(0, 1);
			String b = w.substring(1);
			captial += a.toUpperCase() + b + " ";
		}
		return captial.trim();
	}

	public static void main(String[] args) {
		System.out.println(captialzeword("hi deeps bye"));
	}

}
