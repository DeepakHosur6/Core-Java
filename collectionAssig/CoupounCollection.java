package com.xworkz.collectionAssig;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CoupounCollection {

	public static void main(String[] args) {

		String cou1 = "BOGO";
		String cou2 = "Promo codes";
		String cou3 = "Percent-off";
		String cou4 = "Automatic";
		String cou5 = "Free shipping";
		String cou6 = "Friends and family discount";
		String cou7 = "Free gift with purchase";
		String cou8 = "Mystery deals";
		String cou9 = "Mobile";
		String cou10 = "Gift card";
		String cou11 = "Online";
		String cou12 = "advanced shipping";

		Collection<String> coupon = new ArrayList<>();
		coupon.add(cou1);
		coupon.add(cou2);
		coupon.add(cou3);
		coupon.add(cou4);
		coupon.add(cou5);
		coupon.add(cou6);
		coupon.add(cou7);
		coupon.add(cou8);
		coupon.add(cou9);
		coupon.add(cou10);
		coupon.add(cou11);
		coupon.add(cou12);

		System.out.println(coupon.size());
		coupon.clear();
		System.out.println(coupon.size());
	}

}
