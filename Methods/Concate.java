package com.methods;

import java.util.Scanner;

public class Concate {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Concate c= new Concate();
		System.out.println("Enter first name: ");
		String name1= sc.nextLine();
		System.out.println("Enter middele name: ");
		String name2= sc.nextLine();
		System.out.println("Enter last name: ");
		String name3= sc.nextLine();
		String com= c.combine(name1,name2,name3);
		System.out.println("Concatanation of Name's: "+com);
		sc.close();
		
	}
	
	String combine(String first, String second, String third)
	{
		String com= first+second+third;
		return com;
		
	}

}
