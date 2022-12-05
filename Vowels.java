package com.xworkz.variablesapp.variableExamples;

public class Vowels {

	public static void main(String[] args) {
		String line = "This website is awssome.";
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;

		line = line.toLowerCase();
		for (int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);

			// check if character is any of a, e, i, o, u
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			}

			// check if character is in between a to z
			else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			}

		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

	}
}
