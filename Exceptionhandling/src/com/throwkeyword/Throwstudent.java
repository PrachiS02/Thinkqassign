package com.throwkeyword;

import java.util.Scanner;

public class Throwstudent 
{

	static Scanner sc=new Scanner(System.in);
	
	static void enterDetails()
	{
		System.out.println("Enter name:");
		String name=sc.next();
		
		System.out.println("Enter marks:");
		Double marks=sc.nextDouble();
		
		try
		{
		 if(marks<0||marks>100)
			throw new RuntimeException("Marks should be between 0 and 100");
		
		else
		{
			if(marks>40)
			{
			  System.out.println(name+" has cleared exam");
			}
			else
			{
				System.out.println(name+ " has not cleared exam");
			}
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	public static void main(String[] args) {
             enterDetails();

	}

}
