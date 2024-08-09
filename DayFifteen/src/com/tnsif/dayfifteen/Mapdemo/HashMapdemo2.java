package com.tnsif.dayfifteen.Mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapdemo2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> ht=new HashMap<Integer, String>();

		ht.put(101, "Mumbai");
		ht.put(102, "New Mumbai");
		ht.put(103, "Pune");
		ht.put(101, "Aurangbad");
		ht.put(104, "New Mumbai");
		
		System.out.println(ht);
		
		ht.clone();
		System.out.println(ht);
		
		Set s=ht.keySet();
		System.out.println(s);
		Collection<String> c=ht.values();
		System.out.println(c);
		
		ht.replace(101, "Delhi");
		System.out.println(ht);
		
		
		
		
		
		
	}
	
	
}
