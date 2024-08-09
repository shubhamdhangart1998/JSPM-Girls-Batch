package com.tnsif.dayfifteen.setdemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {

		Set<Students> set=new HashSet<Students>();
		set.add(new Students(101, "Shubham", 78.09));
		set.add(new Students(102, "Heti", 88.09));
		set.add(new Students(101, "Shubham", 78.09));
		set.add(new Students(201, "Shubham", 78.09));
		set.add(new Students(101, "Sansruti", 78.10));
		set.add(new Students(131, "Zeel", 55.67));
		
		System.out.println(set);
		
		
		
		
		
		
		
	}

}
