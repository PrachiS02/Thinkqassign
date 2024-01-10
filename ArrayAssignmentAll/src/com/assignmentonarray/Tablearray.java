//20. Accept number from user and add table of number in array and display
package com.assignmentonarray;

import java.util.Arrays;
import java.util.Scanner;

public class Tablearray
{
   public static void showtable(int n, int[] a)
   {
	   int index=0;
	   for(int i=0;i<=10;i++)
	   {
//		   System.out.println(+(n*i)); 
		   a[index]=n*i;
		   index++;   
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
         int n=sc.nextInt();
         
         int a[]=new int[10]; 
         showtable(n,a);
         System.out.println(Arrays.toString(a));
         
	}

}
