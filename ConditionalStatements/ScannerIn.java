package com.scan;

import java.util.Scanner;

public class ScannerIn {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= s.nextInt();//integer input
		System.out.println("Entered value: " +num);
		System.out.println();
		s.nextLine();
		System.out.println("Enter name ");
		String name=s.nextLine();//string input
		System.out.println("Entered name: " + name);
		s.close();
		
	}

}
