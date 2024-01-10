package com.forloop;

public class BreakContinue 
{
    public static void checkbreak()
    {
    	for(int i=1;i<=10;i++)
    	{
    		if(i==5)
    			break;
    		System.out.println(i);
    	}	
    }
    public static void checkcontinue()
    {
    	for(int i=1;i<=10;i++)
    	{
    		if(i==5)
    			continue;
    		System.out.println(i);
    	}	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        checkbreak();
        checkcontinue();
	}

}
