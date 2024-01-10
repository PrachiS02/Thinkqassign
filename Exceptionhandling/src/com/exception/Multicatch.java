package com.exception;

import java.util.Scanner;

public class Multicatch {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       
       try
       {
    	   int a[]=new int[3];
    	   System.out.println("enter array elemnts");
    	   
    	   for(int i=0;i<a.length;i++)
    	   {
    		   a[i]=sc.nextInt();
    	   }
    	   
    	   System.out.println("-----------------");
    	   
    	   for(int i=0;i<a.length;i++)
    	   {
    		   System.out.println("value:"+100/a[i]);
    	   }
    	  //we can not or Exception/Runtime exception
       }catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println(e+"Array elements is zero");
    	   
       }
       
       catch(Exception e)
       {
    	   System.out.println(e+"other");
    	   
       }
	}

}
