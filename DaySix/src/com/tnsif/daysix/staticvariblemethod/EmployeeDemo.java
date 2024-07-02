package com.tnsif.daysix.staticvariblemethod;

public class EmployeeDemo {

	public static void main(String[] args) {

		
		//Create the first object of the clas and pass the two arguments with type 
		
		Employee e = new Employee("Zeel", 1001);
		System.out.println(e);
		
		//similarly we can create the objects for other employees
		e=new Employee("Hema", 1002);
		System.out.println(e);
	}

}
