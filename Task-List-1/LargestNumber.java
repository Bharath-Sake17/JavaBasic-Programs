package com.task;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a= s.nextInt();
		System.out.println("Enter Second number: ");
		int b= s.nextInt();
		System.out.println("Enter Third number");
		int c= s.nextInt();
		System.out.println();
		if(a>b)
		{
			System.out.println(a+" Is Largest number");
		}
		else if(b>c) {
			System.out.println(b + " Is Largest number");
		}
		else if (a>c)
		{
			System.out.println(a+" Is Largest number");
		}
		else {
			System.out.println(c + " Is Largest number");
		}
		
	}
}
