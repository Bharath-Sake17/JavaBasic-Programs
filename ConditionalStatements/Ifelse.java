package com.scan;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :  ");
		int marks= sc.nextInt();
		System.out.println("Result  :  ");
		
		if(marks>90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>70 && marks<=90)
		{
			System.out.println("Grade B");
		}
		else if(marks>35 && marks<=70)
		{
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
		
		sc.close();
		
		
		// nested if
		
	}
   
}
