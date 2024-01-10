package com.Arrayassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Insertelement 
{
	public static void insertelement(int a[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the element:");
		int num = sc.nextInt();

		System.out.println("enter the position:");
		int pos = sc.nextInt();
        int size=a.length-1;

		for (int i =size; i>=pos; i--)
		{
	        a[i]=a[i-1];
	        //break;
		}
         a[pos]=num;
     
         for(int i=0;i<a.length;i++)
         {
        	 System.out.print(a[i]+" ");
         }
       
	}

	public static void main(String[] args) 
	{
		
		int a[] = { 1, 2,3,4,5,6};
		System.out.println(Arrays.toString(a));
		insertelement(a);
		
	

	}

}
