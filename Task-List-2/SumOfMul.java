package com.tasks2;

import java.util.Scanner;

public class SumOfMul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SumOfMul s= new SumOfMul();
		System.out.println("Enter value of num: ");
		int input = sc.nextInt();
		s.sumOfMultiples(input);
		
		
	}
	void sumOfMultiples(int num)
	{    int sumThree=0;
	     int sumFive=0;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0)
			{
				sumThree+=i;
			}
			else if(i%5==0)
			{
				sumFive+=i;
			}
		}
		System.out.println("Multiples of 3 : "+sumThree);
		System.out.println("Multiples of 5 : "+sumFive);
		int temp= sumThree+sumFive;
		System.out.println("Total : "+temp);
	}
}

 