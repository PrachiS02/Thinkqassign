package com.loop;

import java.util.Scanner;

public class Disarum
{
    public static void disarumNumber(int n)
    {
    	int num = 0,digcnt = 0, orgnum=num,sum=0;
    	while(num!=0)
    	{
    		num/=10;
			digcnt++;
    		
    	}
    	num=orgnum;
    	while(num!=0)
    	{
    		int d=num%10;
    		sum+=Math.pow(digcnt, d);
    		digcnt--;
    		num/=10;
    		
    	}
    	if(sum==orgnum)
    	    System.out.println(+n+ " is Disarum Number");
    	else
    		System.out.println( +n+" is not Disarum Number");
		
    			
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the number : ");
       int n=sc.nextInt();
       disarumNumber(n);
	}

}
