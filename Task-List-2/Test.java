package com.tasks2;

public class Test {
	public static void main(String[] args) {
		 Student.schoolName="FLM";
		 System.out.println("Details of student 1  ");
		 // object creation
		Student student1= new Student();
		student1.studentName="Bharath";
		student1.stdRollNo=210201;
		student1.section="A-Section";
		student1.marks=80;
		student1.testScore();
		System.out.println();
		System.out.println("Name of the school: "+Student.schoolName);
		System.out.println("Student Name      : "+student1.studentName);
		System.out.println("RollNo            : "+student1.stdRollNo);
		System.out.println("Section           : "+student1.section);
		System.out.println("Marks             : "+student1.marks);
		System.out.println("Final Exam result : "+student1.testScore());
		System.out.println();
		System.out.println("Details of student 2  ");
		Student student2= new Student();
		student2.studentName="Raghu";
		student2.stdRollNo=210185;
		student2.section="C-Section";
		student2.marks=85;
		student2.testScore();
		System.out.println();
		System.out.println("Name of the school: "+Student.schoolName);
		System.out.println("Student Name      : "+student2.studentName);
		System.out.println("RollNo            : "+student2.stdRollNo);
		System.out.println("Section           : "+student2.section);
		System.out.println("Marks             : "+student2.marks);
		System.out.println("Final Exam result : "+student2.testScore());
		System.out.println();
		System.out.println("Details of student 3 ");
		Student student3= new Student();
		student3.studentName="Nikhil";
		student3.stdRollNo=210195;
		student3.section="B-Section";
		student3.marks=90;
		student3.testScore();
		System.out.println();
		System.out.println("Name of the school: "+Student.schoolName);
		System.out.println("Student Name      : "+student3.studentName);
		System.out.println("RollNo            : "+student3.stdRollNo);
		System.out.println("Section           : "+student3.section);
		System.out.println("Marks             : "+student3.marks);
		System.out.println("Final Exam result : "+student3.testScore());
		
		Student student4= new Student(210202,"Manju","B- Section",99);
		
	}

}
