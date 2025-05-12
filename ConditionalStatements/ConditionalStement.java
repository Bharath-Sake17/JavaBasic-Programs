package com.scan;

import java.util.Scanner;

public class ConditionalStement {

	public static void main(String[] args) {
		
//		//if & else statement
	Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a value : ");
//		int a= sc.nextInt();
//		
//		if(a>0)
//		{
//			System.out.println("Entered value is Positive");
//		}
//		else if(a==0){
//			System.out.println("Entered value is Zero");
//		}
//		else
//		{
//			System.out.println("Entered value is Negative");
//		}
		
		
		//even or odd
		//n%2 =0
		
		System.out.println("Enter Number: ");
		int n= sc.nextInt();
		
		if(n%2 == 0)
			{
			 System.out.println("This is Even number");	
			}
		else
		{
			System.out.println("This is odd number");
		}
		
		
		sc.close();
	}
}

