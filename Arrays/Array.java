package com.string;
import java.util.Scanner;
//Array example
public class Array {
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Students:");
		int size= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Name  of the students");
		String[] name= new String[size];
		for(int i=0; i<=name.length-1;i++)
		{
			System.out.println("Enter Name of the Student"+(i+1)+":");
			name[i]=sc.nextLine();
		}
		for(int i=0; i<= name.length-1;i++) {
			System.out.println("Name of Student"+(i+1)+":"+name[i]);
		}
		
		System.out.println();
		System.out.println("Surnames  of the students");
		String[] sur1= new String[size];
		for(int i=0; i<=sur1.length-1;i++)
		{
			System.out.println("Enter Surname of the Student"+(i+1)+":");
			sur1[i]=sc.next();
		}
		for(int i=0; i<= sur1.length-1;i++) {
			System.out.println("Surname of Student"+(i+1)+":"+sur1[i]);
		}

		System.out.println();
		System.out.println("Marks of the students");
		int[] marks= new int[size];
		for(int i=0; i<= marks.length-1;i++)
		{
			System.out.println("Enter marks of the Student"+(i+1)+":");
			marks[i]=sc.nextInt();
		}
		for(int i=0; i<= marks.length-1;i++) {
			System.out.println("Marks of Student"+(i+1)+":"+marks[i]);
		}
		
		
		System.out.println();
		System.out.println("Age's of the students");
		byte[] age= new byte[size];
		for(int i=0; i<= age.length-1;i++)
		{
			System.out.println("Enter Age of the Student"+(i+1)+":");
			age[i]=sc.nextByte();
		}
		for(int i=0; i<= age.length-1;i++) {
			System.out.println("Age of Student"+(i+1)+":"+age[i]);
		}
		
		System.out.println();
		System.out.println("sem Fee's of the students");
		short[] fee= new short[size];
		for(int i=0; i<= fee.length-1;i++)
		{
			System.out.println("Enter sem Fee of the Student"+(i+1)+":");
			fee[i]=sc.nextShort();
		}
		for(int i=0; i<= age.length-1;i++) {
			System.out.println("Sem Fee of Student"+(i+1)+":"+fee[i]);
		}
		
		
		System.out.println();
		System.out.println("Grades points of the students");
		float[] grade= new float[size];
		for(int i=0; i<=grade.length-1;i++)
		{
			System.out.println("Enter grade points of the Student"+(i+1)+":");
			grade[i]=sc.nextFloat();
		}
		for(int i=0; i<= grade.length-1;i++) {
			System.out.println("Grade points of the Student"+(i+1)+":"+grade[i]);
		}
		
		
		System.out.println();
		System.out.println( "father's income:");
		long[] income= new long[size];
		for(int i=0; i<=income.length-1;i++)
		{
			System.out.println("Enter father's income of the Student"+(i+1)+":");
			income[i]=sc.nextLong();
		}
		for(int i=0; i<= income.length-1;i++) {
			System.out.println("father's income of Student"+(i+1)+":"+income[i]);
		}
		
		System.out.println();
		System.out.println( "College fee:");
		double[] collegeFee= new double[size];
		for(int i=0; i<=collegeFee.length-1;i++)
		{
			System.out.println("Enter college fee of the Student"+(i+1)+":");
			collegeFee[i]=sc.nextDouble();
		}
		for(int i=0; i<= collegeFee.length-1;i++) {
			System.out.println(" college fee of Student"+(i+1)+":"+collegeFee[i]);
		}
		
		System.out.println();
		System.out.println( "Results of student:");
		boolean[] res= new boolean[size];
		for(int i=0; i<=res.length-1;i++)
		{
			System.out.println("Enter Result of the Student"+(i+1)+":");
			res[i]=sc.nextBoolean();
		}
		for(int i=0; i<= res.length-1;i++)
		{
			System.out.println("Result of Student"+(i+1)+":"+res[i]);
		}
		
		sc.close();	
	}
}
