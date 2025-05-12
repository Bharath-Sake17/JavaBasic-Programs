package com.tasks2;

import java.util.Scanner;

public class KeepAccept {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values: ");
	    int value;
	    int sum=0;
	    while(true)
	    	{ 
	    	  value=sc.nextInt();
	    	  if(value == 0)
	    	  {
	    		  System.out.println("You entered Zero 0 ,so sum is activited");
	    		  break;
	    	  }
	    	  sum+=value;
	    		
	    	}
	    System.out.println("sum : " +sum);
	    sc.close();
	    
	    }
	
	}
