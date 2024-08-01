package com.tnsif.dayeleven.multipleCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void divide() {
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two  numbeers: ");
		
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			
			System.out.println("Divisio is "+ c);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Incvalid input. Please enter integers only."+ e.getMessage());
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception caught"+ e.getMessage());
		}
		
		catch(Exception e)
		{
			System.out.println("Exception caught"+ e.getMessage());
		}
		
		finally {
			sc.close();
			
			System.out.println("Finally block");
		}
		System.out.println("Statement after finally block ");
	}

}
