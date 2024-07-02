package com.tnsif.dayfive.multilevelinheritance;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {

		City c=new City();
		c.setCityName("Pune");
		c.setArea(23000.50f);
		c.setCapital("Delhi");
		c.setCountryName("India");
		c.setStateName("maharashtra");
		c.setLanguage("Marathi");
		
		System.out.println(c);
	}

}
