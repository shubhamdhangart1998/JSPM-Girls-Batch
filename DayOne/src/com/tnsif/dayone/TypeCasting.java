package com.tnsif.dayone;

public class TypeCasting {

	public static void main(String[] args) {

		//widening  / implicit type casting
		
		
		byte b= 10;
		int l= b;
		System.out.println(l);
		
		float f= 22.14f;
		double d= f;
		System.out.println(d);
		
		char ch='A';
		int i= ch;
		
		char var1='\u00A7';
		System.out.println(var1);
		int i4=var1;
		System.out.println(i4);
		
		//narrowing /explicit type casting
		
		double f1= 10.52f;
		
		long l1 = (long) f1;
		System.out.println(l1);
		
		long L2= 98654323456789l;
		
		int i23=(int) L2;
		System.out.println(i23);
		
		float f2 = 34.56f;
		int i123=(int) f2;
		System.out.println(i123);
	}

}
