package com.scan;

public class Pattern {
	
	public static void main(String[] args) {
		
//		for(int i=1; i<=4;i++)
//		{
//			//System.out.print(i);
//			for(int j=i;j<=4;j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
		
		
		
		for(int i=1; i<=5;i++)
		{
			//System.out.print(" * ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		
        System.out.println();
//		
		for(int i=1; i<=5;i++)
		{
			//System.out.print("*");
			for(int j=i;j<=5;j++)
			{
			   System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println();
		for(int i=5; i>=1;i--)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(" " +j+ " ");
				//System.out.print(i);
			}  
			System.out.println();
		}
		
		
		
//		for(int k=5; k<=1;k++)
//		{
//			//System.out.print(" * ");
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
	}

}
