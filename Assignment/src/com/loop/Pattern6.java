package com.loop;

public class Pattern6 
{
	public static void pattern()
	{
	 for(int i=1;i<=8;i++)
	   {
		   
		   for(int j=8-i;j>=1;j--)
		   {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print("*");
		   }
		   System.out.println("");
	   }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern();
	}

}
