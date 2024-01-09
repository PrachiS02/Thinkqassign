package com.loop;

public class Patttern5 
{
    public static void pattern()
    {
    	int rows=7;      
     
    	for (int i= rows-1; i>=0 ; i--)  
    	{    
    	for (int j=0; j<=i; j++)  
    	{  
      
    	System.out.print("*" + " ");
    	}
    	System.out.println();  
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		pattern();
	}

}
