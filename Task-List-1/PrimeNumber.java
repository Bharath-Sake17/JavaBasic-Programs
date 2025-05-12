package com.task;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println();
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		
		
		if(count==2)
		{
			System.out.println("--->Prime number");
		}
		else
		{
			System.out.println("--->Not prime number");
		}
	}

}
