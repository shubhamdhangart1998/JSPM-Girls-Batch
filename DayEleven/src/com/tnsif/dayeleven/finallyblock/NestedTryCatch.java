package com.tnsif.dayeleven.finallyblock;

public class NestedTryCatch {
	
	public static void check( ) {
	String str= "TNS";
	int slength = str.length();
	System.out.println(" String length : " + slength);

	String anotherString = null;
	
	int y =6;
	
	try {
		//Inner Try Block 
		try {
			System.out.println(str.charAt(y));  //Exception occurred
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.err.println("Index is out of bounds " + e.getMessage());
		}
		
		System.out.println("String length : "+ anotherString.length());
		
	}
	catch (NullPointerException np)
	{
		System.err.println("Exception is thrown "+ np.getMessage());
	}
	}
	
	}
