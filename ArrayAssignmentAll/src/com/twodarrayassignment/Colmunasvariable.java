package com.twodarrayassignment;

import java.util.Scanner;

public class Colmunasvariable 
{
    	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter num of columns:");
        int numcol=sc.nextInt();
          int ar[][]=new int[3][numcol];
          System.out.println("enter the elements:");
          
          for(int i=0;i<3;i++)
          {
        	  for(int j=0;j<numcol;j++)
        	  {
        		  ar[i][j]=sc.nextInt();
        		  
        	  }
          }
          System.out.println("------------------------");
          for(int i=0;i<3;i++)
          {
        	  for(int s:ar[i])
        	  {
        		 System.out.print(s+" ");
        		  
        	  }
        	  System.out.println();
          }
               
           
	}

}
