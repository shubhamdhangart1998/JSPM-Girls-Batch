package com.tnsif.dayfive.hierarchicalinheritance;

public class HierarchicalDemo {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println("------------Person Details -----------");
		System.out.println(p1);
		
		Person p;
		p = new Person("vaishanvi", "Mumbai");
		System.out.println("Person Details :"+ p);
		
		p= new Employee("Nikita", "Nashik", 1001, 23000f, "Civil");
		System.out.println("Employee Details : " + p );
		
		p=new Student("Shubham", "Pune","FE", 88);
		System.out.println("Students Details : "+p);
		
		
	}

}
