package com.string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ReverseString obj= new ReverseString();
		System.out.println("Enter String: ");
		String input= sc.nextLine();
	    System.out.println("Reverse of the given String:");
		obj.reverseString(input);

	}
	void reverseString(String S)
	{
		for(int i=S.length()-1;i>=0;i--)
		{
			System.out.print(S.charAt(i));
		}
	}

}
