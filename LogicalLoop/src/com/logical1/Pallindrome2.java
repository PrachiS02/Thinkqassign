package com.logical1;

import java.util.Scanner;

public class Pallindrome2
{
    public static boolean checkpallindrome(int num)
    {
    	int orgn=num;
    	int revnum=0;
    	do
    	{
    		int rem=num%10;
    		revnum=(revnum*10)+rem;
    		num/=10;
    	}while(num!=0);
    	
    	if(orgn==revnum)
    		return true;
    	else
    		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        if(checkpallindrome(n))
        	System.out.println(n+" is pallindrome number");
        else
        	System.out.println(n+" is not  pallindrome number");
	}

}
