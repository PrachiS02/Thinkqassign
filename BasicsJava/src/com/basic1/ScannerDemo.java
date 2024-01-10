package com.basic1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int No;
		String name;
		float marks;
		char grade;
		
		System.out.println("Enter Roll No : ");
		No=sc.nextInt();
		
		System.out.println("Enter Name : ");
		name=sc.next();
		
		System.out.println("Enter marks : ");
		marks=sc.nextFloat();
		
		System.out.println("Enter grade : ");
		grade=sc.next().charAt(0);
		
		System.out.println("------------------------------");
		
		System.out.println("RollNo:"+No+"Name:"+name);
		System.out.println("Marks:"+marks+"grade:"+grade);
		
		
		
		

	}

}
