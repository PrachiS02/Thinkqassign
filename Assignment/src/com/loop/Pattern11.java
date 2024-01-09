package com.loop;

public class Pattern11
{
   public static void number()
   {
	   int i, j, k = 1;  
	 
	 for (i = 1; i <= 7; i++)   
	 {  
	 
	 for (j = 1; j< i + 1; j++)   
	 {  
	 
	 System.out.print(k++ + " ");  
	 }  
	  
	 System.out.println();  
	 }  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number();
	}

}
