package com.xworkz.variablesapp.variableExamples;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		String name="deepuu";
		Scanner s=new Scanner(System.in);
		char n=s.next().charAt(0);
		int count=0 ;
		int count1=0;
		for (int i = 0; i <=name.length()-1; i++)
		{
			if(name.charAt(i)==n) 
			{
				count++;
			}
			else 
			{
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
