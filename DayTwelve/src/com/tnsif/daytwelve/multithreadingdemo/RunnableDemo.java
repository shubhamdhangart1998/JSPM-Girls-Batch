package com.tnsif.daytwelve.multithreadingdemo;

public class RunnableDemo {

	public static void main(String[] args) {

		//Runnalbe r=new UsingRunnable(
//		UsingRunnable r=new UsingRunnable(10, 1, "Hiii");
//		
//		//Runnable r1=new Runnable();
//		
//		Thread t1=new Thread(r);
//		
//		t1.start();
		
		
		Runnable r1=() -> System.out.println("runnable with lamba expression ");
		
		new Thread(r1).start();
	}

}
