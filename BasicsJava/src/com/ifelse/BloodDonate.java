package com.ifelse;

import java.util.Scanner;

public class BloodDonate 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Enter your Weight : ");
			float weight=sc.nextFloat();
			if(weight>=50)
				System.out.println("you can donate the blood....");
			else
				System.out.println("you are underweight and cannot donate the blood....");
			
		}
		else 
			System.out.println("you are too young to donate blood...");
				
        sc.close();
	}

}
