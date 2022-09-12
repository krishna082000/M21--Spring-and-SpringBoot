package com.example.demo;

public class Employee
{
	private int ID;
	private String Emp_name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	//constructor
	public Employee()
	{
		System.out.println("employee details");
	}
	
	public void print()
	{
		System.out.println("IT Department");
	}
}
