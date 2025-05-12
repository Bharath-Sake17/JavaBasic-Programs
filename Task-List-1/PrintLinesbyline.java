package com.task;

import java.util.Scanner;

public class PrintLinesbyline {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value: ");
		String str= sc.nextLine();
		
		int length = str.length();
		System.out.println(length);
		
		for(int i=0; i<length ;i++)
		{
			System.out.println(str.charAt(i));
		}
		
	}

}
