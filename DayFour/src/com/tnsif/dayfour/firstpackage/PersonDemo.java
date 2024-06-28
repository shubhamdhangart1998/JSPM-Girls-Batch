package com.tnsif.dayfour.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		Person p1= new Person();
		
		Scanner sc = new Scanner(System.in);
		
		String name , city ;
		int age ;
		System.out.println("Enter Person details : Name , Age and city");
		name= sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		p1.setPersonName(name);
		
		System.out.println("Person Details Name : " + p1.getPersonName()
		+" "+ p1.getPersonCity()+ " " + p1.getPersonAge());
				
		System.out.println("Enter Person details : Name , Age and city");
		name= sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		
		p1 = new Person(name, age, city);
		System.out.println("Person Details Name : " + p1.getPersonName()
		+" "+ p1.getPersonCity()+ " " + p1.getPersonAge());

		
		
		
		
		
		
		
		
		
		
		
	}

}
