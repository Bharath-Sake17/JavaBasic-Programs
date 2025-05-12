package com.tasks2;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int digit= sc.nextInt();
		int num=digit;
		int temp=num;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("Total digits: "+count);
		temp= num;
		int sumOf=0;
		int n;
		while(temp>0)
		{
			n= temp%10;
			sumOf+=Math.pow(n,count);
			temp/=10;
		}
		System.out.println("total of the digit:"+sumOf);
		
		if(digit == sumOf)
		{
			System.out.println("This is Amstrong number: "+ digit);
		}
		else {
			System.out.println("This is not Amstrong number: "+digit);
		}
		sc.close();
		
	}

}
