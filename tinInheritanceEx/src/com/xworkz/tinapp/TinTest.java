package com.xworkz.tinapp;

import com.xworkz.tinapp.cocacola.Cocacola;
import com.xworkz.tinapp.redbull.RedBull;
import com.xworkz.tinapp.tin.Tin;

public class TinTest {
	
	
	public static void main(String[] args) {
		
		Tin tin = new Tin();
		tin.storeLiquid();
		System.out.println("--------------------------------");
		Cocacola coke = new Cocacola();
		coke.storeLiquid();
		
		RedBull red = new RedBull();
		red.storeLiquid();
		
		System.out.println("--------------------------------");
		System.out.println("Second type with help of casting");
		Object object = new Cocacola();
		((Cocacola) object).storeLiquid();
		
		Object object2 = new RedBull();
		((RedBull) object2).storeLiquid();
		
		System.out.println("--------------------------------");
		Tin ten = new Cocacola();
		ten.storeLiquid();
	}

}
