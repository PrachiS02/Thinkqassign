package com.oopslab;

import java.util.Scanner;

public class Patterns
{
    public void pattern1(int row)
    {
      for(int i=1;i<=row;i++)
      {
    	  for(int sp=1;sp<=row-i;sp++)
    	  {
    	  System.out.print(" ");
    	  }
      
      for(int j=1;j<=i;j++)
      {
    	  if(j==1)
    	  {
    		  System.out.print("*");
    	  }
    	  else
    	  {
    		  System.out.print(" ");
    	  }
      }
      System.out.println();
    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
