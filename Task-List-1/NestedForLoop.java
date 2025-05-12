package com.task;

public class NestedForLoop {
	public static void main(String[] args) {
		
		outer:      //outer loop break --->> Label
		for(int i = 1 ; i<=3 ; i++)
		{
			for(int j=1 ; j <= 3 ; j++)
			{
				if(j == 2)
				{
					break outer;
				}
				System.out.println("i :"+ i + "  j :"+ j);
			}
		}
	}

}
