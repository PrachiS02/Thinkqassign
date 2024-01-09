package com.conditional;

import java.util.Scanner;

public class NumberAll {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		
		if(n>0)
			System.out.println(n+" is positive number...");
		else
			System.out.println(n+" is negative number...");
		
        sc.close();
	}

}
