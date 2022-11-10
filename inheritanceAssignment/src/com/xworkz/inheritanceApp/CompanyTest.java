package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Company;
import com.xworkz.inheritanceApp.extendsFiles.Tcs;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Following are some IT Company");
		Company cp = new Company();
		cp.companyName("Amazon");
		
		Company cp1 = new Company();
		cp1.companyName("Jp Morgan");
		
		Tcs tc = new Tcs();
		tc.companyName("Tcs");
		

	}

}
