package com.ifelse;

import java.util.Scanner;

public class ExamCriteria {

	public static void main(String[] args) 
	{
		//per>80
		//total>75
        Scanner sc=new Scanner(System.in);
		
		System.out.println("enter total percentage : ");
		double totalper=sc.nextDouble();
		
		System.out.println("enter the per of 4 subjetcs : ");
		double best4=sc.nextDouble();
		
		if((totalper>75)||(best4>80))
		{
			System.out.println("congratulations!! you are eligible for admission process..");
		}
		else
		{
			System.out.println("Sorry!! better luck next time");
		}
        sc.close();
	}

}
