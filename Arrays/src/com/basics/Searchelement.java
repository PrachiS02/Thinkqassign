package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Searchelement
{
	 
     public static boolean searchelements(int a[],int num)
     {
    	
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]==num)
    	   {
    		   return true;
    	   }
    	   
       }
       return false;
    	 
     }
	public static void main(String[] args)
     {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       
       
       int a[]=new int[5];
       System.out.println("enter the elements:");
      
      
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();   
    	   
       }
       System.out.println(Arrays.toString(a));
       
       System.out.println("enter the number to search:");
       int num=sc.nextInt();
       
       if(searchelements(a,num))
       {
    	   System.out.println(num+" element is present in array");
       }
       else
       {
    	   System.out.println(num+" element is not  present in array");
       }
      }
	}



