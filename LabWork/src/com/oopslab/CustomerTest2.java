package com.oopslab;

import java.util.Scanner;

public class CustomerTest2
{
	static Scanner sc=new Scanner (System.in);
	public static void addCustomer(Customer c)
	{
		System.out.println("Enter Customer Id : ");
		c.setcid(sc.nextInt());
		
		System.out.println("Enter Customer name : ");
		c.setcname(sc.next());
		
		System.out.println("Enter Customer email : ");
		c.setcemail(sc.next());
		
		System.out.println("Enter Customer contact : ");
		c.setccontact(sc.nextInt());
		
		System.out.println("Enter Customer password : ");
		c.setcpass(sc.next());		
		
		
	}
	
	public static void displayCustomer(Customer c)
	{
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		Customer c1=new Customer();
		addCustomer(c1);
		displayCustomer(c1);
		

	}

}
