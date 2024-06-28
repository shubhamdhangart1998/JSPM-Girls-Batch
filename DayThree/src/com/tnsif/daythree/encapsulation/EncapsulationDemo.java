package com.tnsif.daythree.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {

		
		//object creation
		OopsConceptDemo obj= new OopsConceptDemo();
		
		obj.setName("Shubham");
		obj.setAge(25);
		obj.setSerilaNum(1001);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerilaNum());
		
		System.out.println(obj);
		
		
	}

}
