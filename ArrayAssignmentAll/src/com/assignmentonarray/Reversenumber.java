//3. WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
//output must be 78, 37, 29, 45, 90, 3 
package com.assignmentonarray;

import java.util.Arrays;
import java.util.Scanner;

public class Reversenumber
{
     public static void reverseOrder(int a[])
     {
    	 System.out.println("Array in reverse order:");
    	 for(int i=a.length-1;i>=0;i--)
    	 {
    		 System.out.println(a[i]+" ");
    		
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
         reverseOrder(a);
	}

}
