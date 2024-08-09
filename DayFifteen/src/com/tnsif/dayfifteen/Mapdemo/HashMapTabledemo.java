package com.tnsif.dayfifteen.Mapdemo;

import java.util.Hashtable;

public class HashMapTabledemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101, "Mumbai");
		ht.put(102, "New Mumbai");
		ht.put(103, "Pune");
		ht.put(101, "Aurangbad");
		ht.put(104, "New Mumbai");
		
		System.out.println(ht);
		
		ht.putIfAbsent(105, "PMC");
		ht.put(106, "baramati");
		
		//ht.put(110, null);
		ht.put(101, "Nagar");
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		System.out.println(ht.replace(102, "Bombay"));
		System.out.println(ht);
		
		
		
		
		
	}

}
