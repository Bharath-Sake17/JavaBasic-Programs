
package com.tasks2;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strating number: ");
		int firstNum=sc.nextInt();
		System.out.println("Enter Last number: ");
		int lastNum= sc.nextInt();
		System.out.println("List of prime number between "+firstNum+ " to "+lastNum+" :");
		int sum=0;
		for(int num=firstNum;num<=lastNum;num++)
		{   
			int count=0;
			if(num!=1 )
			{
				for(int i=2;i<=lastNum;i++)
				{   if(num%i==0)
					    count++;
				       
				}
			}
			if(count==1 && count!=0)
			{
				System.out.println(num);
				sum+=num;
			}
			
			
		}
		System.out.println("Sum of prime numbers between " +firstNum+" to "+ lastNum+"  :"+sum);
		
		sc.close();
		
	}

}
