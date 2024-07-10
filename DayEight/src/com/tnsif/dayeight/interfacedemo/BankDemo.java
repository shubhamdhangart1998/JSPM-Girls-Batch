package com.tnsif.dayeight.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		
		SavingAccount s1=new SavingAccount("Zeel", "Pune", 1234567, 17500);
		
		s1.deposit(26000);
		System.out.println(s1);
		
		s1.withdraw(10000);
		System.out.println(s1);
		
		s1.withdraw(3000);
		System.out.println(s1);

	}

}
