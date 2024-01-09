package com.loop;

import java.util.Scanner;

public class Pattern2 
{
	public static void patterns()
	  {
		 /*Scanner sc=new Scanner(System.in);
		   System.out.println("enter rows: ");
		   int rows=sc.nextInt();*/
		   
		   for(int i=1;i<=5;i++)
		   {
			   
			   for(int j=5-i;j>=1;j--)
			   {
				   System.out.print(" ");
			   }
			   for(int k=1;k<=i;k++)
			   {
				   System.out.print("*");
			   }
			   System.out.println("");
		   }
		   
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patterns();
	}

}
