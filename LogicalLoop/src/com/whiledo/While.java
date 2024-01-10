package com.whiledo;

import java.util.Scanner;

public class While {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=-1;
		int sum=0;
		
		while(num!=0)
		{
			System.out.println("enter any no : ");
			num=sc.nextInt();
			sum+=num;
			
			
		}
		System.out.println("sum is : "+sum);
	}

}
