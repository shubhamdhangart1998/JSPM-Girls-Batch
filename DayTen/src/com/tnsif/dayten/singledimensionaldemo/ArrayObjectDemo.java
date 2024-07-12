package com.tnsif.dayten.singledimensionaldemo;

public class ArrayObjectDemo {

	public static void main(String[] args) {

		Student [] arr;
		
		//declared memory for 5 object of type student
		arr=new Student[5];
		
//		for(int i=0; i<arr.length; i++)
//			System.out.println("Elemnts at "+ i +
//					":"+ arr[i].getRollNo()+" "+ arr[i].getName());

		arr[0] =new Student(1, "Shubham");
		arr[1] =new Student(2, "Heti");
		arr[2] =new Student(3, "Zeel");
		arr[3] =new Student(4, "Neha");
		arr[4] =new Student(5, "Nidhi");
		
		
		for(int i=0; i<arr.length; i++)
			System.out.println("Elemnts at "+ i +
					":"+ arr[i].getRollNo()+" "+ arr[i].getName());

	
	
	
	}

}
