package com.tnsif.daythree.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		String name, city;
		int id;
		System.out.println("Enter Customer Id :");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name:");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City :");
		city=sc.nextLine();
		
		
		System.out.println(" ");
		
		Customer c1=new Customer(); // default 
		c1.setCustomerCity(city);
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		System.out.println(c1);
		
		System.out.println("Enter Customer Id :");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name:");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City :");
		city=sc.nextLine();
		
		Customer c2 = new Customer(name, id, city); //para
		System.out.println(c2);
		
		

	}

}
