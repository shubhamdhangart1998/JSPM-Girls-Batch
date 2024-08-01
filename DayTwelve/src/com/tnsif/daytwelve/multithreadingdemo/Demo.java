package com.tnsif.daytwelve.multithreadingdemo;

public class Demo {

	public static void main(String[] args) {

		Thread myThread=new ThreadLifeCycleDemo();
		
		System.out.println("Before Runnable stage Thread is alive or not ?"
				+ myThread.isAlive());
		
		myThread.start();
		
		try {
			Thread.sleep(450);
		}
		catch(InterruptedException exp)
		{
			System.err.println(exp);
		}
		
		System.out.println("After completem exceution, it is alive or not ?"
		+ myThread.isAlive());
		
		
		
		
	}

}
