package com.advancelogic;

import java.util.Scanner;

public class Sumreachesonedigit
{
    public static int reducenum(int n)
    {
    	int sum=0;
    	while(n>0 || sum>9)
    	{
    		if(n==0)
    		{
    			n=sum;
    			sum=0;
    			
    		}
    		sum=sum+(n%10);
    		n/=10;
    		
    	}
    	return sum;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number : ");
     int n=sc.nextInt();
     System.out.println("reduce number :"+reducenum(n));
	}

}
