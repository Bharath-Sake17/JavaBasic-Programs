package com.task;

import java.util.Scanner;

public class CountOfDigit {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		System.out.println("re-enter number:");
		int num=sc.nextInt();
		int count=0;
		int store=0;
		int lastNum=0;
		int add=0;
		while(n>0)
		{   
			n= n/10;
			count++;
			
		}
		System.out.println("No of digits:  "+count);
		
		
		//System.out.println(add);
	}

}
