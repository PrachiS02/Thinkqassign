//4. WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
//37, 29, 45, 90, 3] by using temporary array.
package com.assignmentonarray;

import java.util.Arrays;
import java.util.Scanner;

public class Tempusereversenum 
{
    public static void usingtemp(int a[])
    {
    	 int reva[]=new int[a.length];
    	 int index=0;
    	for(int i=a.length-1;i>=0;i--)
    	{
    	
    		if(index<reva.length)
    		{
    			reva[index]=a[i];
    			index++;
 		
    		}
    	}
    		for(int j=0;j<reva.length;j++)
    		{
    		System.out.print(reva[j]+" ");
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 Scanner sc=new Scanner(System.in);
         System.out.println("enter the array elements:");
         int a[]=new int[5];
         for(int i=0;i<a.length;i++)
         {
        	 a[i]=sc.nextInt();
         }
         System.out.println(Arrays.toString(a));
         usingtemp(a);
	}

}
