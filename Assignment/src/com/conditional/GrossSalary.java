package com.conditional;

import java.util.Scanner;

public class GrossSalary 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		float hra,da,gs,bs;
		System.out.println("Enter the basic salary : ");
		bs=sc.nextInt();
		
		if(bs<=10000)
		{
			hra=bs*20/100;
			da=bs*80/100;
		}
		else if(bs<=20000)
		{
		   hra=bs*25/100;
		   da=bs*90/100;
		}
		else
		{
			hra=bs*30/100;
			da=bs*95/100;
		}
		
		gs=bs+hra+da;

	    System.out.println("Gross Salary : "+gs);
		
		

	}

}
