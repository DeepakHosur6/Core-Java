package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.saving.SavingAccount;

public class BankAccountTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount(); //Object 1
		System.out.println("The Alex Account balance is : "+account.getBalance());
		account.deposit(5000);
		account.deposit(7000);
		//System.out.println(" Remaining Balance after Deposit is : " +account.balance);
		System.out.println("The Alex Account balance is : "+account.getBalance());
		account.withDraw(1000);
		System.out.println("The Alex Account balance is : "+account.getBalance());
		//friendAccount 
		BankAccount friendAccount = new BankAccount();  //Object 2
		System.out.println(" Friends Account Blance is Rs : " +friendAccount.getBalance());
		friendAccount.deposit(700);
		friendAccount.deposit(4000);
		System.out.println(" Friends Account Blance is : " +friendAccount.getBalance());
		
		account.transfer(600, friendAccount);
		System.out.println(" Balance of  Friends Account After transfer is : " +friendAccount.getBalance());
		
		//double withDrawAmount = account.withDraw(450);
		//System.out.println("Thank you for withdrawing "+);
		
		//SavingAccount
		SavingAccount momSavingAccount = new SavingAccount();
		System.out.println(" Mom Saving AccNO ");
		momSavingAccount .deposit(10000);
		momSavingAccount .withDraw(1000);
		//System.out.println(" Mom Saving Account Blance is : " +momSavingAccount.balance); //while using public balance
		System.out.println(" Mom Saving Account Blance is : " +momSavingAccount.getBalance());//while using private getBalance
		
		
		//CurrentAccount
		CurrentAccount currentAcc = new CurrentAccount();
		System.out.println(" Father Current AccNO ");
		currentAcc.deposit(3333);
		currentAcc.withDraw(2000);
		System.out.println("Father Current Account Blance is : " +currentAcc.getBalance());
		
		
		//SavingAccount
		SavingAccount savingAcc2 = new SavingAccount(0.7);
		savingAcc2.deposit(1000);
		savingAcc2.periodicInterest();
		System.out.println("New intrest + balance"+savingAcc2.getBalance());
		
	}

}

	
	


