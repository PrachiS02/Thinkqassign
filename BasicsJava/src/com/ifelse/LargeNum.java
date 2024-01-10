package com.ifelse;

import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter Num2 : ");
		int num2=sc.nextInt();
		
		if(num1>num2)
			System.out.println(num1+" is large number...");
		else
			System.out.println(num2+" is small number...");
		sc.close();

	}

}
