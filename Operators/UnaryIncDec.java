package com.operator;

public class UnaryIncDec {
	public static void main(String[] args) {
		//short age=20;
		//unary plus
		int age=20;
		int one = +age;
		//short score= -25;
		//unary minus
		int marks= 34;
		int two= -marks;
		System.out.println(one);
		System.out.println(two);
		
		//post& pre Increment
		int preInc= ++age;
		int postInc=age++;
		System.out.println("pre-increment: "+ preInc);
		System.out.println("post-increment: "+ postInc);
		System.out.println("After-increment: "+age);
		
		//post & pre Decrement
		int preDec= --marks;
		int postDec=marks--;
		System.out.println("pre-decrement: "+preDec);
		System.out.println("post-decrement: "+postDec);
		System.out.println("After-decrement: "+marks);
		
	}

}
