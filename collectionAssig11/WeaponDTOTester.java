package com.xworkz.collectionAssig11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeaponDTOTester {

	public static void main(String[] args) {

		WeaponDTO weapon1 = new WeaponDTO("M416", "US", LocalDate.of(2000, 3, 10), 300000, Type.AssaultRifeles);
		WeaponDTO weapon2 = new WeaponDTO("AWM", "UK", LocalDate.of(2010, 8, 12), 1000000, Type.Snipers);
		WeaponDTO weapon3 = new WeaponDTO("G36C", "India", LocalDate.of(1990, 8, 21), 100000, Type.AssaultRifeles);
		WeaponDTO weapon4 = new WeaponDTO("Kar98", "India", LocalDate.of(1945, 7, 21), 100000, Type.Snipers);
		WeaponDTO weapon5 = new WeaponDTO("M16A4", "US", LocalDate.of(2003, 5, 19), 232320, Type.Launcher);
		WeaponDTO weapon6 = new WeaponDTO("AKM", "Japan", LocalDate.of(1998, 8, 29), 13200, Type.AssaultRifeles);
		WeaponDTO weapon7 = new WeaponDTO("Win94", "US", LocalDate.of(2015, 3, 31), 123200, Type.Snipers);
		WeaponDTO weapon8 = new WeaponDTO("Groza", "India", LocalDate.of(2003, 7, 30), 101200, Type.Launcher);
		WeaponDTO weapon9 = new WeaponDTO("AUG A3", "Japan", LocalDate.of(2010, 3, 21), 123100, Type.AssaultRifeles);
		WeaponDTO weapon10 = new WeaponDTO("M762", "UK", LocalDate.of(2002, 11, 10), 1322300, Type.MG5);
		WeaponDTO weapon11 = new WeaponDTO("M24", "Japan", LocalDate.of(2005, 12, 14), 123900, Type.Snipers);
		WeaponDTO weapon12 = new WeaponDTO("S12K", "India", LocalDate.of(2013, 5, 15), 454250, Type.ShortGuns);
		WeaponDTO weapon13 = new WeaponDTO("S1897", "US", LocalDate.of(2017, 2, 2), 65000, Type.ShortGuns);
		WeaponDTO weapon14 = new WeaponDTO("M249", "Japan", LocalDate.of(2012, 9, 19), 232300, Type.LightMachineGuns);
		WeaponDTO weapon15 = new WeaponDTO("DP-28", "US", LocalDate.of(1999, 8, 18), 76000, Type.LightMachineGuns);
		WeaponDTO weapon16 = new WeaponDTO("Flare Gun", "India", LocalDate.of(1993, 12, 16), 40000, Type.Pistols);
		WeaponDTO weapon17 = new WeaponDTO("Ak47", "Japan", LocalDate.of(1992, 5, 10), 10000, Type.Pistols);
		WeaponDTO weapon18 = new WeaponDTO("0.9mm", "UK", LocalDate.of(1990, 3, 12), 20000, Type.Pistols);
		WeaponDTO weapon19 = new WeaponDTO("Crossbow", "India", LocalDate.of(1993, 1, 1), 1500, Type.Others);
		WeaponDTO weapon20 = new WeaponDTO("Machete", "India", LocalDate.of(1989, 4, 11), 1000, Type.Others);

		Collection<WeaponDTO> collection = new ArrayList();
		collection.add(weapon1);
		collection.add(weapon2);
		collection.add(weapon3);
		collection.add(weapon4);
		collection.add(weapon5);
		collection.add(weapon6);
		collection.add(weapon7);
		collection.add(weapon8);
		collection.add(weapon9);
		collection.add(weapon10);
		collection.add(weapon11);
		collection.add(weapon12);
		collection.add(weapon13);
		collection.add(weapon14);
		collection.add(weapon15);
		collection.add(weapon16);
		collection.add(weapon17);
		collection.add(weapon18);
		collection.add(weapon19);
		collection.add(weapon20);

		System.out.println("All weapons by price greater than > :");
		collection.stream().map((e) -> {
			if (e.getPrice() > 50)
				return e;
			return "NA";
		}).collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("===============================================================");

		System.out.println("All weapons by made by and made on :");
		collection.stream().map(e -> e.getMadeBy()).collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("===============================================================");

		System.out.println("Weapon names in Desc order:");
		collection.stream().sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
				.forEach(e -> System.out.println(e));

		System.out.println("===============================================================");

		System.out.println("Weapons made by ");
		collection.stream().sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy()))
				.forEach(e -> System.out.println(e));

		System.out.println("===============================================================");

		System.out.println("Weapons made on & asc order...");
		collection.stream().sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
				.forEach(e -> System.out.println(e));

		System.out.println("===============================================================");

		System.out.println("Weapons by price & asc order");
		Comparator<WeaponDTO> comparator = (a1, a2) -> Double.compare(a1.getPrice(), a2.getPrice());
		collection.stream().sorted(comparator).forEach(e -> System.out.println(e));

		System.out.println("===============================================================");

		System.out.println("Weapons by price & desc order....");
		Comparator<WeaponDTO> comparator1 = (a1, a2) -> Double.compare(a2.getPrice(), a1.getPrice());
		collection.stream().sorted(comparator1).forEach(e -> System.out.println(e));

		System.out.println("===============================================================");

		System.out.println("Weapons sort by name and made on in asc order....");
		collection.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e -> System.out.println(e));

		System.out.println("===============================================================");

		System.out.println("Weapons sort by type, made by and name in desc order......");
		collection.stream().sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy()))
				.sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.sorted((a1, a2) -> a1.getType().compareTo(a2.getType())).forEach(e -> System.out.println(e));
		System.out.println("===============================================================");
		System.out.println("===============================================================");
		System.out.println("===============================================================");
	}

}
