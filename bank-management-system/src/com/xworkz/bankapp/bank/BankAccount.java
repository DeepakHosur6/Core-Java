package com.xworkz.bankapp.bank;

public class BankAccount {
	public String name;
	String ifscCode;
	String branchName;
	String  accountNo;
	
	//public double balance; // because this can access through anywhere when it is called
	private double balance;  //use getter & setter //private is implement by Encapsulation
	
	public BankAccount() {
		System.out.println("BankAccount object is created");
	}
	
	public double withDraw( double balance) //method 1
	{
		System.out.println("Amount to be WithDrawn is : " +balance);
		this.balance = this.balance - balance;
		
		return this.balance;	
	}
	//balance =5000
	public double deposit( double balance) //method 2
	{
		System.out.println("Amount to be Deposited is : " +balance);
		// 0.0 + 5000
		this.balance = this.balance + balance;
		//System.out.println("The Account balance is : "+balance);
		return this.balance;

	}
	
	public void transfer(double amount, BankAccount friendAccount) {  //method 3 with passing BankAccount Class as a parameter.
		
		System.out.println("Transfereing to friends Account Rs : ");
		
		friendAccount.deposit(amount);
		System.out.println("Transfereing Done.. Transaction Successfully Completed...... ");
		//withDraw(amount);
	}
	// getter and setter
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}

}
