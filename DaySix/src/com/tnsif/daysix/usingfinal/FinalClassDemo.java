package com.tnsif.daysix.usingfinal;




final class FinalClass{
	
	void show () {
		System.out.println("Final class cannot be inherited ");
	}
}

//can't create child classes from final class, Ex: String , Wrapper class, System, Scanner, Number are final classes



public class FinalClassDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalClass f1 = new FinalClass();
		f1.show();
	}

}
