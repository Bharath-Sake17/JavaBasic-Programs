package com.string;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  int[][] arr= new int[2][2];
	  System.out.println("Enter array values:");
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr[i].length;j++)
		  {
			  arr[i][j]=sc.nextInt();
		  }
	  }
	  
	  System.out.println("Array is :");
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr[i].length;j++)
		  {
			  System.out.print(arr[i][j]+" ");
		  }
	  }
	}

}
//arr[0][0]=5;
//arr[0][1]=4;
//arr[1][0]=6;
//arr[1][1]=9;
