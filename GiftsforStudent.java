package com.java.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftsforStudent {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<String> students=new ArrayList<String>();
		for(int count=1;count<=10;count++) {
			System.out.println("Enter the name:");
			String name=scanner.next();
			students.add(name);
		}		students.stream().filter(a->a.startsWith("A")).forEach(t->System.out.println(t));		
	}
}
