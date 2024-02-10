package com.java.task1;

public class PatternWithFive {
	    public static void main(String[] args) {
	        for(int num=5;num>=1;num--) {
		            for(int i=5;i>=1;i--){
		                if(i<=num){
		                    System.out.print(num + " ");
		                }
		                else{
		                    System.out.print(i + " ");
		                }
		        
		            }
		            System.out.println();
		        }
	    }
}
