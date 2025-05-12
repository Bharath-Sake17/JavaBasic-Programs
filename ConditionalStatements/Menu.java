package com.task;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println("      Menu Items  ");
		System.out.println();
		System.out.println("1 -> Chicken 65");
		System.out.println("2 -> Paneer Biriyani");
		System.out.println("3 -> Veg Biriyani");
		System.out.println("4 -> Chicken Mandi");
		System.out.println();
		
		System.out.println("Please enter yours option:");
		Scanner sc= new Scanner(System.in);
	    int food = sc.nextInt();
	    
	    if(food == 1)
	    {
	    	System.out.println("Yours Chicken 65 order is placed successfully");
	    }
	    else if(food == 2) 
	    {
	    	System.out.println("Yours Paneer Biriyani order is placed successfully");
	    }
	    else if(food == 3)
	    {
	    	System.out.println("Yours Veg Biriyani  order is placed successfully");
	    }
	    else if(food == 4)
	    {
	    	System.out.println("Yours Chicken Mandi  order is placed successfully");
	    }
	    
	    else
	    {
	    	System.out.println("Sorry !!! for that .....Out of stock");
	    }
	}

}
