package com.ifelse;

import java.util.Scanner;

public class CharCheck 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch=sc.next().charAt(0);
		if(ch>=48 && ch<=57)
		{
			System.out.println(ch+"  is number");
		}
		else
			System.out.println(ch+" is letter ");
	}
	
}
