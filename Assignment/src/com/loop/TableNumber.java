package com.loop;

import java.util.Scanner;

public class TableNumber 
{
	public static void tables(int num)
	   {
		   for(int i=1;i<=10;i++)
		   {
			  
			   System.out.println(num+" X "+i+"="+(num*i));
		   }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		tables(n);
	}

}
