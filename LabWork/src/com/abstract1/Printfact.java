package com.abstract1;

public class Printfact 
{
    public static int fact(int n)
    {
    	int fact=1;
    	while(n!=0)
    	{
    		fact*=n;
    		n--;
    	}
    	return fact;
    }
	public static void main(String[] args)
	{
	
		for(int i=1;i<=10;i++)
      System.out.println("factorail of:"+i+"="+fact(i));
	}

}
