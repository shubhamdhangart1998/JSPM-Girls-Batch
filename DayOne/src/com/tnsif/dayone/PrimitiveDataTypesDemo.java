package com.tnsif.dayone;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {

		//byte takes 1 byte
		byte byteMax=127;
		byte byteMin=-128;
		
		System.out.println("Min range of byte is " + byteMin 
				+ "  Max range of byte is :"+ byteMax);
		
		//short ---- 2 byte 
		short shortMax= 32767;
		short shortMin= -32768;
		
		System.out.println("Min range of short is " + shortMin 
				+ "  Max range of short is :"+ shortMax);
		
		//int --- 4 byte
		int minInt = -2147483648;
		int maxInt = 2147483647;
		
		//long - 8byte
		long maxLong=9223372036854775807L;
		long minLong=	-9223372036854775808L;	
		
		float f=3234.141243278345f;
		double d= 3456.14124512345678902345678914f;
		System.out.println("float value is " + f+ " double value " + d);
		
		
		boolean  flag= false;
		System.out.println("boolean value is "+flag);
		
	}

}
