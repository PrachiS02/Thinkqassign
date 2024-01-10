package com.whiledo;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0;
		int sum=0;
		
		do
		{
			System.out.println("enter any no : ");
			num=sc.nextInt();
			sum+=num;
			
			
		}while(num!=0);
		System.out.println("sum is : "+sum);
	}

}
