package com.switchassgn;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		switch(n%2)
		{
		case 0:
			System.out.println(n+" is even number");
			break;
		case 1:
			System.out.println(n+" is odd number ");
		    break;
		default :
			System.out.println("error");
			break;
		}

	}

}
