package com.advancelogic;

import java.util.Scanner;

public class Factors
{
    public static void findfactnum(int n)
    {
    do
    {
    	for(int i=1;i<=n;i++)
    	{
    		if(n%i==0)
    			System.out.println(i);
    	}
    }while(n!=0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number : ");
      int num=sc.nextInt();
      findfactnum(num);
	}

}
