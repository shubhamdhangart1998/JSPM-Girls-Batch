package com.tnsif.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {

		char x = 'a';
		switch (x)
		{
		case 'l':
		case 'L':
			System.out.println(x + " is a leader ");
			break;
		case 'd':
		case 'D':
			System.out.println(x+ " is a Digital");
			break;
		case 'w':
		case 'W':
			System.out.println(x+ " is a Work");
			break;
		case 's':
		case 'S':
			System.out.println(x+ " is a Shubham");	
			break;
			
			default :
				System.out.println(x+" is other than letters provide ");
				break;
		}
		
	}

}
