package com.xworkz.variablesapp.variableExamples;

public class Pattren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("================================");
		{

			int i, j;
			int e = 7;

			for (i = 0; i < e; i++) 
			{
				for (j = 0; j < e; j++) 
				{
					if (i == 0||j==0 || i == j || i == e - 1 || j == e - 1 || i + j == e - 1) {
						System.out.print(" ");
					}else
					{
						System.out.print("  ");
					}
					System.out.print(" 1 ");
				}
				System.out.println();
			}
			
		}

	}
}
