package com.loop;

public class Series2468
{
    public static void series()
    {
    	  int x=1;
    	   for(int i=1;i<=10;i++)
    	   {
            if(i%2==0)
            	x=-i*2;
            else
            	x=+i*2;
    	   }
    	   System.out.println(""+x);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		series();
	}

}
