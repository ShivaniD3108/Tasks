package com.java.task1;
import java.util.Scanner;
public class NumberReverse {
	    public static void main(String[] args) {
	        //Getting input via STDIN
	        Scanner obj = new Scanner(System.in);
	        int userInput = obj.nextInt();
	        int rev=0;
	        while(userInput!=0){
	            int dig=userInput%10;
	            rev=rev*10+dig;
	            userInput/=10;
	        }
	        System.out.println(rev);
	        
	    }
	}

