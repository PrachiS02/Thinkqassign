package com.loop;

import java.util.Scanner;

public class Squares
{
  public static void squarenumber()
  {
	  int n,sq;
	  System.out.println("number\tsquare");
	  for(n=1;n<=20;n++)
	  {
		 sq=n*n;
		 System.out.println(+n+"\t"+sq);
	  }
	   
	  
  }

	public static void main(String[] args) {
		
      squarenumber();
	}

}
