package com.loop;

public class Pattern16
{
   public static void triangleLetter()
   {
	   for (int i = 0; i <= 8; i++)   
	   {  
	   int alphabet = 65;   
	   for (int j = 8; j > i; j--)  
	   {  
	   System.out.print(" ");  
	   }  
	   for (int k = 0; k <= i; k++)  
	   {  
	   System.out.print((char) (alphabet + k) + " ");  
	   }  
	   System.out.println();  
	   }  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangleLetter();
	}

}
