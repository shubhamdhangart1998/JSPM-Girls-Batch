package com.tnsif.dayfive.association.IsA;

public class Manager extends Employee {
	
	private int teamSize;

	public Manager() {
		super();
	}

	public Manager(String name, int employeeId, String department,int teamSize) {
		super( name,  employeeId,  department);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getName()=" + getName() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getDepartment()=" + getDepartment() + "]";
	}
	
	

}
