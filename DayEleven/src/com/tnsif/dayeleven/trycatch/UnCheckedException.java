package com.tnsif.dayeleven.trycatch;

public class UnCheckedException {

	public static void main(String[] args) {
		
		int x[];
		try {
			 x= new int[] { 1,2,3,4,5};
			 
			 System.out.println(x[6]); // out of bound
			 
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Specified index does not exist." 
		+ e.getMessage());
		}

	}

}
