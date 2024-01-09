package com.loop;

import java.util.Scanner;

public class Checkpallindrome
{
	public static int findreverse(int num)
    {
    	int revnum=0;
    	do
    	{
    		int rem=num%10;
    		revnum=(revnum*10)+rem;
    		num=num/10;
    	}while(num!=0);
    	
    	return revnum;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
        //System.out.println("reverse number " + n + " is :"+findreverse(n));
        int rev=findreverse(n);
        if(n==rev)
        	System.out.println(n+" is pallindrome ");
        else
        	System.out.println(n+" is not pallindrome ");
	}

}
