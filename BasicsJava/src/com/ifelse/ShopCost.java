package com.ifelse;

import java.util.Scanner;

public class ShopCost {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   double total;
	   int cost=100;
	   
	   System.out.println("enter the number of quanity : ");
	   int qty=sc.nextInt();
	   total=qty*cost;
	   if(total>1000)
	   {
		   total=total-(0.1*total);
	   }
	   System.out.println("total cost is : "+total);
	   
       
	}

}
