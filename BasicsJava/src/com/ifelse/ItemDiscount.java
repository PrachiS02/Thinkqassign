package com.ifelse;

import java.util.Scanner;

public class ItemDiscount
{

	public static void main(String[] args)
	{
		// disc 10%
		// total price>2000
		//total items>10
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of items : ");
		int noOfItems=sc.nextInt();
		
		System.out.println("enter the cost per items : ");
		double costPerItem=sc.nextDouble();
		
		double total=noOfItems*costPerItem;
		
		if((noOfItems>10)&&(total>2000))
		{
			System.out.println("total bill "+total);
			System.out.println("discount offered : 10% ");
			total=total-(0.1*total);
		}
		
		System.out.println("amount to pay"+total);
		sc.close();
	}

}
