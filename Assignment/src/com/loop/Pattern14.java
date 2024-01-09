package com.loop;

public class Pattern14 
{
     public static void alphabet()
     {
    	 int alphabet = 65;  
    	for (int i = 0; i <= 8; i++)  
    	{  
      
    	for (int j = 0; j <= i; j++)  
    	{  
    	  
    	System.out.print((char) (alphabet + j) + " ");   
    	}  
    	System.out.println();  
    	}  
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphabet();
	}

}
