package com.xworkz.variablesapp.variableExamples;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Java Program";
		System.out.println(name);

		for (int i = 0; i < name.length(); i++) {
			System.out.print(" " + name.charAt(i));
		}
		System.out.println("");
		System.out.println("String Reverse");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(" " + name.charAt(i));

		}
		System.out.println(""); // Counting a given char
		System.out.println("Counting a given char");

		
		System.out.println("Count is :" + count);
		System.out.println("Count 1 is :" + count1);

		int count2 = 0;
		String str = "Good Learning";
		for (char ch : str.toCharArray()) {
			if (ch == '0')
				count2 += 1;
			// System.out.print(ch+ " ");
		}
		System.out.println("Count 2 is :" + count2);

		System.out.println("========================");
		String names = "deepak";
		String reverse = "";
		for (int i = names.length() - 1; i >= 0; i--) {
			reverse += names.charAt(i);
		}
		if (names.equals(reverse)) {
			System.out.println("Original is Matched");
		} else {
			System.out.println("Original is Not-Matched");
		}

	}

}
