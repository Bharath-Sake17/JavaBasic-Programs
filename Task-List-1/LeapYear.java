package com.task;

import java.util.Scanner;

public class LeapYear {
     public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter Year: ");
		int year = s.nextInt();
		if(year%4==0 && year%100 !=0 || year%400 == 0)
		{
			System.out.println(year+ "  -->> This is Leap Year");
		}
		else
		{
			System.out.println(year + "  -->> This is not Leap year");
			
		}
	}
	
}
