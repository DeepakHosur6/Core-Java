package com.xworkz.unionTerritoryapp;

import com.xworkz.unionTerritoryapp.delhi.Delhi;
import com.xworkz.unionTerritoryapp.puducherry.Puducherry;
import com.xworkz.unionTerritoryapp.unionTerritory.UnionTerritory;

public class UnionTerritoryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" The Union Territory :");
		UnionTerritory ut = new UnionTerritory();
		ut.territoryName("Lakshadweep");
		ut.territoryCapital(" Kavaratti ");
		ut.pnCode(569990);
		ut.totalPopulation(67878L);
		
		UnionTerritory ut1 = new UnionTerritory();
		ut1.territoryName("Jammu and Kashmir");
		ut1.territoryCapital(" Jammu (Srinagar) ");
		ut1.pnCode(567891);
		ut1.totalPopulation(167878L);
		
		
		Delhi dl = new Delhi();
		dl.territoryName("Delhi");
		dl.territoryCapital(" New Delhi ");
		dl.pnCode(566999);
		dl.totalPopulation(4567878L);
		
		Puducherry py = new Puducherry();
		py.territoryName("Puducherry");
		py.territoryCapital(" Puducherry ");
		py.pnCode(5678000);
		py.totalPopulation(275508L);
		
	}

}
