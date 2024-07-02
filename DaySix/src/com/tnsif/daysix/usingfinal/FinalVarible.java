package com.tnsif.daysix.usingfinal;

public class FinalVarible {


	//final int x;  //final instance varible must be initialized 
	
	final int x=100;
	
	//declare a static blank final varible
	final static int y;
	
	//Declare and intialized static final varible 
	final static int z = 10;
	
	//instance method 
	void change() {
//		x=30; //final varibles can't be reassigned 
//		y=200; //final static varibles can't be reassigned 
	}

	@Override
	public String toString() {
		return "FinalVarible [x=" + x + ", y=" + y +"]";
	}
	
	//declare a static block to intialize the final static varible ---- y
	static {
		y=20;
		//z=100;// once intialized can't be reassigned 
		System.out.println("Value of Y :" + y);
	}
	
	
	
	
	
	
	
}
