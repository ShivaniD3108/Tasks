package com.java.task2;

class NegativeBalanceException extends Exception {
	public NegativeBalanceException(String message) {
		super(message);
	}
}

public class Account {
	private double balance;
	private int pin;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}		
	public Account() {
		setBalance(0.0);
	}

	public Account(int pin,double initialBalance) {
		this.pin=pin;
		this.setBalance(initialBalance);
	}
	
	public void displayBalance() {
			System.out.println("Current Balance: "+ getBalance());
		
	}
	public void deposit(double depositAmount) {
		if(depositAmount>0) {
			setBalance(getBalance() + depositAmount);
			System.out.println("Deposit Successful");
		}
		else {
			System.out.println("Invalid deposit amount.Amount must be greater than 0.");
		}	
	}
	public void withdraw(double withdrawAmount) throws NegativeBalanceException {
		if(balance-withdrawAmount<0) {
			throw new NegativeBalanceException("Insufficient fund");
		}
		else {
			balance-=withdrawAmount;
			System.out.println("Withdrawal successful");
		}
		
//		if(withdrawAmount>0 && withdrawAmount<=balance) {
//			balance-=withdrawAmount;
//			System.out.println("Withdrawal successful");
//		}
//		else {
//			System.out.println("Invalid withdrawal amount or Insufficient Bank balance!");
//		}
	}
	public static void main(String[] args)  {
		Account account1=new Account();//usage of default constructor
		account1.deposit(500);
		try{
			account1.withdraw(1500);
		}catch(NegativeBalanceException ex) {
			System.out.println(ex.getMessage());
		}
		account1.displayBalance();
		
		Account account2=new Account();//usage of constructor with two arguments
		account2.deposit(1000);
		try{
			account1.withdraw(500);
		}catch(NegativeBalanceException ex) {
			System.out.println(ex.getMessage());
		}
		account2.displayBalance();
		
	}

	
}

		