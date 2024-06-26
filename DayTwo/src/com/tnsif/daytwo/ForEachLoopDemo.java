package com.tnsif.daytwo;

public class ForEachLoopDemo {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};
		
	//	for integer array 
		for(int i : a  )
		{
			System.out.println(i);
		}
		
		char ch[] = {'j','a','v','a'};
		for (char c : ch)
		{
			System.out.println(c);
		}
		
		String s1[] = {"Java", "Programming", "Learning"};
		
		for(String s: s1)
		{
			System.out.print(s+" ");
		}
		
		
		
	}

}
