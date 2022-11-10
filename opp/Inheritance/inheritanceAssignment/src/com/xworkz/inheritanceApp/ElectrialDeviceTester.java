package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.ElectrialDevice;
import com.xworkz.inheritanceApp.extendsFiles.Laptop;

public class ElectrialDeviceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Wel-Come to ElectrialDevice");
		ElectrialDevice device = new ElectrialDevice();
		device.brandName("Hp");
		device.brandColor("Silver");
		
		Laptop lp = new Laptop();
		lp.brandName("Dell");
		lp.brandColor("Silver White");

	}

}
