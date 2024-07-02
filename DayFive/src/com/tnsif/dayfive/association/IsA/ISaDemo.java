package com.tnsif.dayfive.association.IsA;

public class ISaDemo {

	public static void main(String[] args) {

		
		Employee employee=new Employee("Heti", 1001, "IT");
		Manager manager=new Manager("Zeel", 1002, "Hr", 8);
		
		System.out.println(employee);
		System.out.println("-----------------------------------------------------------");
		System.out.println(manager);
	}

}
