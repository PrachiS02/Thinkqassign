package com.basic1;

import java.util.Scanner;

public class ScanAvg {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Float num1,num2,num3,avg;
		
		System.out.println("Enter Num1 : ");
		num1=sc.nextFloat();
		System.out.println("Enter Num2 : ");
		num2=sc.nextFloat();
		System.out.println("Enter Num3 : ");
		num3=sc.nextFloat();
		avg=(num1+num2+num3)/3;
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
	    System.out.println("Num3 : "+num3);
	    System.out.println("---------------------------");
		System.out.println("Average of three Number : "+avg);
		
		sc.close();
		
	}

}
