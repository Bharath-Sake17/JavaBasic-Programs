package com.tasks2;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int temp=n;
		int result=0;
		int rev=0;
		while(n>0)
		{
			result = n%10;
			rev = rev*10 + result;
			n/=10;
		}
		if(temp == rev) {
			System.out.println("Given number is an Palindrome: "+rev);
		}
		else
		{
			System.out.println("Given number is Not a palindrome !!!!!! ");
		}
		
	}
	

}
