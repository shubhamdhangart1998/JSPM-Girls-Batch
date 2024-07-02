package com.tnsif.dayfive.association.hasa;

public class Executor {

	public static void main(String[] args) {
		
		
		Address address=new Address("405 Laxmi Nagar", "Pune", "Maharshtra", "411001");
				
		Person person=new Person("Hema", address);
		person.displayInfo();
		System.out.println(person);
	}
}
