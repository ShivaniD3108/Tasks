package com.java.task3;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class Voter {
	int voterId;
	String name;
	int age;
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
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
	public void setAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Invalid age for voter");
		}
		this.age = age;
	}
	
	public Voter(int voterId, String name, int age) throws InvalidAgeException{
		setVoterId(voterId); 
		setName(name);
		setAge(age);
	}
	public static void main(String[] args) {
		try {
			Voter voter=new Voter(1,"Hepsi",12);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
