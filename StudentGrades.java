package com.java.task3;

import java.util.HashMap;
import java.util.Map.Entry;
public class StudentGrades {
	HashMap<String,Integer> student=new HashMap();
	public void addStudent(String name, int grade) {
		student.put(name, grade);
	}
	public void removeStudent(String name) {
		student.remove(name);
	}
	public void displayStudentByGrade(int grade) {
		for(Entry<String,Integer> entry:student.entrySet()) {
			if(entry.getValue()==grade) {
				System.out.println("The student with grade "+ grade + " is "+ entry.getKey());
			}
		}		
	}
	public void displayAll() {
		for(String i:student.keySet()) {
			System.out.println("Name: "+i+" Grade: "+student.get(i)+"\n");
		}
	}
	public static void main(String[] args) {
		StudentGrades report=new StudentGrades();	
		report.addStudent("Kalai",3);
		report.addStudent("Muthu",2);
		report.addStudent("Feni",1);
		report.addStudent("Deepak",6);
		report.displayStudentByGrade(6);
		report.removeStudent("Feni");
		report.displayAll();
	}	
}
