package com.tnsif.dayten.multidimensionaldemo;


class MLArray
{
	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follow : ");
		for( int i=0; i<c.length; i++) 
		{
			for( int j=0; j<c[i].length; j++) // column
			{
				System.out.print(c[i][j]+ " ");
				
			}
			System.out.println();
		}
	}
}



public class MultiDimArrayDemo {

	public static void main(String[] args) {
		
		int c[][]= { {12,45} , {10,20}, {5,7}, {10,20}, {5,7} }; //new int[3] [2];

		System.out.println("Np. of row  in C array :"+ c.length);
		
		MLArray.printArray(c);
	}

}
