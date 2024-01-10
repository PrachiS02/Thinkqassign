package com.ifelse;

import java.util.Scanner;

public class IfElseLadder 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the percenatge : ");
		float per=sc.nextFloat();
		
		char grade;
		
		if(per>=90)
			grade='A';
		   else if(per>=75)
			     grade='B';
		        else if(per>=60)
			          grade='C';
		            else if(per>=40)
		        	       grade='D';
		                 else 
		            	     grade='F';
		
		    if(grade=='F')
		    	System.out.println("you have failed exam");
		    else
		    	System.out.println("you have passed exam : "+grade);
	}

}
