package com.tnsif.dayseven.covarientoverridingdemo;

//parent class
class Colour {
	
	protected Colour getColour()
	{
		Colour s= new Colour();
		return s;
	}
}


//child class
class Red extends Colour {
	
	protected Red getColour() {
		
		Red s=new Red();
		return s;
		
	}
}

//child class
class Yellow extends Colour {
	
	protected Yellow getColour() {
		
		Yellow s=new Yellow();
		return s;
		
	}
}



public class CovarientOverRiding {

	public static void main(String[] args) {
		
		Colour c= new Colour();
		System.out.println(c.getColour());
		
		Red r = new Red();
		System.out.println(r.getColour());
		
		
		
		
	}
}
