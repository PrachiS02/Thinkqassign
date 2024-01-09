package com.switchassgn;

import java.util.Scanner;

public class PrintNum {

	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println(" number 1 to 5 : ");
	    int num=1;
	   
	   switch(num)
	   {
	   case 1 : 
		    System.out.println("1");
		   
	   case 2 : 
		    System.out.println("2");
		   
	   case 3 : 
		    System.out.println("3");
		   
	   case 4 : 
		    System.out.println("4");
		    
	   case 5 : 
		    System.out.println("5");
		    break;
		default :
			System.out.println("error");
			break;
	   }
	   
	   
	   

	}

}
