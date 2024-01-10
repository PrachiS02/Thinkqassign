//7. Write a Java program to find the common elements between two arrays (int values) 
//Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 
//66, 22], so common between two arrays are 23 and 91 
package com.assignmentonarray;

import java.util.Arrays;
import java.util.Scanner;

public class Commonelement 
{
	  public static void commonelement(int a1[],int a2[])
	  {
		  int count=0;
	    	for(int i=0;i<a1.length;i++)
	    	{
	    		 count=0;
	    		for(int j=0;j<a2.length;j++)
	    		{
	    			if(a1[i]==a2[j])
	    			{
	    				count++;
	    				//a2[j]=0;
	    			}
	    		}
	    		if(count>0)
	    		{
	    			System.out.println(a1[i]);
	    		}
	    	}
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a1[]= {12,23,34,67,1,91,65};
		 int a2[]= {39,23,25,1,3,19,65};
         System.out.println(Arrays.toString(a1));
         System.out.println(Arrays.toString(a2));
         commonelement(a1,a2);
	}

}
