package com.ifelse;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int age;
		System.out.println("Enter the Age : ");
		age=sc.nextInt();
		
		if(age>=18)
			System.out.println("Eligible for voting....");
		else
			System.out.println("Not Eligible for voting...");
	}

}
