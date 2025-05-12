package com.task;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which table you want:  ");
		int n = sc.nextInt();
		int result;
		System.out.println("How many time you want table ex..10,20 or 30..");
		int a= sc.nextInt();
		System.out.println();
		System.out.println("Table-> "+ n);
		System.out.println();
		
		
		for(int i = 1 ; i<= a ; i++)
		{
			result = i * n;
			System.out.println(n + " * " + i + " = "+ result);
		}
		sc.close();
	}

}
