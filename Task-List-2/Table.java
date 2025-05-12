package com.tasks2;

import java.util.Scanner;

public class Table {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter which number multipaction you want:");
    	  int n = sc.nextInt();
    	  System.out.println("How many time you want:");
    	  int num= sc.nextInt();
    	  int temp=0;
    	  System.out.println("Multipaction table: ");
    	  for(int i=1;i<=num;i++)
    		  {   
    		     temp=i*n;
                 System.out.println(n +" * "+ i +" = " + temp);
    		  }
      }
 
}
 
