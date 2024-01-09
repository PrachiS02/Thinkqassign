package com.conditional;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Num1 : ");
		double num1=sc.nextDouble();
		System.out.println("Enter Num2 : ");
		 Double num2=sc.nextDouble();
		 
		System.out.println("enter any one operation : ");
		System.out.println("+ ");
		System.out.println("- ");
		System.out.println("*");
		System.out.println("/");
		System.out.println("%");
		System.out.println("-----------------------------");
		 char op=sc.next().charAt(0);
	    
		 System.out.println("-----------------------------"); 
		 if(op=='+')
		 
			 System.out.println(" the addition of " +num1+ " and " +num2+ " is : "+(num1+num2));
			 else if(op=='-')
			    System.out.println("the substraction of "+num1+ " and " +num2+ " is : "+(num1-num2));
			 else if(op=='*')
				    System.out.println("the multiplication of "+num1+ " and " +num2+ " is : "+(num1*num2));
			 else if(op=='/')
				    System.out.println("the division of "+num1+ " and " +num2+ " is : "+(num1/num2));
			 else if(op=='%')
				    System.out.println("the modulus of "+num1+ " and " +num2+ " is : "+(num1%num2));
		 
         else 
        	 System.out.println("invalid input");
				 
		 
		

	}

}
