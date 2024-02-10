package com.java.task3;

import java.util.Scanner;

public class Days {
	public static void main(String[] args) throws IndexOutOfBoundsException{
		Scanner scanner=new Scanner(System.in);
		String [] days= {"Sunday","Monday","Tuesday","Wednesday", "Thursday","Friday", "Saturday"};
		System.out.println("Enter the position of the day: ");
		int position=scanner.nextInt();
		try {	
			System.out.println("The day is"+ days[position]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+".Enter a value between 0 to 6.");
		}
		
	}

}
