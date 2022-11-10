package com.xworkz.festivalApp;

import com.xworkz.festivalApp.deepavali.Deepavali;
import com.xworkz.festivalApp.festival.Festival;

public class FestivalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Festival time is to be Celebrate Grand");
		Festival fes = new Festival();
		fes.festName("Ganesh Festival");
		fes.festMonth("Agust");
		fes.festFood("Laddu");
		
		Deepavali deep = new Deepavali();
		deep.festName("Deepavali Festival");
		deep.festMonth("October");
		deep.festFood("Sweet");

	}

}
