package com.java.task1;
import java.util.Scanner;
public class SmallestOfThree {
	    public static void main(String[] args) {
	        //Getting input via STDIN
	        Scanner obj = new Scanner(System.in);
	        int a = obj.nextInt();
	        int b = obj.nextInt();
	        int c = obj.nextInt();
	        
	        int smallest=a;
	        if(b<smallest){
	            smallest=b;}
	        if(c<smallest){
	            smallest=c;
	        }
	        System.out.println(smallest + " is the smallest number.");
	    }
	}

