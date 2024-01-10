package com.twodimensionalarray;

import java.util.Scanner;

public class Array2D
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      int a[][]=new int [2][3];
      
      System.out.println("enter elements:");
      
      for(int i=0;i<2;i++)
      {
    	  for(int j=0;j<3;j++)
    	  {
    		 a[i][j]=sc.nextInt(); 
    	  }
      }
      System.out.println("------------------");
      for(int i=0;i<2;i++)
      {
    	  for(int j:a[i])
    	  {
           System.out.print(j+" ");
    	  }
    	  System.out.println();
      }
      //implicit array
      System.out.println("-----------------------");
      int a1[][]= {{1,2,3},{4,5,6},{9,8,7}};
      for(int i=0;i<a1.length;i++)
      {
    	  for(int j:a1[i])
    	  {
           System.out.print(j+" ");
    	  }
    	  System.out.println();
      }
     }

}

