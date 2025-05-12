package com.operator;

public class TernaryOp {
	public static void main(String[] args) {
		
		 int num=95;
		 //Ternary operator
		 String result= (num<=100 && num>90) ? "Grade A":
			            (num<=90 && num>70) ? "Grade B":
				        (num<=70 && num>50)? "Grade C" :
		                (num<=50 && num>0)? "Fail"     :
		                 "Enter valid Marks";
		 System.out.println("Results Status");
		 System.out.println("Input : " + num + " -> " + " Output : " +result);
	}

}
