package com.string;
import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   
	   //String deceleration
	   
	   System.out.println("Enter first String:");
	   String s1= s.nextLine();
	   System.out.println("Enter Second String:");
       String s2= s.nextLine();
       System.out.println("Enter third String:");
	   String s3= s.nextLine();
	   System.out.println("Enter Fourth String:");
	   String s4= s.nextLine();
   
	   //String methods
	   
	   System.out.println(s1.equals(s2));
	   System.out.println(s1.charAt(0));
	   System.out.println(s1.length());
	   System.out.println(s3.isEmpty());
	   System.out.println(s4.isBlank());
	   System.out.println(s1.trim());
	   System.out.println(s1.toLowerCase());
	   System.out.println(s2.toUpperCase());
	   System.out.println(s1.substring(0,2));
	   
	}
}
