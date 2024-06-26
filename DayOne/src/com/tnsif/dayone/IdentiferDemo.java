package com.tnsif.dayone;

public class IdentiferDemo {

	public static void main(String[] args) {

		
		//varibles declaration - Invalid Identifier Examples 
		
		//int for=13;// error bcoz keyword cannot be identifier 

		//int num 1=13;  // error bcoz do not add space 
		
		//int @num3=13;  //error bcoz identifier can not start with specila symbol except $_
		
		//valid Identifier Examples 
		
		int $num1= 20;
		
		System.out.println("Values of the number varible is :"+ $num1);
		
		String studentName="Shreya";
		
		System.out.println("value is "+ studentName);
		
		
		
	}

}
