package com.task;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two values");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		sc.nextLine();
		System.out.println("Operations : +  -  *  %  / ");
		System.out.println("Enter  Calculation Operation");
		char value= sc.nextLine().charAt(0);
		int result;
		
		switch(value)
		{
		   case '+':
			result= a+b;
			System.out.println("Output  :"+result);
		    break;
		   case '-':
				result= a-b;
				System.out.println("Output  :"+result);
			    break;
		   case '*':
				result= a*b;
				System.out.println("Output  :"+result);
			    break;
		   case '%':
				result= a%b;
				System.out.println("Output  :"+result);
			    break;
		   case '/':
				result= a/b;
				System.out.println("Output  :"+result);
			    break;
			    
		       
		   default:
			 System.out.println("Enter valid input");
		
		}
		
		
	}

}
