package com.java.task1;
import java.util.Scanner;
public class DiscountPrice {
	    public static void main(String[] args) {
	        //Getting input via STDIN
	    	System.out.println("Enter the amount");
	        Scanner obj = new Scanner(System.in);
	        double userInput = obj.nextInt();
	        double amount=0;
	        if(userInput<500){
	            amount=userInput;
	        }
	        else if(userInput>=500 && userInput<=1000){
	            amount=userInput*0.1;
	        }
	        else if(userInput>1000){
	            amount=userInput*0.2;
	        }
	        
	        System.out.println("The final payable amount is " + amount);
	    }
}
