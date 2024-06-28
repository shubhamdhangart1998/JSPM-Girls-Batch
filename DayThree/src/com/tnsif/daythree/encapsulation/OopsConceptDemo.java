package com.tnsif.daythree.encapsulation;

public class OopsConceptDemo {

	private int serilaNum;
	private String name;
	private int age;
	public int getSerilaNum() {
		return serilaNum;
	}
	public void setSerilaNum(int serilaNum) {
		this.serilaNum = serilaNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//object class method - to return string representation of the object 
	@Override
	public String toString() {
		return "OopsConceptDemo [serilaNum=" + serilaNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
