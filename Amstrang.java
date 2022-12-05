package com.xworkz.variablesapp.variableExamples;

import java.util.Scanner;

public class Amstrang {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int res = 0;
		System.out.println("enetr the number");
		int a = s.nextInt();
		int temp = a;
		while (a != 0) {
			int rem = a % 10;
			res += Math.pow(rem, 3);
			a = a / 10;

		}
		if (res == temp) {
			System.out.println("its amstrong " + temp);
		} else {
			System.out.println("its not amstrong " + temp);
		}
		s.close();
	}

}
