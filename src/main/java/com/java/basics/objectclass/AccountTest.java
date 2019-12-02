package com.java.basics.objectclass;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.insert(29292, "Karthik Bhat", 200000.00);
		acc1.display();
		acc1.deposit(10000);
		acc1.checkBalance();
		acc1.withdraw(5000);
		acc1.checkBalance();
		acc1.display();
	}
}