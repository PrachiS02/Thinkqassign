//13. WAP to replace all negative value with its immediate left elements square. Means  
//arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
//Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. 
package com.assignmentonarray;

import java.util.Arrays;

public class Squarereplace
{
    public static void replacenegsquare(int a[])
    {
  
    	for(int i=0;i<a.length;i++)
    	{
    		
    		if(a[i]<0 && i!=0)
    		{
    			a[i]=a[i-1]*a[i-1];
    		}
    		
         }

    }

	public static void main(String[] args) 
	{
		int a[]= {-12, 3, -19, 29, 5, -61, 44, 7, -9};
//		for(int i:a)
//		{
//			System.out.print(i+" ");
//		}
		 System.out.println(Arrays.toString(a));
		//System.out.println(" ");
		System.out.println("aftre the converting negative with square:");
		replacenegsquare(a);
		System.out.println(Arrays.toString(a));

	}

}
