package com.loop;

import java.util.Scanner;

public class ProductNum 
{
    public static int productNumber(int n)
    {
    
    	int pro=1;
    
    	while(n!=0)
    	{
    		pro*=(n%10);
    		n/=10;
    		
    	}
		return pro;
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number : ");
    	int n=sc.nextInt();
		System.out.println("product : "+ productNumber(n));
		

	}

}
