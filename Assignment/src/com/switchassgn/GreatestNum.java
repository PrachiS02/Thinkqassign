package com.switchassgn;

import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number1 : ");
		int num1=sc.nextInt();
		
		System.out.println("enter the number2 : ");
		int num2=sc.nextInt();
		
		switch(num1>num2?0:1)
		{
		case 0 :
			System.out.println(num1+" is greatest number");
			break;
		case 1 :
			System.out.println(num2+" is greatest number");
			break;
		default:
			System.out.println("error");
		}

	}

}
