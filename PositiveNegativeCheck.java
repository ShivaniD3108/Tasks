package com.java.task1;
import java.util.Scanner;
public class PositiveNegativeCheck {
	    public static void main(String[] args) {	        
	        //Getting input via STDIN
	    	System.out.println("Enter the number");
	        Scanner obj = new Scanner(System.in);
	        double userInput = obj.nextDouble();
	        if(userInput!=0){
	            if(userInput>0){
	            System.out.println(userInput + " is a positive integer.");
	            }
	            else{
	            System.out.println(userInput + " is a negative integer.");
	            }
	        }
	        else{
	            System.out.println("The input is neither negative nor positive.");
	        }
	    }
	}

