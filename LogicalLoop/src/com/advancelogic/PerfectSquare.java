package com.advancelogic;

import java.util.Scanner;

public class PerfectSquare 
{
    public static boolean perfect(int n)
    {
   
    	for(int i=1;i<=n;i++)
    	{
    		if((i*i)==n)
    		{
    			System.out.println(i+"*"+i+"="+n);
               return true;
    		}
    	}
    	return false;
    	
   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your number : ");
         int num=sc.nextInt();
         if(perfect(num))
        	 System.out.println(num+" is perfect square number ");
         else
        	 System.out.println(num+" is perfect square number ");
        	 
         
	}

}
