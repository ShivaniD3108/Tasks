package com.java.task2;

import java.util.Scanner;

public class Person {
	String name;
	private int age=18;

	public void displayName(String name1) {
		System.out.println("The name is " + name1 + ".");
	}

	public void displayAge() {
		System.out.println("The age is " + age + ".");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person person=new Person();
		System.out.println("Enter the name of the person: ");
		String name=scanner.nextLine();
		person.displayName(name);
		person.displayAge();
		
	}
	

}
