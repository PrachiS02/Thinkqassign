package com.containment;

import java.util.Scanner;

public class CollegeUser 
{
	static Scanner sc=new Scanner(System.in);
     static void enterStudentDetails(Student s)
     {
    	 System.out.println("Enter the Student id:");
    	 s.setSid(sc.nextInt());
    	 
    	 System.out.println("Enter the Student name:");
    	 s.setSname(sc.next());
    	 
    	 s.setCourse(new Course());
    	 System.out.println("Enter Course id:");
    	 s.getCourse().setCid(sc.nextInt());
    	 
    	 System.out.println("Enter course name: ");
    	 s.getCourse().setCname(sc.next());
    	 
    	 System.out.println("Enter Course Fees:");
    	 s.getCourse().setFees(sc.nextInt());
    	 
    	 
    	 
     }
	public static void main(String[] args)
	{
		Student s1=new Student();
		enterStudentDetails(s1);
		System.out.println(s1);
	}

}
