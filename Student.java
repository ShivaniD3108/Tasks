package com.java.task3;

class AgeNotWithinRangeException extends Exception{
	public AgeNotWithinRangeException(String message) {
		super(message);
	}
}

class NameNotValidException extends Exception{
	public NameNotValidException(String message) {
		super(message);
	}
}
public class Student
{
	int rollNumber;
	String name;
	int age;
	String course;
	
	//Parameterized constructor for class Student
	public Student(int rollNumber, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException  {
		setRollNumber(rollNumber);
		setName(name);
		setAge(age);
		setCourse(course);
	}
		
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}

	public void setName(String name)throws NameNotValidException{
		if(!name.matches("^[a-zA-Z\\s]+$")){
			throw new NameNotValidException("Name should neither contain numbers nor special characters");
		}
		else {
			this.name = name;
		}
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeNotWithinRangeException {
		if(age<15 || age>21) {
			throw new AgeNotWithinRangeException("Age not within range!");
		}
		else {
			this.age = age;
		}
	}
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	public static void main(String[] args) {
		try{
			Student student=new Student(1,"John",22,"Chemistry");
			System.out.println("Roll Number: "+student.getRollNumber());
			System.out.println("Name: "+student.getName());
			System.out.println("Age: "+student.getAge());
			System.out.println("Course: "+student.getCourse());
		}catch(AgeNotWithinRangeException | NameNotValidException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
