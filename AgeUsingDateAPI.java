package com.java.task5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class UnspecifiedFormatException extends Exception {
	public UnspecifiedFormatException(String message) {
		System.out.print(message);
	}
}
public class AgeUsingDateAPI {
	public static void main(String[] args)throws UnspecifiedFormatException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date of birth in yyyy-mm-dd format: ");
			String dob=scanner.nextLine();
			String regex="((?:19|20)[0-9][0-9])-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(dob);
			boolean match=matcher.find();			
				try{
					if(match==true) {
				
					LocalDate currentDate=LocalDate.now();
					System.out.println("Current date: "+currentDate);
					DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
					LocalDate dateOfBirth=LocalDate.parse(dob,dateFormatter);
					Period period=Period.between(dateOfBirth,currentDate);
					System.out.println("Difference in days: " +period.getDays());
					System.out.println("Difference in months: " +period.getMonths());
					System.out.println("Difference in years: " +period.getYears());
			}
				else {
					throw new UnspecifiedFormatException("Format of DOB is invalid");
				}
				}
				catch(UnspecifiedFormatException e) {
					System.out.print(e.getMessage());
				}
	}
	}
