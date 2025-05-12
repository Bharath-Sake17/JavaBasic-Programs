
package com.task;

import java.util.Scanner;

public class ProductDiscount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("No of Products: ");
		int noOfProducts = sc.nextInt();
		
		System.out.println("Cost of Each Product:");
		int cost=sc.nextInt();
		System.out.println("Is user has Premimum:  ");
	    boolean hasPremium= sc.nextBoolean();
	    
	    int productTotal= noOfProducts*cost;
	    System.out.println("-->Product total cost: "+productTotal);
	    int disCount= noOfProducts*100;
	    
	    if(hasPremium== true)
	    {
	    	int discount= productTotal-disCount;
	    	System.out.println("-->Final price of the product(with discount): " + discount);
	    }
	    else
	    {
	    	System.out.println("-->Final price of the product( without discount): "+productTotal);
	    }
	    
		
	}

}
