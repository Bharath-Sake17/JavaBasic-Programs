package com.string;
import java.util.Scanner;
public class LargeSmall {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array values:");
		int [] val= {1,10,25,6,34,980,89};
		LargeSmall.laargeSmall(val);
	}
	public static void laargeSmall(int[] val)
	{
	int max=val[0];
	int min=val[0];
	for(int i=0; i<=val.length-1;i++)
	{
		if(val[i]>max)
		{
			max=val[i];
		}
	    if(val[i]<min)
	    {
	    	min= val[i];
	    }
	}
System.out.println(max);
System.out.println(min); 
	}

}
