package com.tnsif.daysix.staticblockmethod;

public class MyClass {

	private int section;  //non -static varible  or instance varible
	
	private static int srNo; // static or class varible 
	
	//static block 
	static
	{
		System.out.println("-----------Within static block -----------");
		srNo=1000;
	}
	
	//default constructor 
	MyClass()
	{
		System.out.println("------------Within Default COnstructor----------");
		srNo++;  //1001
		section++;   //1
	}

	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method 
	static void display()
	{
//		System.out.println("Section : "+ section ); //cam't access non static member 
	
		System.out.println("Serail No : "+ srNo);
	
	
	}
}
