package com.tnsif.dayten.multidimensionaldemo;


class JaggedArray{
	
	static void printArray(int d[][])
	{
		System.out.println("Array Elements are as follow : ");
		for( int i=0; i<d.length; i++) 
		{
			for( int j=0; j<d[i].length; j++) // column
			{
				System.out.print(d[i][j]+ " ");
				
			}
			System.out.println();
		}
	}
}
public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		int d[][]= { {10,20,30,40} , {20}, {12,24} , {1,2,3,4,5,6,7} , {1,10} };
		
		System.out.println("Total Rows in Array " + d.length);
		
		JaggedArray.printArray(d);

	}

}
