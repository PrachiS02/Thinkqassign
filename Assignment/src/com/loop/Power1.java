package com.loop;

import java.util.Scanner;

public class Power1 {
	public static int baseindex(int base,int power)
    {
    	 int result=1;
    	for(int i=1;i<=power;i++)
    	{
    		result*=base;
    	}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter the base : ");
	       int base=sc.nextInt();
	       System.out.println("enter the power : ");
	       int power=sc.nextInt();
	       
	      System.out.println("power: "+baseindex( base, power));
	}

}
