package com.loop;

public class BreakUse 
{
	public static void checkbreak()
    {
    	for(int i=10;i<=20;i++)
    	{
    		if(i==15)
    			break;
    		System.out.println(i);
    	}	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           checkbreak();
	}

}
