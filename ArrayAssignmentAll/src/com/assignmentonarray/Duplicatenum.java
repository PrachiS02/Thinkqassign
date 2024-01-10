//6. Write a Java program to find the duplicate values of an array of integer values. 
//Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78.
package com.assignmentonarray;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicatenum 
{
    public static void duplicatefind(int a[])
    {
    	int count=0;
    	for(int i=0;i<a.length;i++)
    	{
    		 count=0;
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]==a[j])
    			{
    				count++;
    				a[j]=0;
    			}
    		}
    
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner sc=new Scanner(System.in);
//         System.out.println("enter the array elements:");
//         int a[]=new int[5];
//         for(int i=0;i<a.length;i++)
//         {
//        	 a[i]=sc.nextInt();
//         }
		int a[]= {10,2,3,10,4,10};
         System.out.println(Arrays.toString(a));
         duplicatefind(a);
	}

}
