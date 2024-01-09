package com.conditional;

import java.util.Scanner;

public class ElectricityBill
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double unit,amt,total,surchrg;
		
		System.out.println("enter the units : ");
		unit=sc.nextFloat();
		
        if(unit<=50)
        {
        	amt=unit*0.50;
        }
        else if(unit<=150)
        {
        	amt=25+(unit-50)*0.75;
        }
        else if(unit<=250)
        {
        	amt=100+(unit-150)*1.20;
        }
        else
        {
        	amt=220+(unit-250)*1.50;
        }
        
        surchrg=amt*0.20;
        total=surchrg+amt;
	
	  System.out.println("electricity bill : "+total);
	}
}
