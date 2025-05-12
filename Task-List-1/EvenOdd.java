package com.task;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :  ");
		int n= sc.nextInt();
		
		if(n%2 == 0)
		{
			if(n%5 == 0)
			{
				System.out.println(n + " Even number & divisible by 5");
			}
			else
			{
				System.out.println(n + " Even number & not divisible by 5 ");
			}
		}
		else
		{
			System.out.println(n  + "  Given number is Odd number");
		}
		
	}

}
