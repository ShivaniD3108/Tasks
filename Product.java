package com.java.task2;

import java.util.Scanner;

class Product {
	private int pid;	
	private double price;
	private int quantity;

	public Product(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	public int getPid() {
		return pid;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}	
}
class Bill{
	public static Product[] productInfo() {
		Scanner scanner=new Scanner(System.in);
		Product[] details=new Product[5];
		for(int num=0;num<5;num++) {
		System.out.println("Enter details of the product:");
		System.out.println("Enter id: ");
		int pid = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        Product info=new Product(pid,price,quantity);
        details[num]=info;
	}
	return details;
	}
	public static int pidWithHighestPrice(Product[] details) {
		int maxPid=0;
		double maxPrice=0;
		for(Product info: details) {
			if(info.getPrice()>maxPrice) {
				maxPrice=info.getPrice();
				maxPid=info.getPid();
			}
		}
		return maxPid;
	}
	public static double totalAmount(Product[] details) {
		double totalAmount=0;
		for(Product info: details) {
			totalAmount+=info.getPrice()*info.getQuantity();
			}
		return totalAmount;
		}	
	public static void main(String[] args) {
		
		Product[] products=productInfo();
		
		System.out.println("Product id with highest price is "+pidWithHighestPrice(products));
		System.out.println("Total amount spent on all products: "+totalAmount(products));
		
		
		
	}
}