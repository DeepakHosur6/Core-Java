package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.ecommerce.Ecommerce;
import com.xworkz.ecommerceapp.flipkart.Flipkart;
import com.xworkz.ecommerceapp.amazon.Amazon;

public class EcommerceTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Wel Come To E-Commerce ");
		Ecommerce ecom = new Ecommerce();
		ecom.brandName("ebay");
		ecom.landmark("Basav Nagar 1st Cross");
		ecom.city("Bailhongal");
		ecom.pnCode(591102);
		
		Flipkart flip = new Flipkart();
		flip.brandName("Flip-Kart");
		flip.landmark("Vidya Nagar 1st Cross");
		flip.city("Belagavi");
		flip.pnCode(591156);
		
		Amazon amz = new Amazon();
		amz.brandName("Amazon");
		amz.landmark("Tom street");
		amz.city("New york");
		amz.pnCode(991156);

	}

}
