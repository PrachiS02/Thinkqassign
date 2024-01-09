package com.switchassgn;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		float c,num1,num2;
		
		System.out.println("enter the number1 : ");
		 num1=sc.nextFloat();
		
		System.out.println("enter the number2 : ");
		 num2=sc.nextFloat();
		
		System.out.println("---------------------------------------");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		System.out.println("---------------------------------------");
		System.out.println("Enter your choice : ");
		ch=sc.nextInt();
		System.out.println("-------------------------------------------");
		switch(ch)
		{
		case 1 :
			 c=num1+num2;
			 System.out.println("Addition : "+c);
			 break;
		case 2 :
			 c=num1-num2;
			 System.out.println("Substraction : "+c);
			 break;
		case 3 :
			 c=num1*num2;
			 System.out.println("Multiplication : "+c);
			 break;
		case 4 :
			 c=num1/num2;
			 System.out.println("Division : "+c);
			 break;
		case 5 :
			System.exit(0);
		default:
			System.out.println("wrong choice");
		}
		System.out.println("-------------------------------------------");
	}

}
