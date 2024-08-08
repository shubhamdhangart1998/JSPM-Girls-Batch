package com.tnsif.dayfifteen.QueueObjects;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeueDemo {

	public static void main(String[] args) {

		Deque<String > deque1=new ArrayDeque<String>();
		deque1.add("Gautami");
		deque1.add("Kiran");
		deque1.add("Shreya");
		deque1.add("Heti");
		
		System.out.println("Queue is :"+ deque1);
		
		deque1.pollLast();
		System.out.println("Queue is :"+ deque1);
		
		deque1.pollFirst();
		System.out.println("Queue is :"+ deque1);

		
		for(String str:deque1)
		{
			System.out.println("Queue is :"+str);
		}

		System.out.println("Queue is :"+ deque1);

		
		
		
		
		
		
		
		
		
	}

}
