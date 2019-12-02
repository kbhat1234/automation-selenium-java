package com.java.basics.objectclass;

public class Account {
	int accNo;
	String name;
	double amount;
	
	void insert(int acc, String n, double amt) {
		accNo=acc;
		name=n;
		amount=amt;
	}
	
	void deposit(double amt) {
		amount=amount+amt;
		System.out.println(amt+ " deposited");
	}
	
	void withdraw(double amt) {
		if(amount<amt) {
			System.out.println("Insufficient balance");
		} else
		{
			amount=amount-amt;
			System.out.println(amt+ " Amount withdrawn");
		}		
	}
	
	void checkBalance() {
		System.out.println("Balance is "+amount);
	}
	
	void display() {
		System.out.println(accNo+ " "+name+" "+amount);
	}
}
