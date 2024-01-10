package com.forloop;

public class Producteven 
{
    public static int product(int num)
    {
    	int pro=1;
		for(int i=1;i<=num;i++)
		{ 
			if(i%2==0)
			   pro=pro*i;
			 
		}	
    	
    	return pro;
    	
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         System.out.println("sum of even product : "+product(5));
	}

}
