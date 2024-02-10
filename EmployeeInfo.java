package com.java.task2;
class Person1{
	String name;
	int age;
	//Base class constructor
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String displayInfo() {
		return ("Name: " + name +"\nAge: " + age);
	}
}
class Employee extends Person1{

	private int employeeID;
	private int salary;

	public Employee(String name, int age,int employeeID,int salary) {
		super(name, age);
		this.employeeID = employeeID;
		this.salary = salary;
	}
	@Override
	public String displayInfo() {
		return (super.displayInfo()+"\n"+"Employee ID: " + employeeID+"\nSalary: " + salary);
	}
}
public class EmployeeInfo {
	public static void main(String[] args) {
		Employee employee=new Employee("John",30,2024001,650000);
		System.out.println(employee.displayInfo());
		
	}
	
}
