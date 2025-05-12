package com.string;
import java.util.Scanner;

public class Methods {
	
	//Example for methods
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Methods obj= new Methods();
		System.out.println("Enter first value :");
		int value1= sc.nextInt();
		System.out.println("Enter second value:");
		int value2= sc.nextInt();
		System.out.println("Addition of these two values:");
		int c= obj.add(value1, value2);
		sc.nextLine();
		System.out.println("Result : "+c);
		System.out.println();
		System.out.println("Enter firstname :");
		String first=sc.nextLine();
		System.out.println("Enter lastname  :");
		String second=sc.nextLine();
		obj.Names(first, second);
				
	}
	int add(int a , int b)
	{
		int c = a+b;
		return c;
	}
	
	void Names(String firstName, String lastName) 
	{
		String fullName= firstName+lastName;
		System.out.println("Full_Name : "+fullName);
	}

}
