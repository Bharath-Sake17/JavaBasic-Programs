package com.methods;

import java.util.Scanner;

public class MethodsExample {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		MethodsExample s = new MethodsExample();
		System.out.println("Enter three numbers:");
		int one=sc.nextInt();
		int two= sc.nextInt();
		int three=sc.nextInt();
		
	   int d= s.sum(one,two,three);
	   System.out.println("Enter number for divison of the sum:");
	   int n=sc.nextInt();
	   int result = d/n;
	   System.out.println("Final result of method :"+result);
		sc.close();
	}
	int sum(int a, int b, int c)
	{
		int d= a+b+c;
		System.out.println("Sum of a + b +c :"+d); 
		return d;
	}
	

}
