package com.tasks2;

import java.util.Scanner;

public class LargeDig {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n= s.nextInt();
		int orginalValue=n;
		
		int temp=n;
//		int count=0;
//		while(temp>0)
//		{
//			temp= temp/10;
//			count++;
//		}
//		System.out.println("Total number of digits: "+count);
		int large=0;
		while(orginalValue>0)
		{
			int digit =orginalValue%10;
			if(digit>large)
			{
				large=digit;
			}
			orginalValue/=10;
			
		}
		System.out.println("Largest Digit in "+n+"  is  "+large);
	}

}
