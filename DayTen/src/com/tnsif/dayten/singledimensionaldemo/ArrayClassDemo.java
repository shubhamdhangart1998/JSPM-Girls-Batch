package com.tnsif.dayten.singledimensionaldemo;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		//get the array
		
		int intArr[] = {69,20,12,40,35};
		
		//print the array 
		
		System.out.println(Arrays.toString(intArr));
		/*[69, 20, 12, 40, 35] 2*1 =2
		 *[69, 20, 12, 40, 35] 
		 *[69, 20, 12, 40, 35] 
		 */
		
		for( int i=0; i<intArr.length; i++)
		{
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binarySearch
		System.out.println(Arrays.binarySearch(intArr, 50));
		
		System.out.println(Arrays.binarySearch(intArr, 2, 4, 35));
		
		//comparison
		
		System.out.println(Arrays.toString(intArr));
		
		//get the second array
		int intArr1[]= {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr1));
		
		Arrays.sort(intArr1);
		
		//compare both th arrays 
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("Both the arrays are same ");
		}
		else 
		{
			System.out.println("Both arrays are not same ");
		}
		
	//copy array
		
		int intArr2[] = Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[]=Arrays.copyOfRange(intArr, 1, 4);
		System.out.println(Arrays.toString(intArr3));
		
		//Fill method 
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
