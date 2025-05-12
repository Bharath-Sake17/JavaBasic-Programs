package com.tasks2;

// Here Student is an class
public class Student {
	static String schoolName;
	String studentName;
	int stdRollNo;
	String section;
	int marks;
	
	// constructor creation
	Student()
	{
		
	}
	Student(int stdRollNo,String studentName,String section,int marks)
	{
		stdRollNo= stdRollNo;
		studentName=studentName;
		section = section;
		marks = marks;
		
	}
    int testScore()
	{    
		return marks +=5;
	}
}
