package com.Arrayassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Deleteelements
{
	static Scanner sc=new Scanner(System.in);
	  
	public static void deletelement(int a[])
	{
		System.out.println("enter the position:");
		int pos = sc.nextInt();
        int size=a.length;
       
		for (int i =(pos-1); i<size-1; i++)
		{
	        a[i]=a[i+1];
	       
		}
	
         size=size-1;
        
         for(int i=0;i<size;i++)
         {
        	System.out.println(a[i]+" "); 
         }

		 
	}
	 
	public static void main(String[] args) {
	

		int a[] = { 1, 2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(a));
	
		deletelement(a);
		//System.out.println("New array:"+Arrays.toString(a));
		
	}

}
