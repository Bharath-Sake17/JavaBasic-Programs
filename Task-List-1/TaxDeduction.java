package com.task;

import java.util.Scanner;

public class TaxDeduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary of the Employee: ");
		long salary= sc.nextLong();
		System.out.println();
	    long tax;
		
		if(salary<250000)
		{
		  System.out.println("No tax deduction");
		}
		else if(salary>=250000 && salary<500000)
		{
//			tax= 5 * salary /100;
			tax=  salary /20;
			System.out.println("Tax for the salary of " + salary + " is: "+tax);	
		}
		else if(salary>=500000 && salary<1000000)
		{
//			tax=25 * salary /100;
			tax=salary /4;
			System.out.println("Tax for the salary of " + salary+ " is: "+tax);	
		}
		else if(salary>=1000000)
		{
//			tax= 50 * salary /100;
			tax= salary /2;
			System.out.println("Tax for the salary of " + salary+ " is: " +tax);
		}
		
	}

}
