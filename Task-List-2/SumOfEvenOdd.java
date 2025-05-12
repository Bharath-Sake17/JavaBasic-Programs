package com.tasks2;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		SumOfEvenOdd obj= new SumOfEvenOdd();
		System.out.println("Enter value of the n: ");
		long input= sc.nextLong();
		obj.find(input);

		sc.close();
	}
	
	void find(long n)
	{
		long evenSum=0;
		long oddSum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				evenSum+=i;
			}
			else
			{
				oddSum+=i;
			}
		}
		System.out.println("Sum of Even number: "+evenSum);
		System.out.println("Sum of Odd number : "+oddSum);
	}

}
