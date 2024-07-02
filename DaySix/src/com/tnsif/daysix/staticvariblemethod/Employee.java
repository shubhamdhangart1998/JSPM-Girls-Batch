package com.tnsif.daysix.staticvariblemethod;

public class Employee {

	//Declare instance varibles.
	private String name;
	private int id;
	
	//DEclare a static varible companyName with data type string  assign value 
	
	//TNS which is common for all the objects.
	static String companyName = "TNS";
	
	//Decalre a two parameter constructor 
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Comapny= "+companyName+"]";
	}
	
	

	
	

}
