package com.task;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			if(i% 8 == 0)
			{
				System.out.println("Continue is Activated");
				continue;
           	}
			   System.out.println(i);

		}
		for(int i=1 ; i<=n ; i++){

			if(i%5 ==0)
			{
				System.out.println("Break is activated");
				break;
			}
			System.out.println(i);
		}	
				
		}
		
	}

