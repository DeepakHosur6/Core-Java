package com.xworkz.methodoverloading;

import conceptoverloading.CarromBord;

public class CarromBordTester {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String playersName [] = {"vineet","puneet","sunil","basu"};
			
			CarromBord bord = new CarromBord ("wood",28,4,playersName);
			 
			bord.displayInfo();

		}

	}
