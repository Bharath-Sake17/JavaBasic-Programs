package com.string;

public class ReverseArray {
      public static void main(String[] args) {
    	  ReverseArray s= new ReverseArray();
    	  int[] arr= {1,5,7,90,3};
    	  s.reverse(arr);
		
	}
      void reverse(int[] arr)
      {    
    	  int[] nArr= new int[arr.length];
    	  int j=0;
    	  for(int i=arr.length-1;i>=0;i--)
    	  {
    		  nArr[j]= arr[i];
    		  j++;
    	  }
    	  System.out.println(nArr);
      }
}

