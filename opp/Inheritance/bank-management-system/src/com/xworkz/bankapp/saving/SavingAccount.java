package com.xworkz.bankapp.saving;

import com.xworkz.bankapp.bank.BankAccount;

// child / sub /Derived class
public class SavingAccount extends BankAccount {
	//when a child object is created then parent class object is also created -- 2 object created
	//super(); is communicate from child to parent class this is handle by complier.
	//super(); only used when 2 files are inter-releated this is also constructor chaining 
	//super(); should be written first --- this is written inside the constructor 
	public double interestRate;
	
	public SavingAccount()
	{
		//Default Constructor
	}
	
	public SavingAccount(double interestRate) { //para Constructor
		this.interestRate = interestRate;
	}
	
	// SavingAccount specific method
	public void periodicInterest()
	{
		double newBalance = getBalance()  * interestRate / 100 ;
		deposit(newBalance);
	}

}
